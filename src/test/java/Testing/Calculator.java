package Testing;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public String factorial(double n) {
		for (int i = 1; i <= n; i++) {
			n = n/i; 
			System.out.println(n);
			if (n == 1) {
					return i +"!";
			}
			else if (n<1) {
				return "None";
			}
		}
		return "None";
		
	}
	
	public List<String> doggo(int myDoggo) {

		List<String> places = new ArrayList<>();


		for (int i = 1; i <= 100; i++) {

			if (myDoggo == i) {
				continue;

			}
			places.add(affix(i));

	}
	System.out.println(places);
	return places ;


	}

	public String affix(int n) {
		if (n < 10 && n < 20) {
			return n + "th";
		}

		int modulus = n % 10;
		switch (modulus) {
		case 1:
			return n + "st";
		case 2:
			return n + "nd";
		case 3:
			return n + "rd";
		default:
			return n + "th";
		}
	}

}
