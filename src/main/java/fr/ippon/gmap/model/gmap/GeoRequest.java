package fr.ippon.gmap.model.gmap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: bertrand
 * Date: 21/11/11
 * Time: 18:02
 * Created from analysing XML extract to be mapped through JAXB 2
 */
@XmlRootElement(name = "GeocodeResponse")
public class GeoRequest {
    @XmlElement
    private String status;
    @XmlElement
    private GeoResultRequest result;


    @Override
    public String toString() {
        return "GeoRequest{" +
                "status='" + status + '\'' +
                ", result=" + result +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public GeoResultRequest getResult() {
        return result;
    }
}
