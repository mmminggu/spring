<h2>SpringBoot Intro</h2>

* 스트링부트 입문<br>
https://www.inflearn.com/course/스프링-입문-스프링부트/dashboard

---

<h2>Notes</h2>
<b>2023.09.15 (section1)</b>

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
<b>2023.09.16 (section2)</b>
* 스프링 웹 개발 방법 
  * 정적 컨텐츠 : 파일 그대로 전달
  * MVC와 템플릿엔진 : 서버에서 변형 후 전달
  * API : json 처럼 데이터 구조 포맷으로 전달 (react, vue ..)
 
  <br>
<b>2023.09.17 (section3)</b>

* 회원 관리 예제 - 백엔드 개발
* 테스트 케이스 작성
  * 테스트 코드는 의존관계 없이 설계가 되어야 함
  * 실행 순서는 지정이 불가능
  <br>--> 한 테스트가 끝날 때 마다 repository clear

  <br>
<b>2023.09.19 (section4)</b>
* 스프링 빈과 의존관계 (스프링 빈 등록 방법)
  * 스프링은 스프링 컨테이너에 스프링 빈을 등록할 때 기본으로 싱글톤으로 등록 (유일하게 하나만 등록해서 공유)
  <br>--> 같은 스프링 빈이면 모두 같은 인스턴스 (싱글톤 아니게도 설정 가능)
  1. 컴포넌트 스캔 (@Controller, @Service, @Repository)
     * @Autowired : 연관관계 연결 (생성자가 1개인 경우 생략 가능)
     * SpringApplication이 포함된 패키지 내에서만 기본 스캔 (수동설정 가능)
  2. 자바 코드로 직접 스프링 빈 등록