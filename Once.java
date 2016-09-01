package Once;


import java.util.Arrays;
import java.util.Scanner;

public class Once {
public static void main(String []arg){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of elements of array");
	int l=sc.nextInt();
	int Output;
	int a[]=new int[l];
	System.out.println("Enter elements");
	for(int i=0;i<l;i++)
		a[i]=sc.nextInt();
	Arrays.sort(a);
	int i=0;
	while(i<l-1){
		if(a[i]==a[i+1]){
			i=i+2;
		}
		else{
			break;
		}
	}
	Output=a[i];
	System.out.println(Output);
	System.exit(0);
}
}
