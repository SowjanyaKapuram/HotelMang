package com.cg.hma.Service;

import java.awt.List;
import java.util.HashMap;

import com.cg.hma.DTO.CustDetails;

public interface IHotelMangService {
	int bookRoom(CustDetails custDetails);

       CustDetails bookingStatus(int custId );
	

}
