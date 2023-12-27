package com.graphql.learn;

import com.graphql.learn.Entity.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlprojApplication implements CommandLineRunner {
	@Autowired
    private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlprojApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
         Book b1=new Book();
		 b1.setTitle("Complete Reference");
		 b1.setDesc("For learning Java");
		 b1.setPages(2000);
		 b1.setPrice(4000);
		 b1.setAuthor("Shafaat");
		 Book b2=new Book();
		 b2.setTitle("Complete Python");
		 b2.setDesc("For learning Python");
		 b2.setPages(2000);
		 b2.setPrice(3000);
		 b2.setAuthor("Shafaat");
		 Book b3=new Book();
		 b3.setTitle("Complete NodeJS");
		 b3.setDesc("NodeJS Complete");
		 b3.setPages(3000);
		 b3.setPrice(8000);
		 b3.setAuthor("Razi");

		 this.bookService.create(b1);
		 this.bookService.create(b2);
		 this.bookService.create(b3);
	}
}
