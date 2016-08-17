package romantoint;

import java.util.Scanner;

public class Romantoint {
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roman numeral");
		String str=sc.next();
		str=str.toUpperCase();
		int out=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++){
			char c=ch[i];
			switch(c){
			case 'I':
				out=out+1;
				break;
			case 'V':
				out=out+5;
				break;
			case 'X':
				out=out+10;
				break;
			case 'L':
				out=out+50;
				break;
			case 'C':
				out=out+100;
				break;
			case 'D':
				out=out+500;
				break;
			case 'M':
				out=out+1000;
				break;
			}
		}
		System.out.println(out);
			if(str.contains("IV"))
				out=out-2;
			if(str.contains("IX"))
				out=out-2;
			if(str.contains("XL"))
				out=out-20;
			if(str.contains("XC"))
				out=out-20;
			if(str.contains("CD"))
				out=out-200;
			if(str.contains("CM"))
				out=out-200;
			System.out.println(str+":"+out);
		}
		
	}