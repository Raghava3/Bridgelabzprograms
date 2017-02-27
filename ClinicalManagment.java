package com.clinic;
import java.util.ArrayList;

public class ClinicalManagment {
	
	public static void main(String[] args){
		FileUtility u = new FileUtility();
		int patientId = 1;
		AppointmentList appointment = new AppointmentList();

		ArrayList<DoctorsInfo> doctors = new ArrayList();
		ArrayList<PatientsInfo> patients = new ArrayList();

		//Creating doctors
		DoctorsInfo doctor1 = new DoctorsInfo("Dr. ABC",1,"Dental","Morning");
		DoctorsInfo doctor2 = new DoctorsInfo("Dr. XYZ",2,"Eyes","Morning");
		DoctorsInfo doctor3 = new DoctorsInfo("Dr. DEF",3,"Brain","Evening");
		DoctorsInfo doctor4 = new DoctorsInfo("Dr. GHI",4,"General","Morning/Evening");
		DoctorsInfo doctor5 = new DoctorsInfo("Dr. JKL",5,"Cancer","Evening");

		//Adding Doctors in ArrayList
		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
		doctors.add(doctor4);
		doctors.add(doctor5);

		//Adding patients and taking appointments
		PatientsInfo patient1 = new PatientsInfo("Mr. KLM",patientId,"9933446677",10);
		patients.add(patient1);
		appointment.takeAppoinment(patient1,1);
		patientId++;
		PatientsInfo patient2 = new PatientsInfo("Mr. MNO",patientId,"8844774498",15);
		patients.add(patient2);
		appointment.takeAppoinment(patient2,1);
		patientId++;
		PatientsInfo patient3 = new PatientsInfo("Mrs. PQR",patientId,"9745638827",20);
		patients.add(patient3);
		appointment.takeAppoinment(patient3,5);


		//Display Options to perform operations.
		boolean check = true;
		while(check){
			System.out.println("\n\nWelcome, Please choose Your Option");
			System.out.println("1.Doctors List\n2.Patients List\n3.Search Doctor\n4.Search Patient");
			System.out.println("5.Take Appoinment\n6.Show All Appointments\n7.Exit");
			int choice = u.inputInteger();			
			switch(choice){
				case 1:{
					System.out.println("List Of Available Doctors:");
					new DoctorsInfo().listOfDoctors(doctors);
					break;
				}
				case 2:{
					System.out.println("List of Patients in Clinic:");
					new PatientsInfo().listOfPatients(patients);
					break;
				}
				
				case 3:{
					System.out.println("Search Doctor By:");
					new DoctorsInfo().searchDoctor(doctors);
					break;
				}
				case 4:{
					System.out.println("Search Patient By:");
					new PatientsInfo().searchPatient(patients);
					break;
				}
				case 5:{
					//taking patient's info and appointment
					patientId++;
					boolean checkId = true;
					System.out.print("Please Enter Patient's Name: ");
					String name = u.inputString();
					System.out.print("Please Enter Phone number: ");
					String number = u.inputString();
					System.out.print("Please Enter Age: ");
					int age = u.inputInteger();

					PatientsInfo newPatient = new PatientsInfo(name,patientId,number,age);
					patients.add(newPatient);

					System.out.print("Please enter Doctors id: ");
					int docId = u.inputInteger();
					appointment.takeAppoinment(newPatient,docId);
					break;
				}
				case 6:{
					appointment.showAppointments();
					break;
				}
		
				case 7:{
					check = false;
					break;
				}
				default:{
					System.out.println("Wrong Choice!!");
					break;
				}
			}//end of switch
		}//end of while
		
	}

}
