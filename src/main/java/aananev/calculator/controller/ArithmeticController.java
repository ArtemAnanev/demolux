package aananev.calculator.controller;

import aananev.calculator.dto.request.ArithmeticRequestDto;
import aananev.calculator.dto.response.ResponseDto;
import aananev.calculator.service.ArithmeticService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("arithmetic")
@NoArgsConstructor
@AllArgsConstructor
public class ArithmeticController {
    public static final AtomicLong SEQUENCE = new AtomicLong();
    public static final Logger LOG = Logger.getLogger(ArithmeticController.class);
    private ArithmeticService service;


    @PostMapping("add")
    public ResponseEntity<ResponseDto<Object>> add(@RequestBody ArithmeticRequestDto request) {
        MDC.put("sequence", SEQUENCE.addAndGet(1));
        LOG.info("Request to JSON");
        return new ResponseEntity<>(new ResponseDto<>(service.add(request), "OK"), HttpStatus.OK);
    }

    @PostMapping("subtract")
    public ResponseEntity<ResponseDto<Object>> subtract(@RequestBody ArithmeticRequestDto request) {
        MDC.put("sequence", SEQUENCE.addAndGet(1));
        LOG.info("Request to JSON");
        return new ResponseEntity<>(new ResponseDto<>(service.subtract(request),"OK"), HttpStatus.OK);
    }

    @PostMapping("multiply")
    public ResponseEntity<ResponseDto<Object>> multiply(@RequestBody ArithmeticRequestDto request) {
        MDC.put("sequence", SEQUENCE.addAndGet(1));
        LOG.info("Request to JSON");
        return new ResponseEntity<>(new ResponseDto<>(service.multiply(request), "OK"), HttpStatus.OK);
    }

    @PostMapping("divide")
    public ResponseEntity<ResponseDto<Object>> divide(@RequestBody ArithmeticRequestDto request) {
        MDC.put("sequence", SEQUENCE.addAndGet(1));
        LOG.info("Request to JSON");
        return new ResponseEntity<>(new ResponseDto<>(service.divide(request), "OK"), HttpStatus.OK);
    }
}
