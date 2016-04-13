package groovygrailstest

import wsclient.ConvertTemperature
import wsclient.ConvertTemperatureSoap

import grails.transaction.Transactional
import wsclient.TemperatureUnit

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
