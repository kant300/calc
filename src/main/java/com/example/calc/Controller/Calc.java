package com.example.calc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Calc {
    //http://localhost:8080
    //계산기의 입력페이지로 이동
    @GetMapping("/")
    public String calc() {
        return "calc";
    }

    @PostMapping("calc")
    public String result(Integer num1, String op, Integer num2, Model model) {
        //입력받은 변수를 이용해서 처리(명령어)
        int result = 0;//결과를 저장할 변수

        switch (op) {  //if(op.equals("+"))
            case "+": result =  num1 + num2; break;
            case "-": result =  num1 - num2; break;
            case "*": result =  num1 * num2; break;
            case "/": result =  num1 / num2; break;
        }
        //4개의 변수값을 calcResult에 전달
        //변수명 지정시 오타를 주의
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num1);
        model.addAttribute("op", op);
        model.addAttribute("result", result);

        return "calcResult";
    }
}
