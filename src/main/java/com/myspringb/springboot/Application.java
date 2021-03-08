package com.myspringb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 프로젝트의 메인 클래스
* @SpringBootApplication으로 인해 스프링 부트의 자동 설정, 스프링Bean 읽기와 생성을 자동으로 설정한다.
* @SpringBootApplication이 있는 위치부터 설정을 읽어가기 때문에 이 클래스는 항상 프로젝트 최상단에 위치해야 한다.*/

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
         /* 여기서 WAS(Web Application Server)를 실행한다. 내장 WAS란 별도로 외부에 WAS를 두지 않고 애플리케이션을 실행할 때
         내부에서 WAS를 실행하는 것을 말한다. 이렇게 되면 항상 서버에 톰캣을 설치할 필요가 없고, 스프링 부트로 만들어진
         Jar파일(실행 가능한 Java 패키징 파일)로 실행하면 된다. 스프링 부트에선 내장 WAS를 권장한다. 언제 어디서나 같은 환경에서 배포 가능하기 때문.*/

        SpringApplication.run(Application.class, args);
    }
}
