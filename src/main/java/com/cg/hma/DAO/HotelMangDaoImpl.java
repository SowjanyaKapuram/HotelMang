package com.cg.hma.DAO;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cg.hma.DTO.CustDetails;
import com.cg.hma.DTO.RoomDetails;

public class HotelMangDaoImpl implements IHotelMangDao {

	HashMap<Integer, CustDetails> hashMap1 = new HashMap<Integer, CustDetails>();
	HashMap<Integer, RoomDetails> hashMap = new HashMap<Integer, RoomDetails>();
	HashMap<Integer, RoomDetails> hashMap2 = new HashMap<Integer, RoomDetails>();

	static int i = 1000;

	public HotelMangDaoImpl() {

		hashMap.put(101, new RoomDetails("AC_SINGLE", "UNBOOKED"));
		hashMap.put(102, new RoomDetails("AC_SINGLE", "UNBOOKED"));
		hashMap.put(103, new RoomDetails("AC_SINGLE", "UNBOOKED"));
		hashMap.put(201, new RoomDetails("NONAC_SINGLE", "UNBOOKED"));
		hashMap.put(202, new RoomDetails("NONAC_SINGLE", "UNBOOKED"));
		hashMap.put(203, new RoomDetails("NONAC_DOUBLE", "UNBOOKED"));

	}

	public int bookRoom(CustDetails custDetails) {

		if (hashMap.containsKey(custDetails.getRoomNo())) {

			hashMap1.put(i+1, new CustDetails(custDetails.getName(), custDetails.getEmail(), custDetails.getAddress(),
					custDetails.getMobile(), custDetails.getRoomType(), custDetails.getRoomNo()));
			hashMap.replace(custDetails.getRoomNo(), new RoomDetails(custDetails.getRoomType(), "BOOKED"));

			i++;

			return i;
		}

		else
			return 0;

	}

	public CustDetails bookingStatus(int custId) {

		if (hashMap1.containsKey(custId)) {

			return hashMap1.get(custId);

		}

		else

			return null;
	}

}
