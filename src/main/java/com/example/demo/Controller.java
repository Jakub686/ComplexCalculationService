package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private ComplexCalculationService complexCalculationService;

    @GetMapping("add/{number1}/{number2}")
    Double add(@PathVariable("number1") int number1, @PathVariable("number2")  int number2 ){
        return  complexCalculationService.add(number1,number2);
    }

    @GetMapping("subtract/{number1}/{number2}")
    Double subtract(@PathVariable("number1") int number1, @PathVariable("number2")  int number2 ){
        return  complexCalculationService.subtract(number1,number2);
    }

    @GetMapping("multiply/{number1}/{number2}")
    Double multiply(@PathVariable("number1") int number1, @PathVariable("number2")  int number2 ){
        return  complexCalculationService.multiply(number1,number2);
    }

    @GetMapping("divide/{number1}/{number2}")
    Double divide(@PathVariable("number1") int number1, @PathVariable("number2")  int number2 ){
        return  complexCalculationService.divide(number1,number2);
    }
}
