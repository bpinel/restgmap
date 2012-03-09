package fr.ippon.gmap.model.gmap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * User: bertrand
 * Date: 21/11/11
 * Time: 18:03
 * Created from analysing XML extract to be mapped through JAXB 2
 */

public class GeoResultRequest {
    @XmlElement
    private String type;
    @XmlElement (name = "formatted_address")
    private String formattedAdress;
    @XmlElement (name = "address_component")
    private List<AddressComponent>  addressComponents ;
    @XmlElement
    private Geometry geometry;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("GeoResultRequest{" +
                "type='" + type + '\'' +
                ", formattedAdress='" + formattedAdress + '\'' +
                ", addressComponents=[");
        for (AddressComponent ac : addressComponents) {
              sb.append("[").append(ac.toString()).append("], ");
        }
        sb.append("], geometry=" + geometry +"}");
        return sb.toString();
    }

    public String getFormattedAdress() {
        return formattedAdress;
    }

    public Geometry getGeometry() {
        return geometry;
    }
}
