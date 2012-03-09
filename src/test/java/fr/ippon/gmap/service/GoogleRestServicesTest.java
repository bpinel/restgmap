package fr.ippon.gmap.service;

import fr.ippon.gmap.model.gmap.GeoRequest;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: bertrand
 * Date: 21/11/11
 * Time: 16:11
 * Testing
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
                "classpath*:/applicationContext.xml"
               })
public class GoogleRestServicesTest {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private GoogleRestServices googleRestServices = null;

    @Test
    public void testRetrieveGeoAddress() {
        logger.debug("testing retrieveGeoAdress");
        GeoRequest geoAddress = googleRestServices.RetrieveGeoAddress("90 rue Baudin, 92300 Levallois Perret");
        logger.debug("geoAddress "+geoAddress.toString());
        assert ("OK".equalsIgnoreCase(geoAddress.getStatus()));
    }

}
