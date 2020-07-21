package lab2;

import java.util.Scanner;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length, width, height, area, perimeter, volume;
		String str;
		Scanner scnr = new Scanner(System.in);
		do {
			System.out.println("Enter Legth");
			length = scnr.nextDouble();
			System.out.println("Enter Width");
			width = scnr.nextDouble();
			System.out.println("Enter Height");
			height = scnr.nextDouble();
			area = length * width;
			System.out.println("Area:{" + area + "}");
			perimeter = 2 * (length + width);
			System.out.println("Perimeter:{" + perimeter + "}");
			volume = length * width * height;
			System.out.println("Volume:{" + volume + "}");
			System.out.println("Do you want to continue?(y/n)");
			str = scnr.next();
		} while (str.equalsIgnoreCase("y"));
		System.out.println("Thanks for using Room Detail Generator!");
		scnr.close();
	}
}
