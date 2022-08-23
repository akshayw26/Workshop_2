package com.hospitalpateintdetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HospitalMain {

    Scanner sc = new Scanner(System.in);
    static HashMap<String, Hospitals> hospitalMap = new HashMap<>();
    String hospitalName;
    ArrayList<Patients> patientList = new ArrayList<>();

    static Hospitals createNewHospital(String hospitalName) {
        Hospitals hospital = new Hospitals();
        hospitalMap.put(hospitalName, hospital);
        return hospital;
    }

    Patients createPatient() {
        Patients patient = new Patients();
        System.out.println("Enter patient name");
        patient.setPatientName(sc.next());
        System.out.println("Enter patient age");
        patient.setPatientAge(sc.nextInt());
        System.out.println("Enter patient city");
        patient.setPatientCity(sc.next());
        System.out.println("Enter patient state");
        patient.setPatientState(sc.next());
        System.out.println("Enter patient phone number");
        patient.setPatientPhoneNumber(sc.nextInt());
        patient.selectPatientDepartment();
        return patient;

    }

}
