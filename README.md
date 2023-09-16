<h2>SpringBoot Intro</h2>

* 스트링부트 입문<br>
https://www.inflearn.com/course/스프링-입문-스프링부트/dashboard

---

<h2>Notes</h2>
<b>2023.09.15</b>

* 스프링부트 라이브러리
  * spring-boot-start-web
      - spring-boot-start-tomcat : 톰캣 (웹서버)  
      - spring-webmvc : 스프링 웹 MVC
  * spring-boot-thymeleaf : 타임리프 템플릿 엔진 (View)
  * spring-boot-starter(공통) : 스프링 부트 + 스프링 코어 + 로깅  
    - spring-boot
    - spring-core  
    - spring-boot-starter-logging  
    - Sysout은 로그를 관리하기 힘들기 때문에 log를 사용 -> logbback, slf4j(인터페이스)
  

* 테스트 라이브러리
  * spring-boot-starter-test
    - junit : 테스트 프레임워크
    - mockito : 목 라이브러리
    - assertj : 테스트 코드를 편하게 작성하게 도와주는 라이브러리
    - spring-test : 스프링 통합 테스트 지원

  <br>
<b>2023.09.16</b>
* 스프링 웹 개발 방법 
  * 정적 컨텐츠 : 파일 그대로 전달
  * MVC와 템플릿엔진 : 서버에서 변형 후 전달
  * API : json 처럼 데이터 구조 포맷으로 전달 (react, vue ..)

