package Tuan1.Test1;

import java.util.Scanner;

public class Bai3 {
	float a;
	float cv;
	float dt;

	void nhapCanh() {
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		System.out.println(a);
	}

	void Chuvi() {
		cv = 4 * a;
		System.out.println(cv);
	}

	void Dientich() {
		dt = a * a;
		System.out.println(dt);
	}

	void All() {
		System.out.println(a);
		System.out.println(cv);
		System.out.println(dt);
	}

	public static void main(String[] args) {
		Bai3 sq = new Bai3();
		sq.nhapCanh();
		sq.Chuvi();
		sq.Dientich();
		sq.All();
	}
}