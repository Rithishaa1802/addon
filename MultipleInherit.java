package com.dem;

public class MultipleInherit 
{
	public static void main(String args[])
	{
		MultipleInherit x = new MultipleInherit()
				{
					public void hello()
					{
						int a = 10;
						System.out.println(a);
					}
					
					public void hi()
					{
						int b = 20;
						System.out.println(b);
					}
				}
	}
}
