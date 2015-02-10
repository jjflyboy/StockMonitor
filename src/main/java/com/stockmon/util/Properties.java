/*

 */

package com.stockmon.util;

import java.io.InputStream;
import java.io.IOException;

/**
 * @author Kory.Paulsen@EuroRSCG.com
 */
public class Properties {

    public static final String RUNDMC2_PROPERTIES = "rundmc2.properties";    
    private static Properties properties;
    private java.util.Properties props;
    private String environment;
    
    private static final String ENVIRONMENT = "environment";
    
    private Properties()
        throws IOException
    {
        
        InputStream is = Properties.class.getResourceAsStream(RUNDMC2_PROPERTIES);
        props = new java.util.Properties();
        props.load( is );
        environment = props.getProperty(ENVIRONMENT) + ".";
    }
    
    public static Properties getInstance()
        throws IOException
    {
        if (properties == null)
            properties = new Properties();
        return properties;
    }
    
    public String get(String property)
    {
        return props.getProperty(environment + property);
    }
    
    public String getEnvironment()
    {
        return environment.substring(0, environment.length() -1);
    }

}
