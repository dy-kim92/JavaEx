package com.javaex.problem04;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private int stateCode;
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	stateCode = 1;
    }
    
    public void rent() {
    	if(stateCode == 0) {
    		System.out.println("이미 대여중인 책입니다.");
    	}else {
	    	stateCode = 0;
	    	System.out.println(title + "이(가) 대여 됐습니다.");
    	}
    }
    
    public void print() {
    	if(stateCode == 0) {
    		System.out.printf("%d 책 제목: %s, 작가: %s, 대여 유무: 대여중\n", bookNo, title, author);
    	}else {
    		System.out.printf("%d 책 제목: %s, 작가: %s, 대여 유무: 대여가능\n", bookNo, title, author);
    	}
    		
    }
    
}
