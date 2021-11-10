package com.Maven_project;

public class Pojo_b {
	public static void main(String[] args) {
		Pojo_a pojo = new Pojo_a();
		int value = pojo.getA();
		System.out.println("value of a:"+value);
		System.out.println("after setter");
		pojo.setA(1432);
		int after = pojo.getA();
		System.out.println(after);
	}
	

}
