package com.company.Gson.json;

public class Geo {
    private String lat;
    private String Ing;

    public Geo() {
    }

    public Geo(String lat, String ing) {
        this.lat = lat;
        Ing = ing;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getIng() {
        return Ing;
    }

    public void setIng(String ing) {
        Ing = ing;
    }

    @Override
    public String toString() {
        return "geo{" +
                "lat='" + lat + '\'' +
                ", Ing='" + Ing + '\'' +
                '}';
    }
}
