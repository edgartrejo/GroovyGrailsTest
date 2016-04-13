package wsclient

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "ConvertTemperatureSoap", targetNamespace = "http://www.webserviceX.NET/")
@XmlSeeAlso(ObjectFactory.class)
interface ConvertTemperatureSoap {

    @WebMethod(operationName = "ConvertTemp", action = "http://www.webserviceX.NET/ConvertTemp")
    @WebResult(name = "ConvertTempResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "ConvertTemp", targetNamespace = "http://www.webserviceX.NET/", className = "wsclient.ConvertTemp")
    @ResponseWrapper(localName = "ConvertTempResponse", targetNamespace = "http://www.webserviceX.NET/", className = "wsclient.ConvertTempResponse")
    double convertTemp(
            @WebParam(name = "Temperature", targetNamespace = "http://www.webserviceX.NET/")
                    double temperature,
            @WebParam(name = "FromUnit", targetNamespace = "http://www.webserviceX.NET/")
                    TemperatureUnit fromUnit,
            @WebParam(name = "ToUnit", targetNamespace = "http://www.webserviceX.NET/")
                    TemperatureUnit toUnit)

}
