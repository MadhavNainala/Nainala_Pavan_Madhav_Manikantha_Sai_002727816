/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

import java.util.ArrayList;
/**
 *
 * @author pavanmadhavnainala
 */
public class Database {
    
    ArrayList<Patient> patient=new ArrayList<>();
   // ArrayList<Encounter> enc=new ArrayList<Encounter>();
   // ArrayList<Hospital> hosp=new ArrayList<Hospital>();
    //ArrayList<Person> person=new ArrayList<Person>();
    //ArrayList<Doctor> doctr=new ArrayList<Doctor>(); 
   // ArrayList<City> city=new ArrayList<City>();
    //ArrayList<Community> comm=new ArrayList<Community>();
   // ArrayList<HospitalAdmin> HAdmin=new ArrayList<HospitalAdmin>();
   // ArrayList<SystemAdmin> SAdmin=new ArrayList<SystemAdmin>();
   ArrayList<communityAdmin> comAdmin=new ArrayList<communityAdmin>();
   // ArrayList<House> house=new ArrayList<House>();
    ArrayList<VitalSigns> vital=new ArrayList<>();
    
    
  abstract class Person {
      
      String docID;
      String docName;
      String hospID;
      
      
      Person s = new Person() {
      
      };
      
      
      
      
      
  }  

    public ArrayList<VitalSigns> getVital() {
        return vital;
    }

    
    public void setVital(ArrayList<VitalSigns> vital) {
        this.vital = vital;
    }

    public ArrayList<communityAdmin> getComAdmin() {
        return comAdmin;
    }

    public void setComAdmin(ArrayList<communityAdmin> comAdmin) {
        this.comAdmin = comAdmin;
    }
    
    public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }

    
    
    
    
    
    public VitalSigns addNewVitals(){
        
        
        VitalSigns newVitals = new VitalSigns();
        vital.add(newVitals);
        return newVitals;
        
    }
    
    
    public void deleteVitals(VitalSigns vs){
        
        vital.remove(vs);
        
        
        
        
    }
    
    
    public communityAdmin addNewComAdmin(){
        
        
        communityAdmin newComAdmin = new communityAdmin();
        comAdmin.add(newComAdmin);
        return newComAdmin;
        
    }
    
    
    public void deleteComAdmins(communityAdmin cd){
        
        comAdmin.remove(cd);
        
        
        
        
    }
    
    
    
    public void createDummyPatient()
    {
        
        for(int i=0;i<5;i++)
        {
            String is = String.valueOf(i);
            this.patient.add(new Patient("ComName "+is, "CommId"+is, "cityId "+is, "cityId "+is, "cityId "+is, "cityId "+is, "cityId "+is));
        }
    }
    
    
    




}
