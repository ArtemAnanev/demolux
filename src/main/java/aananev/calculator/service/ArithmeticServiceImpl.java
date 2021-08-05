package aananev.calculator.service;

import aananev.calculator.dto.request.ArithmeticRequestDto;
import aananev.calculator.dto.response.CalculatorResponseDto;
import aananev.wsdl.Calculator;
import aananev.wsdl.CalculatorSoap;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ArithmeticServiceImpl implements ArithmeticService{
    public static final Logger LOG = Logger.getLogger(ArithmeticServiceImpl.class);
    private CalculatorSoap calculatorSoap;
    private ArithmeticServiceImpl() {
        calculatorSoap = (new Calculator()).getCalculatorSoap();
    }


    @Override
    public CalculatorResponseDto add(ArithmeticRequestDto request) {
        LOG.info("Request to SOAP");
        Integer result = calculatorSoap.add(request.getA(), request.getB());
        LOG.info("Response from SOAP");
        return CalculatorResponseDto.builder().result(result).build();
    }

    @Override
    public CalculatorResponseDto subtract(ArithmeticRequestDto request) {
        LOG.info("Request to SOAP");
        Integer result = calculatorSoap.subtract(request.getA(), request.getB());
        LOG.info("Response from SOAP");
        return CalculatorResponseDto.builder().result(result).build();
    }

    @Override
    public CalculatorResponseDto multiply(ArithmeticRequestDto request) {
        LOG.info("Request to SOAP");
        Integer result = calculatorSoap.multiply(request.getA(), request.getB());
        LOG.info("Response from SOAP");
        return CalculatorResponseDto.builder().result(result).build();
    }

    @Override
    public CalculatorResponseDto divide(ArithmeticRequestDto request) {
        LOG.info("Request to SOAP");
        Integer result = calculatorSoap.divide(request.getA(), request.getB());
        LOG.info("Response from SOAP");
        return CalculatorResponseDto.builder().result(result).build();
    }
}
