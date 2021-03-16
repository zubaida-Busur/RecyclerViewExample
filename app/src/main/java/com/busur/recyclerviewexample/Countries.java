package com.busur.recyclerviewexample;

public class Countries {

    private  String cityUrl;
    private String cityName;
    private  String countryName;

    public Countries(String cityUrl, String cityName, String countryName) {
        this.cityUrl = cityUrl;
        this.cityName = cityName;
        this.countryName = countryName;
    }

    public String getCityUrl() {
        return cityUrl;
    }

    public void setCityUrl(String cityUrl) {
        this.cityUrl = cityUrl;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
