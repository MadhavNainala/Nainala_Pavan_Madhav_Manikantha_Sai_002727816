/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author madhav
 */
public class Community {
    String communityName;
    String communityID;
    // code needed list(city)
    String cityID;
    // code needed list(city)

    public Community() {
        this.communityName = "ST Alphonsus";
        this.communityID = "123";
        this.cityID = "123 - Hyderabad";
    }

    public Community(String community, String communityID, String cityID) {
        this.communityName = communityName;
        this.communityID = communityID;
        this.cityID = cityID;
    }
    
    
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String community) {
        this.communityName = community;
    }

    public String getCommunityID() {
        return communityID;
    }

    public void setCommunityID(String communityID) {
        this.communityID = communityID;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }
    
    @Override
    public String toString(){
        return communityName;
        
    }
    
}
