package one;

import java.util.Scanner;

public class One {
public static void main(String []arg){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of elements of array");
	int l=sc.nextInt();
	int Output;
	int a[]=new int[l];
	int count=0;
	System.out.println("Enter elements");
	for(int i=0;i<l;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<l;i++){
		for(int j=i+1;j<l;j++){
			if(a[i]==a[j]){
				count=2;
				a[j]=0;
				break;
			}
			else
			count=1;
		}
		if(count==1&&a[i]!=0){
		Output=a[i];
		System.out.println(Output);
		System.exit(0);}
	}
}
}
