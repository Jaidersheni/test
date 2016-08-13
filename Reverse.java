package Reverse;

import java.util.Scanner;
public class Reverse {
	public static void main(String []arg){
		Scanner s=new Scanner(System.in);
		String Input=new String();
		System.out.println("Enter a String");
		Input=s.next();
		StringBuffer Output=new StringBuffer(Input);
		Output=Output.reverse();
		System.out.println("The reversed String is "+Output);
	}
}
