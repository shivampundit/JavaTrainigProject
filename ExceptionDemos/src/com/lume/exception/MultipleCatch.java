package com.lume.exception;

public class MultipleCatch {
	public static void main(String[] args) {
		try{
		System.out.println("Welcome");
		String value = args[0];
		System.out.println("Value : " + value);
		int num = Integer.parseInt(value);
		System.out.println("Number : " + num);
		int result = 100/num;
		System.out.println(result);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Please Enter Value");
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Don't Enter Zero(0)");
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Please Enter a Number");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Completed.");
	}
}
