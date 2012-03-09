package fr.ippon.gmap.model.gmap;

import javax.xml.bind.annotation.XmlElement;

/**
 * User: bertrand
 * Date: 21/11/11
 * Time: 17:59
 * Created from analysing XML extract to be mapped through JAXB 2
 */
public class Geometry {
    @XmlElement
    private GeoPosition location;
    @XmlElement
    private Viewport viewport;
    @XmlElement
    private Viewport bounds;

    @Override
    public String toString() {
        return "Geometry{" +
                "location=" + location +
                ", viewport=" + viewport +
                ", bounds=" + bounds +
                '}';
    }

    public GeoPosition getLocation() {
        return location;
    }
}
