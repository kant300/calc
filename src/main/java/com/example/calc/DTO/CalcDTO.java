package com.example.calc.DTO;
//변수를 관리하는 클래스(HTML-Controller간에 사용할 변수)
//DTO 입력용, 출력용 여러개 작업가능

import lombok.*;

@Getter//get메소드()를 자동으로 생성
@Setter//set메소드()를 자동으로 생성

@ToString//toString메소드()를 자동으로 생성(모든 변수를 불러오는 메소드
@Builder//모든 변수에 저장하는 메소드()자동으로 생성

@NoArgsConstructor//생성자메소드()를 자동으로 생성
@AllArgsConstructor//생성자 모든 변수를 적용한 메소드()를 자동으로 생성

public class CalcDTO {
    //HTML에서 입력받아올 변수
    private Integer num1;
    private String op;
    private Integer num2;

    //HTML에 결과를 전달할 변수
    Integer result;
    //생성자, Getter, Setter메소드를 작성=>lombok을 이용하면 메소드를 자동생성
    //변수를 사용할 메소드를 사용자가 작성



}
