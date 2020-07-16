package Tuan1.Test1;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
	int id;
	static String title;
	static String publishDate;
	static String author;
	static String content;
	float averageRate;
	int[] rateList;
	public static News news;
	public static Scanner sc;
	public static ArrayList<News> array;

	public News(String title, String publishDate, String author, String content) {
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public void setAverageRate(float averageRate) {
		this.averageRate = averageRate;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String autor) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(title);
		System.out.println(publishDate);
		System.out.println(author);
		System.out.println(content);
		System.out.println(averageRate);
	}

	public void setRateList() {
		this.rateList = new int[3];
	}

	public void calculate() {
		this.averageRate = (rateList[0] + rateList[1] + rateList[2]) / 3;
	}

	public void Menu() {
		System.out.println("1-Insert news");
		System.out.println("2-View list news");
		System.out.println("3-Average rate");
		System.out.println("4-Exit");

	}

	public void func1() {
		sc.nextLine();
		System.out.println("Nhap title:");
		String title = sc.nextLine();
		System.out.println("Nhap publishDate:");
		String publishDate = sc.nextLine();
		System.out.println("Nhap author:");
		String author = sc.nextLine();
		System.out.println("Nhap content:");
		String content = sc.nextLine();
		news = new News(title, publishDate, author, content);
		System.out.println("Nhap 3 gia tri danh gia:");
		news.setRateList();
		news.rateList[0] = sc.nextInt();
		news.rateList[1] = sc.nextInt();
		news.rateList[2] = sc.nextInt();
		array = new ArrayList<News>();
		array.add(news);
	}

	public void func2() {
		array.get(0).display();
	}

	public void func3() {
		array.get(0).calculate();
		array.get(0).display();
	}

	public static void main(String[] args) {
		News ne = new News(title, publishDate, author, content);

		int i = 1;
		while (i > 0) {
			System.out.println(" ");
			ne.Menu();
			System.out.println("Nhap lua chon");
			sc = new Scanner(System.in);
			int index = sc.nextInt();
			switch (index) {
			case 1:
				ne.func1();
				break;
			case 2:
				ne.func2();
				break;
			case 3:
				ne.func3();
				break;
			case 4:
				i = i - 1;
				break;
			}
		}
	}
}
