package test;

import java.util.Scanner;

public class Test {
public static void main(String []arg){
	int Input;
	String Output;
	Scanner sc=new Scanner(System.in);
	Input=sc.nextInt();
	if(Input>0){
		System.out.println("Positive");
	Output="Positive";}
	else if(Input<0){
	System.out.println("Negative");
	Output="Negative";}
	else{
		System.out.println("Zero");
		Output="Zero";}
}
}
