package com.javaTpoint.P5DISI;

public class Address {
    private String locality, area;

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Override
    public String toString() {
        return "Address : {" +
                "\n\t\tlocality='" + locality + '\'' +
                ",\n\t\tarea='" + area + '\'' +
                "\n\t\t}";
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
