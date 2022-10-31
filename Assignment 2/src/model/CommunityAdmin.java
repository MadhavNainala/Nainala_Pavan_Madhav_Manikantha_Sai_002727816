/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author madhav
 */
public class CommunityAdmin {
   private String id;
    private String userName;
    private String password;
    private String name;
    
    

    public CommunityAdmin(String id, String userName, String password, String name) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
    }

    public CommunityAdmin() {
         this.id = "123";
        this.userName = "XYZ";
        this.password = "ZSE";
        this.name = "madhav";
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    @Override
    public String toString(){
        
        return id;
    }
    
}
