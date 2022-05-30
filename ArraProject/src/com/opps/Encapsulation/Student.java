package com.opps.Encapsulation;

public class Student {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		private String FirstName ="John";//instance variable
		private String LastName ="Smith";
		private int Age = 45;
		private String college =  "BU";
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public String getCollege() {
			return college;
		}
		public void setCollege(String college) {
			this.college = college;
		}
}
		// after you create the valible, right click and go to source and click getter and setter
		