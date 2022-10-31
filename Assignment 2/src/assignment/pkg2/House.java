/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

/**
 *
 * @author harshinichandrika
 */
public class House {
    private String houseName;
    private String houseId;
    private String communityId;

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
