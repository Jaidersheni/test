package Evenodd;

import java.util.Scanner;

public class Check {
	public static void main(String []arg){
	 int Input;
	 String Output;
	 Scanner sc=new Scanner(System.in);
	 Input=sc.nextInt();
	 if(Input%2==0){
		 Output="Even";
		 System.out.println(Output);}
	 else{
			 Output="Odd";
			 System.out.println(Output);}
	 }
	}

