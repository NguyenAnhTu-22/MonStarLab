package Tuan1.Test1;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rateList;
	
	public static News news;
	public static Scanner sc;
	public static ArrayList<News> array = new ArrayList<>();

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

	public void setAuthor(String author) {
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
		this.averageRate = (this.rateList[0] + this.rateList[1] + this.rateList[2]) / 3;
	}

	public static void Menu() {
		System.out.println("1-Insert news");
		System.out.println("2-View list news");
		System.out.println("3-Average rate");
		System.out.println("4-Exit");

	}

	public static void func1() {
		sc = new Scanner(System.in);
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
		array.add(news);
	}

	public static void func2() {
		for (int i = 0; i < array.size(); i++) {
			array.get(i).display();
		}
	}

	public static void func3() {
		for (int i = 0; i < array.size(); i++) {
			array.get(i).calculate();
			array.get(i).display();
		}
	}

	public static void main(String[] args) {
		int i = 1;
		while (i > 0) {
			Menu();
			System.out.println("Nhap lua chon");
			sc = new Scanner(System.in);
			int index = sc.nextInt();
			switch (index) {
			case 1:
				func1();
				break;
			case 2:
				func2();
				break;
			case 3:
				func3();
				break;
			case 4:
				i = i - 1;
				System.out.println("Thoat chuong trinh");
				break;
			}
		}
	}
}
