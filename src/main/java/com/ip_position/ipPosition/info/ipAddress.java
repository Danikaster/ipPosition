package com.ip_position.ipPosition.info;

public class ipAddress {
    private Long id;
    private String continent;
    private String country;
    private String city;
    private Double latitude;
    private Double longitude;

    public ipAddress() {
    }

    public ipAddress(Long id, String continent, String country, String city, Double latitude, Double longitude) {
        this.id = id;
        this.continent = continent;
        this.country = country;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public ipAddress(String continent, String country, String city, Double latitude, Double longitude) {
        this.continent = continent;
        this.country = country;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "ipInfo{" +
                "continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
