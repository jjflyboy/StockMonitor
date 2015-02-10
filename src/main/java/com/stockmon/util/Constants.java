/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockmon.util;

import java.util.Date;

/**
 *
 * @author gjerome
 */
public class Constants {
    public static final String USERNAME = "jjflyboy";
    public static final String PASSWORD = "Arnold14";
    public static final String DEBUG = "debug";
    public static final String ENDPOINT = "http://ws.eoddata.com/data.asmx";
    //Quandl
    public static final String AUTH_TOKEN = "nAkUfqtCGMzXyeAsMJxm"; 
/*	
        public static final String SESSION_AUTH = "dmc2_auth";
        public static final String SUPER_ADMIN_AUTH = "superadmin_auth";        
        public static final String SUPERUSER_NAME = "SuperUser";
        public static final String SUPER_USER_PASSWORD = "$up3rU$3r?";
        public static final char NULL_CHAR = '\0';
        public static final String CRLF = "<br/>";
        public static final String INDEX_HISTORY_FOOTER = "* Past Performance is not indicative of future results.";
        public static final String INFO = "INFO";
        public static final String WRITE_TO_DB = "write2db";
        public static final String TICKERS = "tickers";
        public static final String NUMBER_OF_TICKERS = "numTickers";
//        public static final String CSV_PATH = "/data/csv/";
//        public static final String CHART_PATH = "/data/charts/";
        public static final String CHART_FOLDER_CURRENT = "data.ChartFolderCurrNode";
        public static final String CHART_FOLDER_OPPOSITE = "data.ChartFolderOppNode";
        public static final String CSV_FOLDER_CURRENT = "data.CSVFolderCurrNode";
        public static final String CSV_FOLDER_OPPOSITE = "data.CSVFolderOppNode";
        public static final String COUNTRY = "country";
        public static final String COUNTRY_US = "US";
        public static final String COUNTRY_CA = "CA";
        public static final String CA_FUNDS = "DVX,PBO,VIX";
        public static final String COUNTRY_ALL = "ALL";
        public static final String DO_PRODUCT_RUN = "productRun";
        public static final String DO_NON_PRODUCT_RUN = "nonProductRun";
        public static final String DO_SINGLE_RUN = "singleRun";
        public static final String DO_RESCHED_RUN = "reschedRun";
        public static final String CRON_RUNNING = "cronRunning";
        public static final int TECH_CONDITIONS_SZ = 10;//Size of the String array that holds tech conditions
        public static final int PERFORMANCE_SET_GRACE_NUM_DAYS = 1;//changed from 2 per Giancarlo (8/2/13)
        //For Index Components & Sectors info for MSCI products (EMLB,EMSA,INP,MFLA); Jira # BLKDASH-23
        public static final int TEN_DAY_LAG_NUM_DAYS = 10;
        public static final String COUPON_DAILY_EXCEPTION = "IMLP";
        public static final String COUPON_GEMS_PRODUCTS = "AYT,JEM,PGD";
        public static final String ENV_LOCAL = "local";
        public static final String ENV_DEV = "dev";
        public static final String ENV_STAGE = "stage";
        public static final String ENV_PROD = "prod";
        public static final String SYSTEM = "dmc";
        public static final String GFF2_ENVELOPE_FILE = "getFundFacts2.xml";
        public static final String ORIGFFS_ENVELOPE_FILE = "getFundFacts2OrigFFS.xml";
*/        
        
    
    public static class Mongo {
        public static final String ID = "_id";
        public static final String DB_NAME = "ipath2011";
        public static final String TICKER_META_COLLECTION = "tickerMetadata";        
        public static final String TICKER = "ticker";        
        public static final String CATEGORY = "category";     
        public static final String COMMODITIES_CATEGORY = "commodities";
        public static final String COMMODITIES_CATEGORIES = "commodities,commodities-single,commodities-sector,commodities-broad";
        public static final String INDEX_INCEPTION = "idxInception";
        public static final String FUND_INCEPTION = "fundInception";
        public static final String TICKER_PROPERTIES = "tickerProperties";
        public static final String RUNS_COLLECTION = "runs";        
        public static final String LOG_COLLECTION = "log";       
        public static final String IPATH_COLLECTION = "ipath";       
        public static final String NAV_DATA_COLLECTION = "nav_data";
        public static final String INDEX_HISTORY_COLLECTION = "index_history";
        public static final String SECTORS_HISTORY_COLLECTION = "sectors_history";
        public static final String SECTORS = "sectors";
        public static final String DOLLARWEIGHTS_HISTORY_COLLECTION = "dollarweights_history";
//        public static final String DISTRIBUTIONS_HISTORY_COLLECTION = "distributions_history";
        public static final String PRODUCTS_COLLECTION = "products";//all products
        public static final String JOB_DATA_MAP_COLLECTION = "job_data_map";
//        public static final String SCHEDULER_ABORT_COLLECTION = "scheduler_abort_request";
        public static final String SCHEDULER_COLLECTION = "scheduler";
//        public static final String TICKER_RUN_DETAILS_COLLECTION = "ticker_run_details";
        
        //Mongo runs collection constants
        public static final String TICKER_CATEGORIES = "tickerMetadata";
        public static final String SCHED_FIRE_TIME = "schedTime";
//        public static final String LAST_SCHED_FIRE_TIME = "lastSchedTime";
        public static final String AS_OF_DATE = "asOfDate";
        public static final String AS_OF_DATE_CA = "asOfDateCA";//For dashboard page/rerun button conditional display
        public static final String HDR_PULL_TYPE = "pullType";
        public static final String HDR_LABEL = "label";
        public static final String HDR_NUM_RUNS = "numRuns";
        public static final String RUN_DETAILS = "runDetails";
        public static final String COMPLETE = "complete";
        public static final String SUCCESS = "success"; 
        public static final String PROGRESS = "progress";        
        public static final String TOTAL = "total";        
        public static final String FAIL_NOTES = "failNotes";        
        public static final String FAIL_STEP = "failStep";        
        public static final String CREATED_DATE = "createdDate";
        public static final String PULL_TYPE = "pullType";
        public static final char PULL_TYPE_AUTOMATIC = 'A';
        public static final char PULL_TYPE_MANUAL = 'M';

        //Mongo ipath collection constants
        public static final String HDR_PRODUCT_DATA = "productData";
        public static final String HDR_RUN_TIME = "runTime";
        public static final String PRODUCT_TICKER = "ticker";
        public static final String PRODUCT_ID = "productID";
        public static final String FUND_FACT_SET = "FundFactSet";
        public static final String PRODUCT_DATA_ASOF = "ProductDataAsOf";
        public static final String PRODUCT_DATA_MARKET_CAP = "ProductDataMarketCap";
        public static final String PRODUCT_DATA_SHARES_OUTSTANDING = "ProductDataSharesOutstanding";
        public static final String PRODUCT_DATA_DAILY_INDICATIVE_VALUE = "ProductDataDailyIndicativeValue";
        public static final String DOLLAR_WEIGHTS = "DollarWeights";
        public static final String DOLLAR_WEIGHTS_NAME = "DollarWeightsName";
        public static final String DOLLAR_WEIGHTS_TICKER = "DollarWeightsTicker";
        public static final String DOLLAR_WEIGHTS_VALUE = "DollarWeightsValue";
        public static final String DOLLAR_WEIGHTS_EXCHANGE = "DollarWeightsExchange";
        public static final String DOLLAR_WEIGHTS_SECTOR = "DollarWeightsSector";
        public static final String ENTITY_ATTRIBUTES = "EntityAttributes";
        public static final String ENTITY_ATTRIBUTE_TYPES = "EntityAttributeTypes";
        public static final String PRODUCT_DATA_FINANCING_LEVEL = "ProductDataFinancingLevel";
        public static final String PRODUCT_DATA_PARTICIPATION_RATE = "ProductDataParticipationRate";
        public static final String PRODUCT_DATA_INDEX_EXPOSURE  = "ProductDataIndexExposure";
        public static final String PRODUCT_DATA_TBILL_AMOUNT = "ProductDataTBillAmount";
        public static final String PROFILE_NAME = "ProfileName";
        public static final String PROFILE_PRIMARY_EXCHANGE = "ProfilePrimaryExchange";
        public static final String PROFILE_TICKER = "ProfileTicker";
        public static final String PROFILE_INTRADAY_INDICATIVE_VALUE_TICKER = "ProfileIntradayIndicativeValueTicker";
        public static final String PROFILE_PARTICIPATION_TICKER = "ProfileParticipationTicker";
        public static final String PROFILE_BLOOMBERG_ETN_KEYSTROKE = "ProfileBloombergETNKeystroke";
        public static final String PROFILE_AUTOMATIC_TERMINATION_LEVEL = "ProfileAutomaticTerminationLevel";
        public static final String PROFILE_BLOOMBERG_INDEX_TICKER = "ProfileBloombergIndexTicker";
        public static final String PROFILE_CUSIP = "ProfileCUSIP";
        public static final String PROFILE_INCEPTION_DATE = "ProfileInceptionDate";
        public static final String PROFILE_MATURITY_DATE = "ProfileMaturityDate";
        public static final String PROFILE_FINANCING_RATE = "ProfileFinancingRate";
        public static final String PROFILE_FINANCING_RATE_BPS = "ProfileFinancingRateBPS";
        public static final String PROFILE_YEARLY_FEE = "ProfileYearlyFee";
        public static final String PROFILE_DEPOSIT_RATE = "ProfileDepositRate";
        public static final String PROFILE_BORROW_RATE = "ProfileBorrowRate";
        public static final String PROFILE_FINANCING_LEVEL_TICKER = "ProfileFinancingLevelTicker";
        public static final String PROFILE_TBILL_AMOUNT_TICKER = "ProfileTBillAmountTicker";
        
        public static final String PERFORMANCE_INDEX_SET = "PerformanceIndexSet";
        public static final String PERFORMANCE_INDEX_SET_ASOF = "PerformanceIndexSetAsOf";
        public static final String PERFORMANCE_INDEX_SET_TOT_CUM_1M = "PerformanceIndexSetTotCum1M";
        public static final String PERFORMANCE_INDEX_SET_TOT_CUM_3M = "PerformanceIndexSetTotCum3M";
        public static final String PERFORMANCE_INDEX_SET_TOT_CUM_6M = "PerformanceIndexSetTotCum6M";
        public static final String PERFORMANCE_INDEX_SET_TOT_CUM_1Y = "PerformanceIndexSetTotCum1Y";
        public static final String PERFORMANCE_INDEX_SET_TOT_CUM_YTD = "PerformanceIndexSetTotCumYTD";
        public static final String PERFORMANCE_INDEX_SET_TOT_AVG_ANN_3Y = "PerformanceIndexSetTotAvgAnn3Y";
        public static final String PERFORMANCE_INDEX_SET_TOT_AVG_ANN_5Y = "PerformanceIndexSetTotAvgAnn5Y";
        public static final String PERFORMANCE_INDEX_SET_TOT_AVG_ANN_10Y = "PerformanceIndexSetTotAvgAnn10Y";
        public static final String PERFORMANCE_INDEX_SET_TOT_SFI = "PerformanceIndexSetTotSFI";
                        
        public static final String PERFORMANCE_FUND_SET = "PerformanceFundSet";
        public static final String PERFORMANCE_FUND_SET_ASOF = "PerformanceFundSetAsOf";
        public static final String PERFORMANCE_FUND_SET_TOT_CUM_1M = "PerformanceFundSetTotCum1M";
        public static final String PERFORMANCE_FUND_SET_TOT_CUM_3M = "PerformanceFundSetTotCum3M";
        public static final String PERFORMANCE_FUND_SET_TOT_CUM_6M = "PerformanceFundSetTotCum6M";
        public static final String PERFORMANCE_FUND_SET_TOT_CUM_1Y = "PerformanceFundSetTotCum1Y";
        public static final String PERFORMANCE_FUND_SET_TOT_CUM_YTD = "PerformanceFundSetTotCumYTD";
        public static final String PERFORMANCE_FUND_SET_TOT_AVG_ANN_3Y = "PerformanceFundSetTotAvgAnn3Y";
        public static final String PERFORMANCE_FUND_SET_TOT_AVG_ANN_5Y = "PerformanceFundSetTotAvgAnn5Y";
        public static final String PERFORMANCE_FUND_SET_TOT_AVG_ANN_10Y = "PerformanceFundSetTotAvgAnn10Y";
        public static final String PERFORMANCE_FUND_SET_TOT_SFI = "PerformanceFundSetTotSFI";
        
        public static final String PRODUCT_DATA = "productData";
        public static final String MARKET_DATA = "marketData";
        public static final String COUPON_DATA = "distributionData";
        public static final String MARKET_PERFORMANCE_SET = "MarketPerformanceSet";
        public static final String MARKET_PERFORMANCE_SET_ASOF = "MarketPerformanceSetAsOf";
        public static final String MARKET_PRICE_RETURNS_CUM_1M = "MarketPriceReturnsCum1M";
        public static final String MARKET_PRICE_RETURNS_CUM_3M = "MarketPriceReturnsCum3M";
        public static final String MARKET_PRICE_RETURNS_CUM_6M = "MarketPriceReturnsCum6M";
        public static final String MARKET_PRICE_RETURNS_CUM_YTD = "MarketPriceReturnsCumYTD";
        public static final String MARKET_PRICE_RETURNS_AVG_ANN_1Y = "MarketPriceReturnsAvgAnn1Y";
        public static final String MARKET_PRICE_RETURNS_AVG_ANN_3Y = "MarketPriceReturnsAvgAnn3Y";
        public static final String MARKET_PRICE_RETURNS_AVG_ANN_5Y = "MarketPriceReturnsAvgAnn5Y";
        public static final String MARKET_PRICE_RETURNS_AVG_ANN_10Y = "MarketPriceReturnsAvgAnn10Y";
        public static final String MARKET_PRICE_RETURNS_TOT_SFI = "MarketPriceReturnsTotSFI";                      
    
        public static final String CORRELATIONS_ASOF = "CorrelationsAsOf";
        public static final String CORRELATION_INDEX_NAME = "CorrelationIndexName";
        public static final String CORRELATION_VALUE= "CorrelationValue";
        public static final String SECTOR_WEIGHTINGS_ASOF = "SectorWeightingsAsOf";
        public static final String SECTOR_WEIGHTINGS_NAME = "SectorWeightingsName";
        public static final String SECTOR_WEIGHTINGS_VALUE = "SectorWeightingsValue";
        
        public static final String CORRELATIONS = "correlations";
        public static final String CORRELATIONS_ITEM = "item";
        public static final String ITEM_INDEX_NAME = "IndexName";
        public static final String ITEM_VALUE = "Value";
        public static final String ITEM_MONTHS = "Months";

        public static final String INDEX_COMPONENTS_ASOF = "IndexComponentsAsOf";
        public static final String COMPONENTS_COMPONENT = "Component";
        public static final String COMPONENT_COMMODITY_NAME = "CommodityName";
        public static final String COMPONENT_COMMODITY_TICKER = "CommodityTicker";
        public static final String COMPONENT_COMMODITY_VALUE = "CommodityValue";
        public static final String COMPONENT_COMMODITY_TRADING_FACILITY = "CommodityTradingFacility";
        public static final String COMPONENT_COMMODITY_SECTOR = "CommoditySector";
        public static final String COMPONENTS = "components";
        public static final String HISTORICAL_COMPONENT = "historicalComponent";
        
        //Mongo log collection constants        
        public static final String LOG_TIMESTAMP = "timestamp";
        
        //Mongo scheduler collection constants
        public static final String SYSTEM_NAME = "sysName";
        public static final String REQUEST_TYPE = "reqType";
        public static final String REQUEST_TIME = "reqTime";
    }
    
    public static class Quartz {
        //Quartz Scheduler constants
        public static final String SCHEDULER_INSTANCE = "schedularInstance";
        public static final String HOST = "host";
        public static final String SCHEDULER_NODE = "schedulerNode";
        public static final String JOB_NAME = "jobName";        
//        public static final String HISTORY_CRON_JOBNAME = "DMC2HistoryCronJob";
        public static final String DMC_JOB_DATA_MAP = "jobDataMap";
        
        public static final String US_PRODUCT_DATA_CRON_SCHEDULE = "scheduler.USProductDataCronSchedule";
        public static final String US_NONPRODUCT_DATA_CRON_SCHEDULE = "scheduler.USNonProductDataCronSchedule";
        public static final String CA_PRODUCT_DATA_CRON_SCHEDULE = "scheduler.CAProductDataCronSchedule";
        public static final String CA_NONPRODUCT_DATA_CRON_SCHEDULE = "scheduler.CANonProductDataCronSchedule";
    }
    
    public static class DataCategories {
        public static final String PRODUCT_DATA_POINT = "ProductDataPoint";
        public static final String PRODUCT_HOLDINGS = "ProductHoldings";
        public static final String PRODUCT_PROFILE = "ProductProfile";
        public static final String PRODUCT_PERFORMANCE = "ProductPerformance";
        public static final String PRODUCT_ANALYTICS = "ProductAnalytics";
        
        public static final String DISTRIBUTION_DATA = "distributionData";
        
        public static final String MARKET_DATA = "marketData";
    }
    
    public static class Rules {
        //Rule Names
        public static final String TICKER_NAME = "TickerName";
        public static final String PRODUCT_ID = "ProductID";
        public static final String FUND_FACT_SET = "FundFactSet";
        public static final String PRODUCT_DATA_ASOF = "ProductDataAsOf";
        public static final String PRODUCT_DATA_MARKET_CAP = "ProductDataMarketCap";
        public static final String PRODUCT_DATA_SHARES_OUTSTANDING = "ProductDataSharesOutstanding";
        public static final String PRODUCT_DATA_DAILY_INDICATIVE_VALUE = "ProductDataDailyIndicativeValue";
        public static final String DOLLAR_WEIGHTS = "DollarWeights";
        public static final String DOLLAR_WEIGHTS_NAME = "DollarWeightsName";
        public static final String DOLLAR_WEIGHTS_TICKER = "DollarWeightsTicker";
        public static final String DOLLAR_WEIGHTS_VALUE = "DollarWeightsValue";
        public static final String DOLLAR_WEIGHTS_EXCHANGE = "DollarWeightsExchange";
        public static final String DOLLAR_WEIGHTS_SECTOR = "DollarWeightsSector";
        public static final String ENTITY_ATTRIBUTES = "EntityAttributes";
        public static final String ENTITY_ATTRIBUTE_TYPES = "EntityAttributeTypes";
        public static final String PRODUCT_DATA_FINANCING_LEVEL = "ProductDataFinancingLevel";
        public static final String PRODUCT_DATA_PARTICIPATION_RATE = "ProductDataParticipationRate";
        public static final String PRODUCT_DATA_INDEX_EXPOSURE  = "ProductDataIndexExposure";
        public static final String PRODUCT_DATA_TBILL_AMOUNT = "ProductDataTBillAmount";
        public static final String PROFILE_NAME = "ProfileName";
        public static final String PROFILE_PRIMARY_EXCHANGE = "ProfilePrimaryExchange";
        public static final String PROFILE_TICKER = "ProfileTicker";
        public static final String PROFILE_INTRADAY_INDICATIVE_VALUE_TICKER = "ProfileIntradayIndicativeValueTicker";
        public static final String PROFILE_PARTICIPATION_TICKER = "ProfileParticipationTicker";
        public static final String PROFILE_BLOOMBERG_ETN_KEYSTROKE = "ProfileBloombergETNKeystroke";
        public static final String PROFILE_AUTOMATIC_TERMINATION_LEVEL = "ProfileAutomaticTerminationLevel";
        public static final String PROFILE_BLOOMBERG_INDEX_TICKER = "ProfileBloombergIndexTicker";
        public static final String PROFILE_CUSIP = "ProfileCUSIP";
        public static final String PROFILE_INCEPTION_DATE = "ProfileInceptionDate";
        public static final String PROFILE_MATURITY_DATE = "ProfileMaturityDate";
        public static final String PROFILE_FINANCING_RATE = "ProfileFinancingRate";
        public static final String PROFILE_FINANCING_RATE_BPS = "ProfileFinancingRateBPS";
        public static final String PROFILE_YEARLY_FEE = "ProfileYearlyFee";
        public static final String PROFILE_DEPOSIT_RATE = "ProfileDepositRate";
        public static final String PROFILE_BORROW_RATE = "ProfileBorrowRate";
        public static final String PROFILE_FINANCING_LEVEL_TICKER = "ProfileFinancingLevelTicker";
        public static final String PROFILE_TBILL_AMOUNT_TICKER = "ProfileTBillAmountTicker";
        
        public static final String PERFORMANCE_RULE_DEFAULT_VALUE = "Error, unknown performance rule Enum";
        public static final String PERFORMANCE_INDEX_SET = "PerformanceIndexSet";        
        public static final String PERFORMANCE_INDEX_SET_ASOF = "PerformanceIndexSet_PerformanceSetAsOf";
        public static final String PERFORMANCE_INDEX_SET_TOT_CUM_1M = "PerformanceIndexSet_PerformanceSetTotCum1M";
        public static final String PERFORMANCE_INDEX_SET_TOT_CUM_3M = "PerformanceIndexSet_PerformanceSetTotCum3M";
        public static final String PERFORMANCE_INDEX_SET_TOT_CUM_6M = "PerformanceIndexSet_PerformanceSetTotCum6M";
        public static final String PERFORMANCE_INDEX_SET_TOT_CUM_1Y = "PerformanceIndexSet_PerformanceSetTotCum1Y";
        public static final String PERFORMANCE_INDEX_SET_TOT_CUM_YTD = "PerformanceIndexSet_PerformanceSetTotCumYTD";
        public static final String PERFORMANCE_INDEX_SET_TOT_AVG_ANN_3Y = "PerformanceIndexSet_PerformanceSetTotAvgAnn3Y";
        public static final String PERFORMANCE_INDEX_SET_TOT_AVG_ANN_5Y = "PerformanceIndexSet_PerformanceSetTotAvgAnn5Y";
        public static final String PERFORMANCE_INDEX_SET_TOT_AVG_ANN_10Y = "PerformanceIndexSet_PerformanceSetTotAvgAnn10Y";
        public static final String PERFORMANCE_INDEX_SET_TOT_SFI = "PerformanceIndexSet_PerformanceSetTotSFI";
                        
        public static final String PERFORMANCE_FUND_SET = "PerformanceFundSet";
        public static final String PERFORMANCE_FUND_SET_ASOF = "PerformanceFundSet_PerformanceSetAsOf";
        public static final String PERFORMANCE_FUND_SET_TOT_CUM_1M = "PerformanceFundSet_PerformanceSetTotCum1M";
        public static final String PERFORMANCE_FUND_SET_TOT_CUM_3M = "PerformanceFundSet_PerformanceSetTotCum3M";
        public static final String PERFORMANCE_FUND_SET_TOT_CUM_6M = "PerformanceFundSet_PerformanceSetTotCum6M";
        public static final String PERFORMANCE_FUND_SET_TOT_CUM_1Y = "PerformanceFundSet_PerformanceSetTotCum1Y";
        public static final String PERFORMANCE_FUND_SET_TOT_CUM_YTD = "PerformanceFundSet_PerformanceSetTotCumYTD";
        public static final String PERFORMANCE_FUND_SET_TOT_AVG_ANN_3Y = "PerformanceFundSet_PerformanceSetTotAvgAnn3Y";
        public static final String PERFORMANCE_FUND_SET_TOT_AVG_ANN_5Y = "PerformanceFundSet_PerformanceSetTotAvgAnn5Y";
        public static final String PERFORMANCE_FUND_SET_TOT_AVG_ANN_10Y = "PerformanceFundSet_PerformanceSetTotAvgAnn10Y";
        public static final String PERFORMANCE_FUND_SET_TOT_SFI = "PerformanceFundSet_PerformanceSetTotSFI";
        
        public static final String MARKET_PERFORMANCE_SET = "MarketPerformanceSet";
        public static final String MARKET_PERFORMANCE_SET_ASOF = "MarketPerformanceSet_PerformanceSetAsOf";
        public static final String MARKET_PRICE_RETURNS_CUM_1M = "MarketPerformanceSet_MarketPriceReturnsCum1M";
        public static final String MARKET_PRICE_RETURNS_CUM_3M = "MarketPerformanceSet_MarketPriceReturnsCum3M";
        public static final String MARKET_PRICE_RETURNS_CUM_6M = "MarketPerformanceSet_MarketPriceReturnsCum6M";
        public static final String MARKET_PRICE_RETURNS_CUM_YTD = "MarketPerformanceSet_MarketPriceReturnsCumYTD";
        public static final String MARKET_PRICE_RETURNS_AVG_ANN_1Y = "MarketPerformanceSet_MarketPriceReturnsAvgAnn1Y";
        public static final String MARKET_PRICE_RETURNS_AVG_ANN_3Y = "MarketPerformanceSet_MarketPriceReturnsAvgAnn3Y";
        public static final String MARKET_PRICE_RETURNS_AVG_ANN_5Y = "MarketPerformanceSet_MarketPriceReturnsAvgAnn5Y";
        public static final String MARKET_PRICE_RETURNS_AVG_ANN_10Y = "MarketPerformanceSet_MarketPriceReturnsAvgAnn10Y";
        public static final String MARKET_PRICE_RETURNS_TOT_SFI = "MarketPerformanceSet_MarketPriceReturnsTotSFI";                      
        public static final String CORRELATIONS_ASOF = "Correlations_AsOf";
        public static final String CORRELATION_INDEX_NAME = "CorrelationIndexName";
        public static final String CORRELATION_VALUE= "CorrelationValue";
        public static final String SECTOR_WEIGHTINGS_ASOF = "SectorWeightingsAsOf";
        public static final String SECTOR_WEIGHTINGS_NAME = "SectorWeightingsName";
        public static final String SECTOR_WEIGHTINGS_VALUE = "SectorWeightingsValue";
        public static final String INDEX_COMPONENTS_ASOF = "IndexComponentsAsOf";
        public static final String INDEX_COMPONENTS_MONTH_DELAY = "COW,DJP,GSP,JJA,JJE,JJG,JJM,JJP,JJS";
        public static final String INDEX_COMPONENTS_MID_MONTH = "BCM,BLNG,DIRT,GRWN,HEVY,LSTK,ONG,SBV,WEET";
        public static final String INDEX_COMPONENTS_10DAY_DELAY = "EMLB,EMSA,INP,MFLA";//Also includes Sector data
        public static final String SECTOR_WEIGHTINGS_MONTH_DELAY = "COW,DJP,GSP,JJA,JJE,JJG,JJM,JJP,JJS";
        public static final String SECTOR_WEIGHTINGS_MIDMONTH = "BCM,BLNG,DIRT,GRWN,HEVY,LSTK,ONG,SBV,WEET";
        public static final Date   BAD_DATE = new Date(0L);
        
    }
    
    public class XML {
        public static final String TAG_TICKER = "ticker";
        public static final String HISTORY = "<lang:string>HIST</lang:string>";
        public static final String SOAP_DISTRIB_INCEPT_DT = "INCEPTDATE";        
        public static final String INCEPTDATE = "20111201";
        public static final String INSTRUMENT_TYPE_INDEX = "instrumentType='Index'";                
    }
    
    
}
