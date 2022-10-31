/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author madhav
 */
public class City {
    private String cityName; 
    private String cityId;

    public City() {
        this.cityName = "Hyderabad";
        this.cityId = "123";
    }

    public City(String cityName, String cityId) {
        this.cityName = cityName;
        this.cityId = cityId;
    }
    
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    
    @Override
    public String toString(){
        return cityName;
    }
    
    
    
}
