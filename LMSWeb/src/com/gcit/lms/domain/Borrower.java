package com.gcit.lms.domain;

public class Borrower {

	private String borrowerName;
	private String borrowerAddress;
	private String borrowerPhone;
	
	private int cardNo;

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public String getBorrowerAddress() {
		return borrowerAddress;
	}

	public void setBorrowerAddress(String borrowerAddress) {
		this.borrowerAddress = borrowerAddress;
	}

	public String getBorrowerPhone() {
		return borrowerPhone;
	}

	public void setBorrowerPhone(String borrowerPhone) {
		this.borrowerPhone = borrowerPhone;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
}
