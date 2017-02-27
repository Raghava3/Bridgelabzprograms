package com.clinic;

public class AppointmentList {
	String[] mDocsNames = {"Dr. ABC","Dr. XYZ","Dr. DEF","Dr. GHI","Dr. JKL"};
	int mId;
	UnOrderedNodeCreation[] mTable = new UnOrderedNodeCreation[5];
	UnOrderedNodeCreation mHead,mTemp,mEntry ;

	//table of Doctors
	public void ArrangeAppointment(){
		for (int i = 0; i <5; i++)
			mTable[i] = null;
	}

	//Arranging the appointments according to doctors availability
	public void takeAppoinment(PatientsInfo patient,int mId){
		try{
			this.mId = mId;
			int num = mId-1;
			int count = 1;
			if(mTable[num] == null){
				mTable[num] = new UnOrderedNodeCreation();
				mTable[num].setData(mDocsNames[num]);
				mHead = mTable[num];
				//System.out.println(table[num].getData());
			}
			mHead = mTable[num];
			mTemp = mHead;

			//Checking for total appointments
			while(mTemp.getNext() != null){
				mTemp = mTemp.getNext();
				count++;
			}	

			//if appointments for perticular doctor are 5 then no further appointments
			if(count<=5){
				mHead = mTable[num];
				mTemp = mHead;
				mEntry = new UnOrderedNodeCreation();
				mEntry.setData(patient);
				System.out.println("Appointment successfull for "+mDocsNames[num]);
				while(mTemp.getNext() != null){
					mTemp = mTemp.getNext();
				}
					mTemp.setNext(mEntry);
			}

			else{
				System.out.println("Sorry Todays Appointment for "+mDocsNames[num]+" is not available ");
			}
				//new Patient().printPatient((Patient)mTemp.getNext().getData());
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Doctor's ID is Wrong!!");
		}

	}//end of takeApppointment

	//showing total appointments in clinic
	public void showAppointments(){
		for(int i=0;i<5;i++){
			System.out.print("\n"+mDocsNames[i]+": ");
			mTemp = mTable[i];
			int total = 0;
			if(mTemp == null)
				System.out.println(" \nTotal Patients: "+total);
			
			else{
				mTemp = mTemp.getNext();
				while(mTemp != null){
						total++;
						System.out.print(((PatientsInfo)mTemp.getData()).mName+", ");
						mTemp = mTemp.getNext();
				}
				System.out.println("\nTotal patients: "+total);
			}
		}
	}//end of showTable

}

