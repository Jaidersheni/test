package test;

import java.util.Scanner;

public class Test {
public static void main(String []arg){
	int Input;
	Scanner sc=new Scanner(System.in);
	Input=sc.nextInt();
	if(Input>0)
		System.out.println("Positive");
	else if(Input<0)
	System.out.println("Negative");
	else
		System.out.println("Zero");
}
}
