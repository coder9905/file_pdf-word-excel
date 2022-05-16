package com.company.Gson.json;

public class Company {
    private String name;
    private String bs;

    public Company() {
    }

    public Company(String name, String bs) {
        this.name = name;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }
}
