package leap;

import java.util.Scanner;

public class Leap {
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		String Out=new String();
		if(in%4==0||in%100==0)
			Out="Leap";
		else
			Out="Not Leap";
		System.out.println(Out);
	}

}
