package com.sdwdw.myapplication.model;

import java.util.Arrays;

public class HolidayItem {
    // your response object is uncorrect at all ok?why
    private String id;
    private String price;
    private String totalDuration;
    private long stops;
    private String[] airlineLogo;
    private String logoCover;
    private String[] depCityName;
    private String[] arrCityName;
    private String[] depDateAndTime;
    private String[] arrDateAndTime;
    private String[] airlineName;
    private String[] flightNumber;
    private String[] layOverTime;
    private long[] layOverMinutes;
    private String[] layOverCity;
    private String[] arrAirportName;
    private String[] flightModel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(String totalDuration) {
        this.totalDuration = totalDuration;
    }

    public long getStops() {
        return stops;
    }

    public void setStops(long stops) {
        this.stops = stops;
    }

    public String[] getAirlineLogo() {
        return airlineLogo;
    }

    public void setAirlineLogo(String[] airlineLogo) {
        this.airlineLogo = airlineLogo;
    }

    public String getLogoCover() {
        return logoCover;
    }

    public void setLogoCover(String logoCover) {
        this.logoCover = logoCover;
    }

    public String[] getDepCityName() {
        return depCityName;
    }

    public void setDepCityName(String[] depCityName) {
        this.depCityName = depCityName;
    }

    public String[] getArrCityName() {
        return arrCityName;
    }

    public void setArrCityName(String[] arrCityName) {
        this.arrCityName = arrCityName;
    }

    public String[] getDepDateAndTime() {
        return depDateAndTime;
    }

    public void setDepDateAndTime(String[] depDateAndTime) {
        this.depDateAndTime = depDateAndTime;
    }

    public String[] getArrDateAndTime() {
        return arrDateAndTime;
    }

    public void setArrDateAndTime(String[] arrDateAndTime) {
        this.arrDateAndTime = arrDateAndTime;
    }

    public String[] getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String[] airlineName) {
        this.airlineName = airlineName;
    }

    public String[] getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String[] flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String[] getLayOverTime() {
        return layOverTime;
    }

    public void setLayOverTime(String[] layOverTime) {
        this.layOverTime = layOverTime;
    }

    public long[] getLayOverMinutes() {
        return layOverMinutes;
    }

    public void setLayOverMinutes(long[] layOverMinutes) {
        this.layOverMinutes = layOverMinutes;
    }

    public String[] getLayOverCity() {
        return layOverCity;
    }

    public void setLayOverCity(String[] layOverCity) {
        this.layOverCity = layOverCity;
    }

    public String[] getArrAirportName() {
        return arrAirportName;
    }

    public void setArrAirportName(String[] arrAirportName) {
        this.arrAirportName = arrAirportName;
    }

    public String[] getFlightModel() {
        return flightModel;
    }

    public void setFlightModel(String[] flightModel) {
        this.flightModel = flightModel;
    }


    @Override
    public String toString() {
        return "HolidayItem{" +
                "id='" + id + '\'' +
                ", price='" + price + '\'' +
                ", totalDuration='" + totalDuration + '\'' +
                ", logoCover='" + logoCover + '\'' +
                ", depCityName=" + Arrays.toString(depCityName) +
                '}';
    }
}