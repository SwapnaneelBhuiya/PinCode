package com.java.pincode;
import java.util.*;
public class pincode {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pin Code");
		String code=sc.nextLine();
		if(code.length()!=6)
			{System.out.println("Invalid Pin Code");System.exit(0);}
		if(code.matches("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$"))
			System.out.println("Valid PinCode");
		else
			System.out.println("Invalid Pin Code");
	}
}
