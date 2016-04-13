package wsclient

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlSchemaType
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = [   "temperature","fromUnit","toUnit"] )
@XmlRootElement(name = "ConvertTemp")
class ConvertTemp {

    @XmlElement(name = "Temperature")
    protected double temperature
    @XmlElement(name = "FromUnit", required = true)
    @XmlSchemaType(name = "string")
    protected TemperatureUnit fromUnit
    @XmlElement(name = "ToUnit", required = true)
    @XmlSchemaType(name = "string")
    protected TemperatureUnit toUnit

}
