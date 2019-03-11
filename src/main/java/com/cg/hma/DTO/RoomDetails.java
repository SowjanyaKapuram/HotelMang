package com.cg.hma.DTO;

public class RoomDetails {
	private String roomType, roomStatus;

	public RoomDetails(String string, String string2) {
		 
		this.roomType = string;
		this.roomStatus= string2;
		
	}

	public RoomDetails() {
		 
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
}
