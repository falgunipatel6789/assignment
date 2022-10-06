package com.qa.java;

import java.util.Scanner;

public class Main {
	static User u = new User();
	static Book b = new Book();
	
	static void passcheck() {
		System.out.println("username match");
		System.out.println("new book is " + u.newBook);
		System.out.println("my favourite book is " + u.favouriteBook);
		System.out.println("are you completed book ? " + u.completedBook);
	}
	static void bookdetail() {
		System.out.println("book detail of " +b. bookId + " is :\n");
		System.out.println(" book name is " + b.bookName);
		System.out.println(" book authorname is  " + b.authorName);
		System.out.println("book description is  " + b.desc);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" pls enter user name :");
		String username = sc.nextLine();
		System.out.println(" pls enter password :");
		String userpass = sc.nextLine();
		Main p = new Main();
		// System.out.println(u.userName);
		if (u.userName.trim().matches(username)) {
              p.passcheck();
			
		} else {
			System.out.println(" user name not match.");
		}
		System.out.println(" pls enter book Id :");
		int bookId1 = sc.nextInt();
		if (b.bookId == bookId1) {
			p.bookdetail();
		} else {
			System.out.println(" book not found.");
		}

	}
}