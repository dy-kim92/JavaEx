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
    }
    
    public void showInfo() {
    	if(stateCode == 0) {
    		System.out.printf("%d 책 제목: %s, 작가: %s, 대여 유무: 대여중\n", bookNo, title, author);
    	}else {
    		System.out.printf("%d 책 제목: %s, 작가: %s, 대여 유무: 대여가능\n", bookNo, title, author);
    	}
    		
    }

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
    
}
