package jump;

import java.util.Scanner;

public class Jump {
public static void main(String []arg){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length of array");
	int l=sc.nextInt();
	int a[]=new int[l];
	System.out.println("Enter elements");
	for(int i=0;i<l;i++){
		a[i]=sc.nextInt();
	}
	boolean Output=false;
	int last=l-1;
	int z=a[0];
	while(z<l&&a[z]!=0){
		int temp=a[z];
		z=temp+z;
		if(z==last){
			Output=true;
			break;}
	}
	System.out.println(Output);
}
}
