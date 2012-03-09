package fr.ippon.gmap.model.gmap;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by IntelliJ IDEA.
 * User: bertrand
 * Date: 23/11/11
 * Time: 08:51
 * To change this template use File | Settings | File Templates.
 */
public class Viewport {
    @XmlElement
    private GeoPosition southwest;
    @XmlElement
    private GeoPosition northeast;

    @Override
    public String toString() {
        return "Viewport{" +
                "southwest=" + southwest +
                ", northeast=" + northeast +
                '}';
    }
}
