package com.railwayonlinesys.service;

import java.util.List;

import com.railwayonlinesys.beans.HistoryBean;
import com.railwayonlinesys.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
