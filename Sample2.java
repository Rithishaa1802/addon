package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Sample2 {
	public static void main(String args[])
	{
		String name = "Rithishaa";
		String obj = new String("Rithishaa");
		System.out.println(name==obj);
		System.out.println(name.equals(obj));
		System.out.println(name.toLowerCase());
		System.out.println(name);
		System.out.println(name.toUpperCase());
		char b = name.charAt(0);
		System.out.println(name.charAt(0));	
		System.out.println(b);
		System.out.println(name.indexOf('a',3));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.substring(0,5));
		char[] a = name.toCharArray();
		System.out.println(name.toCharArray());
		System.out.println(name.toLowerCase());
		System.out.println(a);
		System.out.println(name.split("a"));
		String[] d=name.split("a");
		System.out.println(Arrays.toString(d));
		System.out.println(name.trim());
		System.out.println(name.isBlank());
		System.out.println(name.isEmpty());
		System.out.println(name.concat(" G"));
		System.out.println(name.replace('a', ' '));
		System.out.println(name.replaceAll("Rithishaa","Archana"));
		    
	}
}
