package com.js.controller;

import java.util.Scanner;

import com.js.dao.BooksCRUD;
import com.js.dto.Books;

public class InsertBooks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Books b = new Books();
		System.out.println("Enter the Book Id ");
		b.setBookId(sc.nextInt());
		System.out.println("Enter the Book Name");
		b.setBookName(sc.next());
		System.out.println("Enter the Author Name  ");
		b.setAuthorName(sc.next());
		System.out.println("Enter the Book price ");
		b.setPrice(sc.nextDouble());
		System.out.println("Enter Noofpages");
		b.setNoofpages(sc.nextInt());

		BooksCRUD pc = new BooksCRUD();
		int res = pc.insertProduct(b);
		if (res > 0) {
			System.out.println("Book Inserted Successfully");
		} else {
			System.out.println("Failed to insert Book ");

		}

	}
	// when we want to return single object we write by class name

}
