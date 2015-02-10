package com.stockmon.model;

import java.lang.Double;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.robustsys.stockmon.beans.QuandlData;

//import com.stockmon.model.face.IQuandlData;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="detail")
public class QuandlDetail {

public QuandlDetail() {}

public QuandlDetail(QuandlEOD quandlEOD, QuandlData wsDetail) {
//		super();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.asOf = df.parse(wsDetail.getAsOf());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.quandlEOD = quandlEOD;
		this.open = wsDetail.getOpen();
		this.high = wsDetail.getHigh();
		this.low = wsDetail.getLow();
		this.close = wsDetail.getClose();
		this.volume = wsDetail.getVolume();
		this.exDividend = wsDetail.getExDividend();
		this.splitRatio = wsDetail.getSplitRatio();
		this.adjOpen = wsDetail.getAdjOpen();
		this.adjHigh = wsDetail.getAdjHigh();
		this.adjLow = wsDetail.getAdjLow();
		this.adjClose = wsDetail.getAdjClose();
		this.adjVolume = wsDetail.getAdjVolume();
	}

//[Date, Open, High, Low, Close, Volume, Ex-Dividend, Split Ratio, Adj. Open, Adj. High, Adj. Low, Adj. Close, Adj. Volume]
	@Id
	@Column(name="DTL_ID")
	@GeneratedValue
	Long id;
	
	@ManyToOne
//	@Column(name="HDR_ID")
	QuandlEOD quandlEOD;		
	public QuandlEOD getQuandlEOD() {
		return quandlEOD;
	}
	public void setQuandlEOD(QuandlEOD eod) {
		this.quandlEOD = eod;
	}

	@Column(name="AS_OF")
	Date asOf;
	public Date getAsOf() {
		return asOf;
	}
	public void setAsOf(String asOf) {
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.asOf = df.parse(asOf);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Column(name="OPEN")
	Double open;
	public Double getOpen() {
		return open;
	}
	public void setOpen(Double open) {
		this.open = open;
	}

	@Column(name="HIGH")	
	Double high;
	public Double getHigh() {
		return high;
	}
	public void setHigh(Double high) {
		this.high = high;
	}

	@Column(name="LOW")	
	Double low;
	public Double getLow() {
		return low;
	}
	public void setLow(Double low) {
		this.low = low;
	}

	@Column(name="CLOSE")	
	Double close;
	public Double getClose() {
		return close;
	}
	public void setClose(Double close) {
		this.close = close;
	}
	
	@Column(name="VOLUME")	
	Double volume;
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}

	@Column(name="EX_DIVIDEND")	
	Double exDividend;
	public Double getExDividend() {
		return exDividend;
	}
	public void setExDividend(Double exDividend) {
		this.exDividend = exDividend;
	}
	
	@Column(name="SPLIT_RATIO")	
	Double splitRatio;
	public Double getSplitRatio() {
		return splitRatio;
	}
	public void setSplitRatio(Double splitRatio) {
		this.splitRatio = splitRatio;
	}
	
	@Column(name="ADJ_OPEN")	
	Double adjOpen;
	public Double getAdjOpen() {
		return adjOpen;
	}
	public void setAdjOpen(Double adjOpen) {
		this.adjOpen = adjOpen;
	}

	@Column(name="ADJ_HIGH")	
	Double adjHigh;
	public Double getAdjHigh() {
		return adjHigh;
	}
	public void setAdjHigh(Double adjHigh) {
		this.adjHigh = adjHigh;
	}

	@Column(name="ADJ_LOW")	
	Double adjLow;
	public Double getAdjLow() {
		return adjLow;
	}
	public void setAdjLow(Double adjLow) {
		this.adjLow = adjLow;
	}
	
	@Column(name="ADJ_CLOSE")	
	Double adjClose;
	public Double getAdjClose() {
		return adjClose;
	}
	public void setAdjClose(Double adjClose) {
		this.adjClose = adjClose;
	}
	
	@Column(name="ADJ_VOLUME")	
	Double adjVolume;
	public Double getAdjVolume() {
		return adjVolume;
	}
	public void setAdjVolume(Double adjVolume) {
		this.adjVolume = adjVolume;
	}

}
