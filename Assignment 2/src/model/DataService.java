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
public class DataService {
    ArrayList<Patient> patient=new ArrayList<Patient>();
    ArrayList<Encounter> enc=new ArrayList<Encounter>();
    ArrayList<Hospital> hosp=new ArrayList<Hospital>();
    ArrayList<Community> comm=new ArrayList<Community>();
    ArrayList<Doctor> doctr=new ArrayList<Doctor>();
    //ArrayList<Person> person=new ArrayList<Person>();
     
    ArrayList<City> ciList=new ArrayList<City>();
    
    ArrayList<HospitalAdmin> HAdmin=new ArrayList<HospitalAdmin>();
    ArrayList<SystemAdmin> SAdmin=new ArrayList<SystemAdmin>();
    ArrayList<CommunityAdmin> CAdmin=new ArrayList<CommunityAdmin>();
    ArrayList<House> house=new ArrayList<House>();
    ArrayList<VitalSigns> vital=new ArrayList<VitalSigns>();


   public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }

    public ArrayList<Encounter> getEnc() {
        return enc;
    }

    public void setEnc(ArrayList<Encounter> enc) {
        this.enc = enc;
    }

    public ArrayList<Hospital> getHosp() {
        return hosp;
    }

    public void setHosp(ArrayList<Hospital> hosp) {
        this.hosp = hosp;
    }
    
    public Hospital addNewHosp(){
        Hospital newhosp = new Hospital();
        hosp.add(newhosp);
        return newhosp;
    }
    
    public void deleteHosp(Hospital selectedHospital){
        hosp.remove(selectedHospital);
    }

    public ArrayList<CommunityAdmin> getCAdmin() {
        return CAdmin;
    }

    public void setCAdmin(ArrayList<CommunityAdmin> CAdmin) {
        this.CAdmin = CAdmin;
    }
   
    public ArrayList<HospitalAdmin> getHospAdmin() {
        return HAdmin;
    }

    public void setHospAdmin(ArrayList<HospitalAdmin> HAdmin) {
        this.HAdmin = HAdmin;
    }
    
    public HospitalAdmin addNewHospAdmin(){
        HospitalAdmin newhpad = new HospitalAdmin();
        HAdmin.add(newhpad);
        return newhpad;
    }
    
    public void deleteHospAdmin(HospitalAdmin selectedHospitalAdmin){
        HAdmin.remove(selectedHospitalAdmin);
    }
    
    /*public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }*/

    public ArrayList<Doctor> getDoctr() {
        return doctr;
    }

    public void setDoctr(ArrayList<Doctor> doctr) {
        this.doctr = doctr;
    }
    
    public Doctor addNewDoc(){
        Doctor newdoc = new Doctor();
        doctr.add(newdoc);
        return newdoc;
    }

    public void deleteDoc(Doctor selectedDoctor){
        doctr.remove(selectedDoctor);
    }

    public ArrayList<City> getCity() {
        return ciList;
    }

    public void setCity(ArrayList<City> city) {
        this.ciList = ciList;
    }

    public ArrayList<Community> getCommunity() {
        return comm;
    }

    public void setCommunity(ArrayList<Community> comm) {
        this.comm = comm;
    }
    public Community addCdata(){
        Community newcomm = new Community();
        comm.add(newcomm);
        return newcomm;
    }
    
    public void deleteCdata(Community c){
        comm.remove(c);
    }
    
    public VitalSigns addNewVitals(){
        
        
        VitalSigns newVitals = new VitalSigns();
        vital.add(newVitals);
        return newVitals;
        
    }

    public ArrayList<Community> getComm() {
        return comm;
    }

    public void setComm(ArrayList<Community> comm) {
        this.comm = comm;
    }

    public ArrayList<HospitalAdmin> getHAdmin() {
        return HAdmin;
    }

    public void setHAdmin(ArrayList<HospitalAdmin> HAdmin) {
        this.HAdmin = HAdmin;
    }

    public ArrayList<SystemAdmin> getSAdmin() {
        return SAdmin;
    }

    public void setSAdmin(ArrayList<SystemAdmin> SAdmin) {
        this.SAdmin = SAdmin;
    }

    public ArrayList<House> getHouse() {
        return house;
    }

    public void setHouse(ArrayList<House> house) {
        this.house = house;
    }

    public ArrayList<VitalSigns> getVital() {
        return vital;
    }

    public void setVital(ArrayList<VitalSigns> vital) {
        this.vital = vital;
    }
    
    
     public void deleteVitals(VitalSigns vs){
        
        vital.remove(vs);
        
        
        
        
    }
     
    public void createDummyComm()
    {
        
        for(int i=0;i<5;i++)
        {
            String is = String.valueOf(i);
            this.comm.add(new Community("ComName "+is, "CommId"+is, "cityId "+is));
        }
    }
    
    public void createDummyPatient()
    {
        
        for(int i=0;i<5;i++)
        {
            String is = String.valueOf(i);
            this.patient.add(new Patient("ComName "+is, "CommId"+is, "cityId "+is, "cityId "+is, "cityId "+is, "cityId "+is, "cityId "+is));
        }
    }
     public void AddVitals(VitalSigns v)
    {
        this.vital.add(v);
    }
    public void delVitals(VitalSigns v)
    {
        this.vital.remove(v);
    }
   
    public void addEncounter(Encounter e)
    {
        this.enc.add(e);
    }
    public void delEncounter(Encounter e)
    {
        this.enc.remove(e);
    }
    public void addPatient(Patient patient) {
        this.patient.add(patient);
    }
    
    public void deletePatient(Patient p)
    {
        this.patient.remove(p);
    }
    
    public City addNewCity() {
        City newCity = new City();
        this.ciList.add(newCity);
        return newCity;
        
    }

    public void deleteCity(City ci) {

        this.ciList.remove(ci);

    }
    
   public SystemAdmin addNewSysA(){
        SystemAdmin newsys = new SystemAdmin();
        this.SAdmin.add(newsys);
        return newsys;
    }
    
    public void deleteSysA(SystemAdmin selectedSysA){
        this.SAdmin.remove(selectedSysA);
    }
     
    
}
