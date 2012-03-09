package fr.ippon.gmap.service;

import fr.ippon.gmap.model.gmap.GeoRequest;

/**
 * Created by IntelliJ IDEA.
 * User: bertrand
 * Date: 18/11/11
 * Time: 12:55
 * To change this template use File | Settings | File Templates.
 */
public interface GoogleRestServices {
    public GeoRequest RetrieveGeoAddress(String address);

}
