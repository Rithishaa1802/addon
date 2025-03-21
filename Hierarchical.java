package com.dem;

public class Hierarchical
{
	public static void main(String args[])
	{
		Child1 x = new Child1();
		Child2 y = new Child2();
		x.access();
		y.access();
	}
}
class Parent5
{
	int i = 10;
	int j = 20;
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
}
class Child1 extends Parent5
{
	int i = 12;
	int j = 55;
	public void access()
	{
		Parent5 inp = new Parent5();
		inp.add(i,j);
	}
}
class Child2 extends Parent5
{
	int i = 48;
	int j = 28;
	public  void  access()
	{
		Parent5 inp = new Parent5();
		inp.add(i,j);
	}
}
