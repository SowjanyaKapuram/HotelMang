package com.cg.hma.Service;

import java.awt.List;
import java.util.HashMap;

import javax.activity.InvalidActivityException;

import com.cg.hma.DAO.HotelMangDaoImpl;
import com.cg.hma.DAO.IHotelMangDao;
import com.cg.hma.DTO.CustDetails;

 

public class HotelMangServiceImpl implements IHotelMangService {

	IHotelMangDao hotelMangDao= new HotelMangDaoImpl();
	public int bookRoom(CustDetails custDetails) {
		String s= custDetails.getMobile();
		 	if(s.length()!=10) {
		 		try {
					throw new InvalidActivityException();
				} catch (InvalidActivityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 		return 0; 
		 	}
		 	
		 	else
		return hotelMangDao.bookRoom(custDetails);
		
	}
	public CustDetails bookingStatus(int custId) {
		 
		return hotelMangDao.bookingStatus(custId);
	}

}
