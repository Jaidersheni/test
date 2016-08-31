package Reverse;

import java.util.Scanner;
class Vowelremove{
	public String vowel(StringBuffer s2){
		char ch[]={'a','e','i','o','u','A','E','I','O','U'};
		for(int i=0;i<ch.length;i++){
			int j=0;
			while(j<s2.length()){
				if(ch[i]==s2.charAt(j)){
					s2=s2.deleteCharAt(j);
					j=0;
				}
				else
					j=j+1;
			}
		}
		String s3=s2.toString();
		return s3;
	}
}
public class Reverse {
	public static void main(String []arg){
		Vowelremove v=new Vowelremove();
		Scanner s=new Scanner(System.in);
		String str=new String();
		System.out.println("Enter a String");
		str=s.next();
		StringBuffer s1=new StringBuffer(str);
		s1=s1.reverse();
		System.out.println("The reversed String is "+s1);
		String out=v.vowel(s1);
		System.out.println("Output is "+out);
	}

}
