package com.workshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    public static Scanner sc= new Scanner(System.in);
    public ArrayList<patientDetails> patientdetails = new ArrayList<patientDetails>();
    public void addPatient(){
        System.out.println("Enter the patient name : ");
        String name=sc.next();

        System.out.println("Enter the city : ");
        String city=sc.next();

        System.out.println("Enter the state : ");
        String state=sc.next();

        System.out.println("Enter the department : ");
        String department=sc.next();

        System.out.println("Enter the mobile no : ");
        String phoneNo=sc.next();

        System.out.println("Enter the patient age : ");
        String age=sc.next();

        patientdetails.add(new patientDetails(name,city,state,department,phoneNo,age));
    }
    public void displayPatientRecord(){
        if (patientdetails.isEmpty()){
            System.out.println("No records");
        }
        else {
            for (patientDetails patient : patientdetails){
                System.out.println(patient);
            }
        }
    }
    public static void main(String[] args){
        Hospital hospital=new Hospital();
        boolean flag=true;
        while(flag){
            System.out.println("1. add patient");
            System.out.println("2. display");

            int ch =sc.nextInt();
            switch (ch)
            {
                case 1: hospital.addPatient();
                        break;
                case 2: hospital.displayPatientRecord();
                        break;
                case 3: flag=false;
                        break;
            }
        }
    }
}
