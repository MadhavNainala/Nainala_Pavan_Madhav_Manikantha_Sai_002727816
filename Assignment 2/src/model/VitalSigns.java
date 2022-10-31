/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author madhav
 */
public class VitalSigns {
     private String date;
        private int pulse;
        private int age;
        private double bodyTemperature;
        private int respirationRate;
        private double bloodPressure;
        private String patientId;
        private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public VitalSigns(String date, int pulse, int age, double bodyTemperature, int respirationRate, double bloodPressure, String patientId) {
        this.date = date;
        this.pulse = pulse;
        this.age = age;
        this.bodyTemperature = bodyTemperature;
        this.respirationRate = respirationRate;
        this.bloodPressure = bloodPressure;
        this.patientId = patientId;
    }

    public VitalSigns() {
        this.date = "12-10-2022";
        this.pulse = 94;
        this.age = 50;
        this.bodyTemperature = 100;
        this.respirationRate = 78;
        this.bloodPressure = 120;
        this.patientId = "123";
    }
     
        
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    
    
    @Override
    public String toString(){
        
        return date;
    }
}
