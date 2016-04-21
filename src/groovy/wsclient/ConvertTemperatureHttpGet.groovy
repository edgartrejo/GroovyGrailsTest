package wsclient

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult
import javax.jws.WebService
import javax.jws.soap.SOAPBinding
import javax.xml.bind.annotation.XmlSeeAlso

@WebService(name = "ConvertTemperatureHttpGet", targetNamespace = "http://www.webserviceX.NET/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso(ObjectFactory.class)
interface ConvertTemperatureHttpGet {

    @WebMethod(operationName = "ConvertTemp")
    @WebResult(name = "double", targetNamespace = "http://www.webserviceX.NET/", partName = "Body")
    double convertTemp(
            @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Temperature")
                    String temperature,
            @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "FromUnit")
                    String fromUnit,
            @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ToUnit")
                    String toUnit)

}
