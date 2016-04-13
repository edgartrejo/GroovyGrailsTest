
package wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
class ObjectFactory {

    final static QName _Double_QNAME = new QName("http://www.webserviceX.NET/", "double")

    ObjectFactory() {
    }

    ConvertTempResponse createConvertTempResponse() {
        new ConvertTempResponse()
    }

    ConvertTemp createConvertTemp() {
        new ConvertTemp()
    }

    @XmlElementDecl(namespace = "http://www.webserviceX.NET/", name = "double")
    JAXBElement<Double> createDouble(Double value) {
        new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

}
