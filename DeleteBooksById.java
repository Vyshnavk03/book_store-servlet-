package com.js.controller;


import java.util.Scanner;

import com.js.dao.BooksCRUD;


public class DeleteBooksById {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the id to delete");
			int id =sc.nextInt();
			
			BooksCRUD pc =new BooksCRUD();
			int res =pc.deleteBookById(id);
			
			if(res>0) {
				System.out.println("Book Deleted");
			}else {
				System.out.println("No Book avaialbe to Delete");
		}

	}


}
