package largest;

import java.util.Scanner;

public class Large {
	public static void main(String []arg){
		int in[]=new int[3];
		Scanner sc = new Scanner(System.in);
		int Out=0;
		for(int i=0;i<in.length;i++){
			in[i]=sc.nextInt();
			Out=Math.max(in[i], Out);}
		System.out.println(Out);
		
	}

}
