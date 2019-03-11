package com.cg.hma.DAO;

import java.awt.List;
import java.util.HashMap;

import com.cg.hma.DTO.CustDetails;

public interface IHotelMangDao {
int bookRoom(CustDetails custDetails);

CustDetails bookingStatus(int custId);
}
