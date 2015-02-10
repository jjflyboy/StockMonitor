package com.stockmon.service;

import java.util.List;

import com.stockmon.model.QuandlEOD;

public interface QuandlService {
	public void StoreEOD();
//	public QuandlEOD save(QuandlEOD header);

	public List<QuandlEOD> findAllEODData();

}
