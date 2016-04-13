package wsclient

import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlEnumValue
import javax.xml.bind.annotation.XmlType

@XmlType(name = "TemperatureUnit")
@XmlEnum
enum TemperatureUnit {

    @XmlEnumValue("degreeCelsius")
            DEGREE_CELSIUS("degreeCelsius"),
    @XmlEnumValue("degreeFahrenheit")
            DEGREE_FAHRENHEIT("degreeFahrenheit"),
    @XmlEnumValue("degreeRankine")
            DEGREE_RANKINE("degreeRankine"),
    @XmlEnumValue("degreeReaumur")
            DEGREE_REAUMUR("degreeReaumur"),
    @XmlEnumValue("kelvin")
            KELVIN("kelvin")
    final String value

    TemperatureUnit(String v) {
        value = v;
    }

    static TemperatureUnit fromValue(String v) {
        for (def c: TemperatureUnit.values()) {
            if (c.value.equals(v)) {
                return c
            }
        }
        throw new IllegalArgumentException(v)
    }

}
