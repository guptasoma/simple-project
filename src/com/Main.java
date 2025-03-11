package com;

import com.model.Author;
import com.model.Book;

public class Main {
	
	public static void main(String[] args) {
		Book book=new Book();
		book.setTitle("Harry Potter");
		Author author=new Author();
		author.setName("J.K.Rowling");
		book.setAuthor(author);
		System.out.println(book);
		Book book1=new Book();
		book1.setTitle("Harry Potter Book 2");
		author=new Author();
		author.setName("J.K.Rowling");
		book1.setAuthor(author);
		System.out.println(book1);
	}

}
