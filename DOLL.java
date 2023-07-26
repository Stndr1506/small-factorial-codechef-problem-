/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int[] c=new int[a];
		    int m=0;
		    for(int j=0;j<a;j++){
		        c[j]=sc.nextInt();
		    }
		    for(int j=0;j<a;j++){
		        if(c[j]>b){
		            m++;
		        }
		    }
		    System.out.println(m);
		}
	}
}
