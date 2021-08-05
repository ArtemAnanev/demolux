package aananev.calculator.service;

import aananev.calculator.dto.request.ArithmeticRequestDto;
import aananev.calculator.dto.response.CalculatorResponseDto;

public interface ArithmeticService {
    public CalculatorResponseDto add(ArithmeticRequestDto request);
    public CalculatorResponseDto subtract(ArithmeticRequestDto request);
    public CalculatorResponseDto multiply(ArithmeticRequestDto request);
    public CalculatorResponseDto divide(ArithmeticRequestDto request);
}
