*** 1단계 화면 생성 ***

 controller, model, exception 패키지 생성
 
[gradle 첨가]
implementation 'org.springframework.boot:spring-boot-starter-web' 
implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'


**** 2단계 화면 조회 ****

1. exception 패키지에 예외 처리 record (Date, Id, Name, Time) 생성
2. model 패키지에 Reservation 객체 그햔
3. controller 패키지에 ReservationController 만든 후 페이지 요청(/reservation) 및 목록 조회(/reservations) 구현

*****3단계 정보 생성 및 삭제 *****

1. 생성관련 메소드는 PostMapping을 이용할 것.
2. 삭제관련 메소드는 DeleteMapping을 이용할 것.

 ****4단계 예외 처리 ******
전역적으로 다루는 예외 함수를 이용하여 특정 원하는 오류값을 리턴할 계획

   
