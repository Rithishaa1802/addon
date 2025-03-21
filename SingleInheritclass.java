package com.dem;

public class SingleInheritclass extends Parent
{
	public static void main(String args[])
	{
		add();
		System.out.println(add());
	}

}
class Parent
{
	public static int a = 50;
	public static int b = 40;
	static int add()
	{
		return a+b;
	}
}
