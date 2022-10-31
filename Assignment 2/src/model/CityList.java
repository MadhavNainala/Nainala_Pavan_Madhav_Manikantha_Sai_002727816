/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author madhav
 */
public class CityList {
    
    private ArrayList<City> ciList;
    private DataService ds;
    public  CityList(DataService ds) { 
        this.ciList = ds.getCity();
        this.ds = ds;
//      this.ciList = new ArrayList<City>();
    }

    public ArrayList<City> getCiList() {
        return ciList;
    }

    public void setCiList(ArrayList<City> ciList) {
        this.ciList = ciList;
    }
    
    public City addNewCity() {
        City newCity = new City();
        this.ciList.add(newCity);
        return newCity;
        
    }

    public void deleteCity(City ci) {

        this.ciList.remove(ci);

    }
    
}
