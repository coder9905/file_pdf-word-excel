package com.company.Gson.json;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String Stringzipcode;
    private Geo geos;

    public Address() {
    }

    public Address(String street, String suite, String city, String stringzipcode, Geo geos) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        Stringzipcode = stringzipcode;
        this.geos = geos;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStringzipcode() {
        return Stringzipcode;
    }

    public void setStringzipcode(String stringzipcode) {
        Stringzipcode = stringzipcode;
    }

    public Geo getGeos() {
        return geos;
    }

    public void setGeos(Geo geos) {
        this.geos = geos;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", Stringzipcode='" + Stringzipcode + '\'' +
                ", geos=" + geos +
                '}';
    }
}
