/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Student {
    private String name = null;
    private int gender = 0;
    private String dob = null;
    private String address = null;
    private String emergencyContact = null;
    private ArrayList<Book> bookOrders = null;
    private ArrayList<String> tutorNotes = null;
    
    public Student(String name, int gender, String dob, String address, String emergencyContact){
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.emergencyContact = emergencyContact;
    }
    
    
    
}

