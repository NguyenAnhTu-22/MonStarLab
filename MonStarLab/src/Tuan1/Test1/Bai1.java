package Tuan1.Test1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();

		float delta = b * b - 4 * a * c;
		System.out.println(Math.sqrt(delta));
	}
}
