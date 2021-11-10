package com.Maven_project;

public class Ex2 {
	public static void main(String[] args) {
		Ex obj = new Ex();
		int num =obj.getId();
		String na = obj.getName();
		String em = obj.getEmail();
		System.out.println("Employee Id number: "+ num);
		System.out.println("Employee name: "+ na);
		System.out.println("Employee email id: "+ em);
		obj.setId(366);
		obj.setName("hema latha");
		obj.setEmail("hema@mail.com");
		System.out.println("new ");
		int num1 =obj.getId();
		String na1 = obj.getName();
		String em1 = obj.getEmail();
		System.out.println("Employee Id number: "+ num1);
		System.out.println("Employee name: "+ na1);
		System.out.println("Employee email id: "+ em1);
		
	}

}
