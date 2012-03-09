package fr.ippon.gmap.model.gmap;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * User: bertrand
 * Date: 21/11/11
 * Time: 17:55
 * Created from analysing XML extract to be mapped through JAXB 2
 */

public class AddressComponent {
    @XmlElement(name = "long_name")
    private String longName;
    @XmlElement(name = "short_name")
    private String shortName;
    @XmlElement
    private List<String> type;

    @Override
    public String toString() {
        return "AddressComponent{" +
                "longName='" + longName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", type=" + type +
                '}';
    }
}
