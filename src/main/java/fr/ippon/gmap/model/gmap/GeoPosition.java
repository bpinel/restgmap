package fr.ippon.gmap.model.gmap;

import javax.xml.bind.annotation.XmlElement;

/**
 * User: bertrand
 * Date: 21/11/11
 * Time: 18:00
 * Created from analysing XML extract to be mapped through JAXB 2
 */
public class GeoPosition {
    @XmlElement
    double lat;
    @XmlElement
    double lng;

    @Override
    public String toString() {
        return "GeoPosition{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }

    public double getLat() {
        return lat;
    }


    public double getLng() {
        return lng;
    }

}
