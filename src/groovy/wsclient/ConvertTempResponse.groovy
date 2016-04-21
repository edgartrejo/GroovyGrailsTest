package wsclient


import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = "convertTempResult")
@XmlRootElement(name = "ConvertTempResponse")
class ConvertTempResponse {

    @XmlElement(name = "ConvertTempResult")
    double convertTempResult

}
