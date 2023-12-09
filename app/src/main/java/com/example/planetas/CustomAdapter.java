package com.example.planetas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetsList;

    Context context;

    public CustomAdapter(ArrayList<Planet> planetsList, Context context) {
        super(context, R.layout.item, planetsList);
        this.planetsList = planetsList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planet = getItem(position);
        MyViewHolder vh;
        final View result;
        if (convertView == null){
            vh = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item, parent, false);

            vh.planetName = (TextView) convertView.findViewById(R.id.planet);
            vh.moonCount = (TextView) convertView.findViewById(R.id.moonCnt);
            vh.image = (ImageView) convertView.findViewById(R.id.image);

            result = convertView;

            convertView.setTag(vh);
        }else {
            vh = (MyViewHolder) convertView.getTag();
            result = convertView;

        }
            vh.planetName.setText(planet.getPlanetName());
            vh.moonCount.setText(planet.getMoonCount());
            vh.image.setImageResource(planet.getPlanetImageRes());

            return result;
    }

    private static class MyViewHolder{
        TextView planetName, moonCount;
        ImageView image;
    }
}
