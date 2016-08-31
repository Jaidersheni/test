package primecount;

import java.util.Scanner;

public class Primecount {
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start range");
		int start=sc.nextInt();
		System.out.println("Enter the ending range");
		int end=sc.nextInt();
		int count=0;
		int num;
		for(int i=start;i<=end;i++){
			for(num=2;num<i;num++){
				int t=i%num;
				if(t==0)
					break;
			}
			if(i==num){
				count=count+1;
		}
		}
		System.out.println(count);
	}

}
