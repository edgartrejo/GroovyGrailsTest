package groovygrailstest

import org.grails.plugins.wsclient.service.WebService
import ws.client.ConvertTemp
import ws.client.ConvertTemperature
import ws.client.ConvertTemperatureSoap
import ws.client.TemperatureUnit

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CalculatorController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        respond true
    }

    def calculate() {

        ConvertTemperature convertTemperature = new ConvertTemperature()
        ConvertTemperatureSoap convertTemperatureSoap = convertTemperature.getConvertTemperatureSoap()

        render convertTemperatureSoap.convertTemp(new Double(params.temperature), TemperatureUnit.fromValue(params.fromUnit), TemperatureUnit.fromValue(params.toUnit))

    }

}
