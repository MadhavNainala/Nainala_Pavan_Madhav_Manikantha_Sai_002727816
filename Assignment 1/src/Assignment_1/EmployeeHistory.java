/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_1;

import java.util.ArrayList;

/**
 *
 * @author pavanmadhavnainala
 */
public class EmployeeHistory {
    
    private ArrayList<EmployeeList> directory;
    
    public EmployeeHistory()
    {
        this.directory = new ArrayList<EmployeeList>();
    }

    public ArrayList<EmployeeList> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<EmployeeList> directory) {
        this.directory = directory;
    }
    
    public EmployeeList addEmployee(){
        
        EmployeeList newEmployees = new EmployeeList();
        directory.add(newEmployees);
        return newEmployees;
        
        
        
    }
    
}
