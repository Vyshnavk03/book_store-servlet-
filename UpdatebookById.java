package com.js.controller;

import java.util.Scanner;

import com.js.dao.BooksCRUD;
import com.js.dto.Books;



public class UpdatebookById {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Books b =new Books();
			System.out.println("Enter the Book Id To update");
			int id =sc.nextInt();
			System.out.println("Enter the Book Name");
			b.setBookName(sc.next());
			System.out.println("Enter the Book Author name");
			b.setAuthorName(sc.next());
			System.out.println("Enter the BOOK price");
			b.setPrice(sc.nextDouble());
			System.out.println("Enter NoOfPages");
			b.setNoofpages(sc.nextInt());
			
			BooksCRUD bc =new BooksCRUD();
			int res = bc.updatebookById(id, b);
			
			if(res>0) {
				System.out.println("book updated");
			}else {
				System.out.println("No book to update in given id");
			
		}
	}

	

}
