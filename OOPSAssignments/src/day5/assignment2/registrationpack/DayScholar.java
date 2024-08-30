package day5.assignment2.registrationpack;

import day5.assignment1.courseregistration.Student;

public class DayScholar extends Student {

	private String residentialAddress;

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public void getDetails() {
		System.out.println("Student ID :"+studentId);
		System.out.println("Student Type :"+studentType);
		System.out.println("Student Name :"+studentName);
		
	}
	
}
