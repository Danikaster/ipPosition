package com.ip_position.ip_position.model;

public class IpPositionModel {
    private String ip;
    private String continent;
    private String country;
    private String city;
    private Double latitude;
    private Double longitude;

    public IpPositionModel() {
        this.ip = null;
        this.continent = null;
        this.country = null;
        this.city = null;
        this.latitude = null;
        this.longitude = null;
    }

    public String getIp() {
        return ip;
    }

    public String getContinent() {
        return continent;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "IpPositionModel{" +
                "ip='" + ip + '\'' +
                ", continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
