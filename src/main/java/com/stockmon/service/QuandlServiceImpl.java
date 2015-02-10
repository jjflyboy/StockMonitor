/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockmon.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.http.*;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

















import com.robustsys.stockmon.beans.QuandlData;
import com.robustsys.stockmon.beans.QuandlWsEOD;
import com.stockmon.model.QuandlDetail;
import com.stockmon.model.QuandlEOD;
//import com.stockmon.model.QuandlDetail;
//import com.stockmon.model.QuandlEOD;
import com.stockmon.repository.QuandlEODRepository;

/**
 *
 * @author gjerome
 */
@Service("quandlService")
public class QuandlServiceImpl implements QuandlService
{
	@Autowired
	private QuandlEODRepository qeodRepo;
	
    public void StoreEOD() {    
        RestTemplate restTemplate = getTemplate();
        QuandlWsEOD eodWsData = callWebSvc(restTemplate);   
        ArrayList<QuandlData> qList = ObjArrayToList( eodWsData.getData() );
        
        QuandlEOD qEod = new QuandlEOD(eodWsData);
        ArrayList<QuandlDetail> details = setDetails(qList, qEod);
        qEod.setDetails(details);
        SaveIt(qEod);//NB: Unable to access methods of qeodRepo from here !@#@@%!!
    }
    
    private ArrayList<QuandlDetail> setDetails(ArrayList<QuandlData> qList,
    		QuandlEOD qEod) {
		// TODO Auto-generated method stub
    	ArrayList<QuandlDetail> details = new ArrayList<QuandlDetail>();
    	QuandlDetail eodDetail;
    	for(QuandlData wsData : qList) {
    		eodDetail = new QuandlDetail(qEod, wsData);
    		details.add(eodDetail);
    	}
		return details;
	}
    
	@Transactional
	private void SaveIt(QuandlEOD eodData) {
    	qeodRepo.save(eodData);
    }

/*    
    @Transactional
	public Long save(QuandlEOD header) {
    	EntityManager em = emf.createEntityManager();
    	try {
    		em.getTransaction().begin();
    		em.persist(header);
    		em.getTransaction().commit();
    	}
    	finally {
    		em.close();
    	}
    	em.persist(header);
		return header.getId();
	}
*/
    public QuandlWsEOD callWebSvc(RestTemplate rest) {
            HttpEntity<String> entity = prepareGet(MediaType.APPLICATION_JSON);

            //*** NB (JJ): The URI below is the correct way to call these services ***********
            ResponseEntity<QuandlWsEOD> response = rest.exchange(
            		//removed from below after excludeHeaders=false: &trim_start=2012-11-01&trim_end=2014-11-03
                            "https://www.quandl.com/api/v1/datasets/WIKI/MSFT.json?auth_token=nAkUfqtCGMzXyeAsMJxm&sort_order=asc&exclude_headers=false&trim_start=2014-11-01&trim_end=2015-01-23&collapse=daily", 
                            HttpMethod.GET, entity, QuandlWsEOD.class);

            QuandlWsEOD eodData = response.getBody();            
            return eodData;
    }
    
    private RestTemplate getTemplate() {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:rest-servlet.xml");
        RestTemplate template = (RestTemplate) ctx.getBean("restTemplate");
        ctx.close();
        return template;
    }

    private HttpEntity<String> prepareGet(MediaType type) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(type);
            HttpEntity<String> entity = new HttpEntity<String>(headers);
            return entity;
    }
   
	public ArrayList<QuandlData> ObjArrayToList(Object[][] objects) {
        ArrayList<QuandlData> list = new ArrayList<QuandlData>();
        for (Object[] array : objects) {
            list.add(new QuandlData(array[0].toString(),
            		(Double) array[1],
            		(Double) array[2],
            		(Double) array[3],
            		(Double) array[4],
            		(Double) array[5],
            		(Double) array[6],
            		(Double) array[7],
            		(Double) array[8],
            		(Double) array[9],
            		(Double) array[10],
            		(Double) array[11],
            		(Double) array[12])
            );
        }
        return list;
    }


//	@Override
	public QuandlWsEOD save(QuandlWsEOD header) {
		// TODO Auto-generated method stub
		return null;
	}


//	@Override
	public List<com.stockmon.model.QuandlEOD> findAllEODData() {
		// TODO Auto-generated method stub
		return null;
	}

    
/*
    private static <T> List<QuandlData> twoDArrayToList(T[][] twoDArray) {
        List<QuandlData> list = new ArrayList<QuandlData>();
        for (T[] array : twoDArray) {
            list.addAll((Collection<? extends QuandlData>) Arrays.asList(array));
        }
        return list;
    }    
  */  
}
