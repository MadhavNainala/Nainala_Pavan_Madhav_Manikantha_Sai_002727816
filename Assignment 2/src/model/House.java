/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author madhav
 */
public class House {
     private String houseName;
    private String houseId;
    private String communityId;

    public House(String houseName, String houseId, String communityId) {
        this.houseName = houseName;
        this.houseId = houseId;
        this.communityId = communityId;
    }

    public House() {
        this.houseName = "jashn";
        this.houseId = "9876";
        this.communityId = "345";
    }
    
    
    
    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouselId() {
        return houseId;
    }

    public void setHouselId(String houselId) {
        this.houseId = houselId;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }
    
    @Override
    public String toString(){
        return houseName;
    }
    
}
