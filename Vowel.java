package vowel;

import java.util.Scanner;

public class Vowel {
public static void main(String []arg){
	String Input;
	Scanner sc=new Scanner(System.in);
	Input=sc.next();
	String Output;
	String vowel="aeiouAEIOU";
	if(vowel.contains(Input)){
		Output="True";
		System.out.println(Output);}
	else{
		Output="False";
		System.out.println(Output);
	}
}
}
