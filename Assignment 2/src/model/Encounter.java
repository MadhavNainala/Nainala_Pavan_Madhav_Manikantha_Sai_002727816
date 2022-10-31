/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author madhav
 */
public class Encounter {
     
    String date;
    String pid;
    String did;
    String VitalId;
//    pid;
//    did;
//    vitalid;
   public Encounter()
   {
       
   }
    public Encounter(String date, String pid, String did, String VitalId) {
        this.date = date;
        this.pid = pid;
        this.did = did;
        this.VitalId = VitalId;
    }
    

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getVitalId() {
        return VitalId;
    }

    public void setVitalId(String VitalId) {
        this.VitalId = VitalId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
      
    @Override
    public String toString()
    {
        return pid;
    }
    
}
