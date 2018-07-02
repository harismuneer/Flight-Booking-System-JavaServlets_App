/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author MuhammadHarris
 */
public class Employee extends Person {
    
    String employeeDesignation;
    
    
    public Employee(String f, String e, String d)
    {
        super(f,e);
        employeeDesignation = d;
    }
}
