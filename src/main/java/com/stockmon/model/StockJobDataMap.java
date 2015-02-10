/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockmon.model;

import java.util.Date;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author gjerome
 */
//(collection=Constants.Mongo.JOB_DATA_MAP_COLLECTION)
//@Document
public class StockJobDataMap {
    
    public StockJobDataMap() {}

    public StockJobDataMap(String jobName, String country, boolean productRun, boolean nonProductRun,
            String lastId, long progress, long numTickers, String tickers, char pullType, Date asOf,
            Date fireTime)
    {
        this.jobName = jobName;
        this.country = country;
        this.productRun = productRun;
        this.nonProductRun = nonProductRun;
        this.lastId = lastId;
        this.progress = progress;
        this.numTickers = numTickers;
        this.tickers = tickers;
        this.pullType = pullType;
        this.asOfDate = asOf;
        this.scheduledFireTime = fireTime;
//        this.collectionName = collection;
    }
//    @Id
    private String jobName;
    /**
     * @return the jobName
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName the jobName to set
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    
    private char pullType;
    /**
     * @return the pullType
     */
    public char getPullType() {
        return pullType;
    }

    /**
     * @param pullType the pullType to set
     */
    public void setPullType(char pullType) {
        this.pullType = pullType;
    }

    private String lastId = null;
    /**
     * @return the lastId
     */
    public String getLastId() {
        return lastId;
    }

    /**
     * @param lastId the lastId to set
     */
    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    private String country = null;    
    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    private long numTickers = 0L;
    /**
     * @return the numTickers
     */
    public long getNumTickers() {
        return numTickers;
    }

    /**
     * @param numTickers the numTickers to set
     */
    public void setNumTickers(long numTickers) {
        this.numTickers = numTickers;
    }

    /*
    private boolean runSuccess;
    /**
     * @return the runSuccess
     *
    public boolean isRunSuccess() {
        return runSuccess;
    }

    /**
     * @param runSuccess the runSuccess to set
     *
    public void setRunSuccess(boolean runSuccess) {
        this.runSuccess = runSuccess;
    }
    */

    private Date asOfDate;
    /**
     * @return the asOfDate
     */
    public Date getAsOfDate() {
        return asOfDate;
    }

    /**
     * @param asOfDate the asOfDate to set
     */
    public void setAsOfDate(Date asOfDate) {
        this.asOfDate = asOfDate;
    }

    private String tickers;
    /**
     * @return the tickers, a comma delimited list of tickers to process for a given run
     */
    public String getTickers() {
        return tickers;
    }

    /**
     * @param tickers the tickers to set
     */
    public void setTickers(String tickers) {
        this.tickers = tickers;
    }

    private long progress = 0L;
    /**
     * @return the progress
     */
    public long getProgress() {
        return progress;
    }

    /**
     * @param progress the progress to set
     */
    public void setProgress(long progress) {
        this.progress = progress;
    }

    private boolean productRun;
    /**
     * @return the productRun
     */
    public boolean isProductRun() {
        return productRun;
    }

    /**
     * @param productRun the productRun to set
     */
    public void setProductRun(boolean productRun) {
        this.productRun = productRun;
    }

    private boolean nonProductRun;
    /**
     * @return the nonProductRun
     */
    public boolean isNonProductRun() {
        return nonProductRun;
    }

    /**
     * @param nonProductRun the nonProductRun to set
     */
    public void setNonProductRun(boolean nonProductRun) {
        this.nonProductRun = nonProductRun;
    }
    
    private Date scheduledFireTime;
    /**
     * @return the scheduledFireTime
     */
    public Date getScheduledFireTime() {
        return scheduledFireTime;
    }

    /**
     * @param scheduledFireTime the scheduledFireTime to set
     */
    public void setScheduledFireTime(Date scheduledFireTime) {
        this.scheduledFireTime = scheduledFireTime;
    }    
}
