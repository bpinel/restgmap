package fr.ippon.gmap.service.impl;

import fr.ippon.gmap.model.gmap.GeoRequest;
import fr.ippon.gmap.service.GoogleRestServices;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: bertrand
 * Date: 18/11/11
 * Time: 12:56
 * To change this template use File | Settings | File Templates.
 */

@Service
public class GoogleRestServicesImpl implements GoogleRestServices {

    private static final Logger logger = Logger.getLogger(GoogleRestServicesImpl.class);

    private String BASE_XML_URL="http://maps.googleapis.com/maps/api/geocode/xml";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public GeoRequest RetrieveGeoAddress(String address) {
        return restTemplate.getForObject(BASE_XML_URL + "?address={address}&sensor=false", GeoRequest.class, URLEncoder.encode(address));
    }

}
