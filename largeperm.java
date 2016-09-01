package largeperm;

import java.util.Scanner;
import java.util.TreeSet;

public class largeperm {
	static TreeSet<Integer> t=new TreeSet<Integer>();
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int l=sc.nextInt();
		int a[]=new int[l];
		for(int i=0;i<l;i++){
			a[i]=sc.nextInt();}
	    String str = "";
	    for(int m=0;m<l;m++)
	    	str=str+a[m];
	    StringBuffer strBuf = new StringBuffer(str);
	    Permutation(strBuf,str.length());
	    System.out.println(t.last());
	}

	private static void Permutation(StringBuffer str, int index){

	    if(index <= 0){
	        String z=str.toString();
	        int x=Integer.valueOf(z);
	        t.add(x);
	        }           
	    else {
	        Permutation(str, index-1);
	        int currPos = str.length()-index;
	        for (int i = currPos+1; i < str.length(); i++) {
	            swap(str,currPos, i);
	            Permutation(str, index-1);
	            swap(str,i, currPos);
	        }
	    }
	}

	private  static void swap(StringBuffer str, int pos1, int pos2){
	    char t1 = str.charAt(pos1);
	    str.setCharAt(pos1, str.charAt(pos2));
	    str.setCharAt(pos2, t1);
	} 

}
