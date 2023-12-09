package com.example.planetas;

public class Planet {
    private String planetName, moonCount;
    private int planetImageRes;


    public Planet(String planetName, String moonCount, int planetImageRes) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImageRes = planetImageRes;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImageRes() {
        return planetImageRes;
    }

    public void setPlanetImageRes(int planetImageRes) {
        this.planetImageRes = planetImageRes;
    }
}
