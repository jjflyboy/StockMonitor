/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robustsys.stockmon.rest.client;

//import com.havasedge.rest.bean.iPath;

//import com.havasedge.rest.bean.iPath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;





import com.robustsys.stockmon.beans.QuandlData;
//import com.robustsys.stockmon.beans.QuandlData;
import com.robustsys.stockmon.beans.QuandlWsEOD;
import com.stockmon.service.QuandlService;
import com.stockmon.service.QuandlServiceImpl;

/**
 *
 * @author gjerome
 */
public class quandlClient {
    public static void main(String[] args) {    
            RestTemplate restTemplate = getTemplate();
            listXML(restTemplate);
        
    }
    
        
    public static void listXML(RestTemplate rest) {
            HttpEntity<String> entity = prepareGet(MediaType.APPLICATION_JSON);

            //*** NB (JJ): The URI below is the correct way to call these services ***********
            ResponseEntity<QuandlWsEOD> response = rest.exchange(
                            "https://www.quandl.com/api/v1/datasets/WIKI/MSFT.json?auth_token=nAkUfqtCGMzXyeAsMJxm&sort_order=asc&exclude_headers=false&trim_start=2012-11-01&trim_end=2014-11-03&collapse=daily", 
                            HttpMethod.GET, entity, QuandlWsEOD.class);

            QuandlWsEOD eodData = response.getBody();
            QuandlServiceImpl qsi = new QuandlServiceImpl();
            ArrayList<QuandlData> qList = qsi.ObjArrayToList( eodData.getData() );
/*            
            Iterator<QuandlData> it = eodData.iterator();
            
            while(it.hasNext()) {
            	QuandlData ele = it.next();
            	System.out.println("Date: " + ele.getAsOf() + "		Close: " + ele.getClose());
            }
*/            
    }
    
    private static RestTemplate getTemplate() {
            ApplicationContext ctx = new FileSystemXmlApplicationContext(
            		"src/main/webapp/WEB-INF/classes/applicationContext.xml", "src/main/webapp/WEB-INF/classes/rest-servlet.xml"); 
            RestTemplate template = (RestTemplate) ctx.getBean("restTemplate");
            ((AbstractApplicationContext) ctx).close();       
            return template;
    }

    private static HttpEntity<String> prepareGet(MediaType type) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(type);
            HttpEntity<String> entity = new HttpEntity<String>(headers);
            return entity;
    }
    
}
