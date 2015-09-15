package com.gcit.lms.domain;

public class BookLoans {

	private int bookLoanID;
	private Book book;
	private Branch branch;	
	private Borrower borrower;
	
	private String dateOut;
	private String dateIn;
	private String dueDate;
	public int getBookLoanID() {
		return bookLoanID;
	}
	public void setBookLoanID(int bookLoanID) {
		this.bookLoanID = bookLoanID;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Borrower getBorrower() {
		return borrower;
	}
	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
	public String getDateOut() {
		return dateOut;
	}
	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}
	public String getDateIn() {
		return dateIn;
	}
	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
}
