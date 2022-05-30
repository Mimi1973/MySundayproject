package com.opps.Encapsulation;

public class MainDemo {
	
	public static void main (String[]args) {
	
	Student st = new Student();     // this is the class you want to access
	
	System.out.println (" Student First Name: " + st.getFirstName());
	System.out.println ("Studnt Last Name: " + st.getLastName());
	System.out.println ("Studnet Age:" + st.getAge());
	}
}

