package com.kn.Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Drivinglicence {
 public static void main(String[] args) {
	System.out.println("program started");
	Scanner scan=new Scanner(System.in);
	System.out.println("enter your age");
	int age=scan.nextInt();
	try {
		ageValidation(age);
	} catch(Exception e) {
		e.printStackTrace();
	}
	
}

private static void ageValidation(int age)throws Exception {
	// TODO Auto-generated method stub
	if(age>=18) {
		System.out.println("congrats you'are eligible for the licence");;
	}else {
		System.out.println("you are not eligible");
		throw new NotValidAgeException();
	}
	
	
}

}
