package equalindex;

import java.util.Scanner;

public class equalindex {
public static void main(String []arg){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of elements of array");
	int l=sc.nextInt();
	boolean temp=false;
	equalindex e=new equalindex();
	int Output;
	int a[]=new int[l];
	System.out.println("Enter elements");
	for(int i=0;i<l;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<l;i++){
		temp=e.indexequal(a[i],i);
		if(temp==true){
			Output=i;
			System.out.println(Output);
			System.exit(0);
		}
	}
}
public boolean indexequal(int num,int index)
{
	boolean out=false;
	if(num==index)
		out=true;
	return out;
}
}
