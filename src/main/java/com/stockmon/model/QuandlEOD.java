package com.stockmon.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.robustsys.stockmon.beans.QuandlWsEOD;
//import com.stockmon.model.QuandlData;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="eod_header")
public class QuandlEOD/*<E, T>*/ {
	//Header stuff
	String errors;
		
	@Id
	@GeneratedValue
	@Column(name="EOD_HDR_ID")
	Long id;

	String source_name;
	String source_code;
	String code;
	String name;
	String urlize_name;
	String display_url;
	String description;
	Date updated_at;//String
	String frequency;
	String from_date;
	String to_date;
	String column_names;
	Boolean _private;
	String type;
	boolean premium;

/*	
	@Transient
	ArrayList<ArrayList<Object>> data;
	public ArrayList<ArrayList<Object>> getData() {
		return data;
	}

	public void setData(ArrayList<ArrayList<Object>> origData) {
		this.data = origData;
	}
*/
	public QuandlEOD() {}
	
	public QuandlEOD(QuandlWsEOD eod) {
		this.source_name = eod.getSource_name();
		this.source_code = eod.getSource_code();
		this.code = eod.getCode();
		this.name = eod.getName();
		this.urlize_name = eod.getUrlize_name();
		this.display_url = eod.getDisplay_url();
		this.description = eod.getDescription().substring(0, 255);
		this.setUpdated_at(eod.getUpdated_at());//String
		this.frequency =  eod.getFrequency();
		this.from_date = eod.getFrom_date();
		this.to_date= eod.getTo_date() ;
		this.column_names = eod.getColumn_names().toString();
		this._private = eod.is_private();
		this.type = eod.getType();
		this.premium = eod.isPremium();	
	}

	@OneToMany(mappedBy="quandlEOD", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	List<QuandlDetail> details = new ArrayList<QuandlDetail>();	
	public List<QuandlDetail>  getDetails() {
		return details;
	}

	public void setDetails(List<QuandlDetail> theData) {
		this.details = theData;	}

	public String getCode() {
		return code;
	}

	public String getColumn_names() {
		return column_names;
	}

	public String getDescription() {
		return description;
	}

	public String getDisplay_url() {
		return display_url;
	}

	public Object getErrors() {
		return errors;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getFrom_date() {
		return from_date;
	}

	public Long getId() {
		return id;
	}
/*
	public List<String> getLstData() {
		return lstData;
	}
*/
	public String getName() {
		return name;
	}

	public String getSource_code() {
		return source_code;
	}

	public String getSource_name() {
		return source_name;
	}

	public String getTo_date() {
		return to_date;
	}

	public String getType() {
		return type;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public String getUrlize_name() {
		return urlize_name;
	}

	public boolean is_private() {
		return _private;
	}

	public boolean isPremium() {
		return premium;
	}

	public void set_private(boolean _private) {
		this._private = _private;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setColumn_names(List<String> pColumn_names) {
		this.column_names = pColumn_names.toString();
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDisplay_url(String display_url) {
		this.display_url = display_url;
	}

	public void setErrors(Object errors) {
		this.errors = errors.toString();
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public void setId(Long id) {
		this.id = id;//(long) id.hashCode()
	}
/*
	public void setLstData(List<String> lstData) {
		this.lstData = lstData;
	}
*/
	public void setName(String name) {
		this.name = name;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}
/*
	public Object [][] getData() {
		return data;
	}

	public void setData(Object theData[][]) {
		this.data = theData;
	}
*/

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public void setUrlize_name(String urlize_name) {
		this.urlize_name = urlize_name;
	}	

}
