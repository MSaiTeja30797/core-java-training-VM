package assignment30may;

import java.util.*;

public class PatientDetails {

	public static void main(String[] args) {
		ArrayList<Patient>patient=new ArrayList<Patient>();
		
		patient.add(new Patient(1001,"sai",21));
		patient.add(new Patient(1002,"teja",22));
		patient.add(new Patient(1003,"maturi",23));
		
		Collections.sort(patient,new PatientNameTest());
		for(Patient i:patient)
		{
			System.out.println(i);
		}
		
		
		Collections.sort(patient,new PatientAgeTest());	
		for(Patient i:patient)
		{
			System.out.println(i);
		}
		System.out.println("elemets added to tree set");
		TreeSet<Patient>ts = new TreeSet<Patient>();
		
		 Iterator<Patient>strIterator = patient.iterator();
	while(strIterator.hasNext()) {
	System.out.println(strIterator.next());
	        }
		
		
		
		
	}
}


