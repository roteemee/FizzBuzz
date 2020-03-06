package com.fdmgroup.FizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz f = new FizzBuzz();
		
		for(int i=1; i<50; i++) {
			
			System.out.print(i + " ");
			System.out.println(f.calcFizzBuzz(i));
			
		}
		
		
				
	}

	public String calcFizzBuzz(int i) {
		// TODO Auto-generated method stub
		if (i%3==0 && i%5==0) {
			return "fizzbuzz";	
		}
		
		else if (i%3==0) {
			return "fizz";
			
		}
		else if (i%5==0) {
			return "buzz";
			
		}
		return Integer.toString(i);
	}

}
