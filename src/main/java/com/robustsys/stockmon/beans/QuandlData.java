package com.robustsys.stockmon.beans;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuandlData  {
	public QuandlData(String asOf, Double open, Double high, Double low,
			Double close, Double volume, Double exDividend, Double splitRatio,
			Double adjOpen, Double adjHigh, Double adjLow, Double adjClose,
			Double adjVolume) {
//		super();
		this.asOf = asOf;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
		this.exDividend = exDividend;
		this.splitRatio = splitRatio;
		this.adjOpen = adjOpen;
		this.adjHigh = adjHigh;
		this.adjLow = adjLow;
		this.adjClose = adjClose;
		this.adjVolume = adjVolume;
	}

	String asOf;
	public String getAsOf() {
		return asOf;
	}
	public void setAsOf(String asOf) {
		this.asOf = asOf;
	}
	Double open;
	public Double getOpen() {
		return open;
	}
	public void setOpen(Double open) {
		this.open = open;
	}
	Double high;
	public Double getHigh() {
		return high;
	}
	public void setHigh(Double high) {
		this.high = high;
	}
	Double low;
	public Double getLow() {
		return low;
	}
	public void setLow(Double low) {
		this.low = low;
	}
	Double close;
	public Double getClose() {
		return close;
	}
	public void setClose(Double close) {
		this.close = close;
	}
	Double volume;
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	Double exDividend;
	public Double getExDividend() {
		return exDividend;
	}
	public void setExDividend(Double exDividend) {
		this.exDividend = exDividend;
	}
	Double splitRatio;
	public Double getSplitRatio() {
		return splitRatio;
	}
	public void setSplitRatio(Double splitRatio) {
		this.splitRatio = splitRatio;
	}
	Double adjOpen;
	public Double getAdjOpen() {
		return adjOpen;
	}
	public void setAdjOpen(Double adjOpen) {
		this.adjOpen = adjOpen;
	}
	Double adjHigh;
	public Double getAdjHigh() {
		return adjHigh;
	}
	public void setAdjHigh(Double adjHigh) {
		this.adjHigh = adjHigh;
	}
	Double adjLow;
	public Double getAdjLow() {
		return adjLow;
	}
	public void setAdjLow(Double adjLow) {
		this.adjLow = adjLow;
	}
	Double adjClose;
	public Double getAdjClose() {
		return adjClose;
	}
	public void setAdjClose(Double adjClose) {
		this.adjClose = adjClose;
	}
	Double adjVolume;
	public Double getAdjVolume() {
		return adjVolume;
	}
	public void setAdjVolume(Double adjVolume) {
		this.adjVolume = adjVolume;
	}

}
