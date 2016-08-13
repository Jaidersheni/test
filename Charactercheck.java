package Charactercheck;

import java.util.Scanner;

public class Charactercheck {
	public static void main(String []arg){
		String Input;
		Scanner sc=new Scanner(System.in);
		Input=sc.next();
		String Output="Not Character";
		for(char ch='a';ch<='z';ch++){
			if(Input.charAt(0)==ch)
				Output="Character";
		}
		System.out.println(Output);
	}

}
