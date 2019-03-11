package com.cg.hma.DTO;

public class CustDetails {

	private String name, email, mobile, roomType, address;
	private int custId,roomNo;

	 

	public CustDetails(String name2, String email2, String address2, String mobile2, String roomType2, int roomNo2) {

		this.name = name2;
		this.email = email2;
		this.mobile = mobile2;
		this.roomType = roomType2;
		this.address = address2;
		this.roomNo = roomNo2;

	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public CustDetails() {
		 
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

}
