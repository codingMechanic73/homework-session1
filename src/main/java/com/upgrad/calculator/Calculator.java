package com.upgrad.calculator;

import com.upgrad.calculator.services.AdditionService;
import com.upgrad.calculator.services.MathService;
import com.upgrad.calculator.services.SubtractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    @Qualifier("additionService")
    private MathService additionService;

    @Autowired
    @Qualifier("subtractionService")
    private MathService subtractionService;

    public int compute(String op, int x, int y) {
        switch (op){
            case "add":
                return additionService.operate(x, y);
            case "sub":
                return subtractionService.operate(x, y);
            default:
                throw new RuntimeException("Operator " + op + " not supported");
        }
    }
}
