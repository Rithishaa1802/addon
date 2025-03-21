package com.demo;
import java.util.Arrays;
import java.util.Scanner;

public class SampleClass
{
	public static void main(String args[])
 {  
   Scanner scan =  new Scanner(System.in);
   int[] a = {1,2,3,4};
  int[] obj = new int[5];
   for(int i=0;i<obj.length;i++)
   {
	   obj[i] = scan.nextInt();                                      
   }
   int x = 1;
   for(int i=0;i<obj.length;i++)
   {
	 x *= obj[i];                      
   }
   System.out.println(Arrays.toString(obj));
   System.out.println(x);
  }
}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 