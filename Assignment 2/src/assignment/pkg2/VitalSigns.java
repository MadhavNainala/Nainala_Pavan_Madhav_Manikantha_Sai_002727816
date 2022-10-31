/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

/**
 *
 * @author pavanmadhavnainala
 */
public class VitalSigns {
    
        private String date;
        private int pulse;
        private int age;
        private double bodyTemperature;
        private int respirationRate;
        private double bloodPressure;
        private String patientId;

    public String getDate() {
        return date;
    }

    public VitalSigns(String date, int pulse, int age, double bodyTemperature, int respirationRate, double bloodPressure) {
        this.date = date;
        this.pulse = pulse;
        this.age = age;
        this.bodyTemperature = bodyTemperature;
        this.respirationRate = respirationRate;
        this.bloodPressure = bloodPressure;
    }

    public VitalSigns() {
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
