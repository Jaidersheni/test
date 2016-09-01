package Workingday;

import java.util.Scanner;

public class day {
	public static void main(String []arg){
		day d=new day();
		Scanner sc=new Scanner(System.in);
		String day=sc.next();
		boolean Output=d.Workingday(day);
		System.out.println(Output);
	}
	public boolean Workingday(String a){
		boolean out=true;
		if(a.equalsIgnoreCase("sunday")){
			out=false;
		}
		return out;
	}

}
