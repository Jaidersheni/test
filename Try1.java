package try1;

import java.util.Scanner;

public class Try1 {
public static void main(String []arg){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elements in array");
	int l=sc.nextInt();
	System.out.println("Enter the elements of array");
	int a[]=new int[l];
	int b[]=new int[l];
	for(int i=0;i<l;i++)
		a[i]=sc.nextInt();
	System.out.println("Enter the steps to rotate");
	int k=sc.nextInt();
	for(int m=0;m<l;m++){
		int n=k+m;
		if(n<l)
			b[n]=a[m];
		else{
			int z=n-l;
			b[z]=a[m];
		}
	}
	for(int x=0;x<l;x++)
		System.out.println(b[x]);
	}
}
