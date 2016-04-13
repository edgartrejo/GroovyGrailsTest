package wsclient

import javax.xml.namespace.QName
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


@WebServiceClient(name = "ConvertTemperature", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.net/ConvertTemperature.asmx?WSDL")
class ConvertTemperature
        extends Service
{

    final static URL CONVERTTEMPERATURE_WSDL_LOCATION
    final static WebServiceException CONVERTTEMPERATURE_EXCEPTION
    final static QName CONVERTTEMPERATURE_QNAME = new QName("http://www.webserviceX.NET/", "ConvertTemperature")

    static {
        URL url = null
        WebServiceException e = null
        try {
            url = new URL("http://www.webservicex.net/ConvertTemperature.asmx?WSDL")
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex)
        }
        CONVERTTEMPERATURE_WSDL_LOCATION = url
        CONVERTTEMPERATURE_EXCEPTION = e
    }

    ConvertTemperature() {
        super(__getWsdlLocation(), CONVERTTEMPERATURE_QNAME)
    }

    ConvertTemperature(URL wsdlLocation) {
        super(wsdlLocation, CONVERTTEMPERATURE_QNAME)
    }

    ConvertTemperature(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName)
    }

    @WebEndpoint(name = "ConvertTemperatureSoap")
    ConvertTemperatureSoap getConvertTemperatureSoap() {
        super.getPort(new QName("http://www.webserviceX.NET/", "ConvertTemperatureSoap"), ConvertTemperatureSoap.class)
    }

    @WebEndpoint(name = "ConvertTemperatureSoap")
    ConvertTemperatureSoap getConvertTemperatureSoap(WebServiceFeature... features) {
        super.getPort(new QName("http://www.webserviceX.NET/", "ConvertTemperatureSoap"), ConvertTemperatureSoap.class, features)
    }

    @WebEndpoint(name = "ConvertTemperatureSoap12")
    ConvertTemperatureSoap getConvertTemperatureSoap12() {
        super.getPort(new QName("http://www.webserviceX.NET/", "ConvertTemperatureSoap12"), ConvertTemperatureSoap.class)
    }

    @WebEndpoint(name = "ConvertTemperatureSoap12")
    ConvertTemperatureSoap getConvertTemperatureSoap12(WebServiceFeature... features) {
        super.getPort(new QName("http://www.webserviceX.NET/", "ConvertTemperatureSoap12"), ConvertTemperatureSoap.class, features)
    }

    @WebEndpoint(name = "ConvertTemperatureHttpGet")
    ConvertTemperatureHttpGet getConvertTemperatureHttpGet() {
        super.getPort(new QName("http://www.webserviceX.NET/", "ConvertTemperatureHttpGet"), ConvertTemperatureHttpGet.class)
    }

    @WebEndpoint(name = "ConvertTemperatureHttpGet")
    ConvertTemperatureHttpGet getConvertTemperatureHttpGet(WebServiceFeature... features) {
        super.getPort(new QName("http://www.webserviceX.NET/", "ConvertTemperatureHttpGet"), ConvertTemperatureHttpGet.class, features)
    }

    @WebEndpoint(name = "ConvertTemperatureHttpPost")
    ConvertTemperatureHttpPost getConvertTemperatureHttpPost() {
        super.getPort(new QName("http://www.webserviceX.NET/", "ConvertTemperatureHttpPost"), ConvertTemperatureHttpPost.class)
    }

    @WebEndpoint(name = "ConvertTemperatureHttpPost")
    ConvertTemperatureHttpPost getConvertTemperatureHttpPost(WebServiceFeature... features) {
        super.getPort(new QName("http://www.webserviceX.NET/", "ConvertTemperatureHttpPost"), ConvertTemperatureHttpPost.class, features)
    }

    private static URL __getWsdlLocation() {
        if (CONVERTTEMPERATURE_EXCEPTION!= null) {
            throw CONVERTTEMPERATURE_EXCEPTION
        }
        CONVERTTEMPERATURE_WSDL_LOCATION
    }

}
