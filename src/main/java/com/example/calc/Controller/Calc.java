package com.example.calc.Controller;

import com.example.calc.DTO.CalcDTO;
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
    public String result(CalcDTO calcDTO, Model model) {
        //입력받은 변수를 이용해서 처리(명령어)
        int result = 0;//결과를 저장할 변수
        //DTO의 변수는 직접 사용불가능, getter와 setter를 이용해서 변수사용
        switch (calcDTO.getOp()) {  //if(op.equals("+"))
            case "+": calcDTO.setResult(calcDTO.getNum1() + calcDTO.getNum2()); break;
            case "-": calcDTO.setResult(calcDTO.getNum1() - calcDTO.getNum2()); break;
            case "*": calcDTO.setResult(calcDTO.getNum1() * calcDTO.getNum2()); break;
            case "/": calcDTO.setResult(calcDTO.getNum1() / calcDTO.getNum2()); break;
        }
        //4개의 변수값을 calcResult에 전달
        //변수명 지정시 오타를 주의
        model.addAttribute("calcDto", calcDTO);

        return "calcResult";
    }
}
