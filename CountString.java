package task;
import java.util.Scanner;
public class CountString
{
    public static void main(String args[])
    {
    String name;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the string:");
    String str = scan.next();
    System.out.println("Enter the character");
    char ch = scan.next().charAt(0);
    int n = 0;
    char[] arr = str.toCharArray();
    for(int i=0;i<arr.length;i++)
    {
    	 if(arr[i]==ch)
         n++;
    }
    System.out.println(n);
    }
 }