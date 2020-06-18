```bash
교육원   : 쌍용강북교육센타
강  사   : 김대기
과정명   : Framework기반의 빅데이터활용 응용프로그래머양성 9차
기  간   : 2019-09-02 -	2020-02-17
프로젝트 : Final Project
```

# EveryAir
> 아시아나에 기반한 항공권 예매 사이트 제작 
- 개발기간 : 2020.01.13 ~ 2020.02.17
- 개발목적 : 저비용 항공을 이용한 국내여행은 예년에 비해 증가하고 있습니다. 따라서 항공권을 구매하는 플랫폼의 수요 역시 증가하고 있습니다. 이런 수요에 맞게 국내선 전용 항공 예매 사이트를 제작하게 되었습니다. 더불어 요즘은 Maas(Mobility as a Service)라는 통합이동서비스가 대두되고 있는 상황입니다. 그런 점을 고려하여 출발지 - 공항 - 도착지의 이동 서비스를 통합하는 시스템을 구축하고자 하였습니다. 항공편 예매를 함과 동시에 주차장 예약, 리무진 예약을 한꺼번에 가능하게 하였습니다. 주차장예약서비스는 자동차로 공항에 도착할 경우, 미리 주차장을 예약해 시간을 낭비하지 않게 합니다. 또한 리무진예약서비스를 이용해 리무진을 이용할 경우, 출발공항에 도착하는 리무진과 도착공항에서 떠나는 리무진을 모두 예약이 가능하게 하여 소비자의 시간을 절약할 수 있으며 좀 더 편리한 여행을 가능하게 합니다. 또한 항공 예매 서비스에서도 체크인을 웹으로 가능하고 좌석 역시 미리 선택 가능하게 하여 최대한 오프라인에서의 시간을 줄이고 편리한 국내 여행을 가능하게 하고자 하였습니다.

---

## 개발환경

- **운영체제** : Window10 64bit / Linux
- **사용언어** : JAVA(JDK 1.8) / JavaScript / JSP 
- **DB** : MySQL
- **Framework** : Spring Boot / Mybatis / BootStrap
- HTML5 / CSS / jQuery / Ajax / Json
- Git / Maven
- **API** 

| 사용부문 | API명 | 사용데이터/사용분야 |
|---|:---:|:---:|
| 항공데이터 구축 | 국내항공운항정보 서비스(국토교통부) | 항공사정보, 공항정보, 항공운행정보 |
|  | 항공기 운항정보(한국공항공사) | 실시간 운항정보, 국내선운항스케줄, 공항코드정보 |
|  | 노선현황정보(한국공항공사) | 노선별 소요시간 및 거리 정보 |
| 주차장 예약 | 전국공항 실시간 주차정보(한국공항공사) | 전국공항 주차정보 |
| | 특일 정보제공 서비스(한국천문연구원) | 공휴일정보, 국경일정보 |
| 리무진 예약 | 전국공항 버스노선(한국공항공사) | 전국공항 버스노선 정보 |
| 채팅 | <a href='https://tocplus.co.kr/' target="_blank">`톡플러스`</a>  | 고객센터 |
| SMS | <a href='https://www.bluehouselab.com/sms' target="_blank">`청기와랩`</a> | 아이디, 비밀번호 찾기 |
|  | <a href='https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient' target="_blank">`Apache HttpClient`</a> |  |
| 날씨 | <a href='https://www.weatheri.co.kr' target="_blank">`웨더아이`</a> | 날씨정보 |
| 게시판 |  <a href='https://developers.naver.com/products/captcha/' target="_blank">`네이버 캡차`</a> | 고객센터 게시물 작성 |
| 실시간 검색어 | <a href='http://kkma.snu.ac.kr' target="_blank">`꼬꼬마 형태소 분석기`</a> | 검색된 단어의 형태소 분석 |
| Barcode | <a href='https://barcode-coder.com/en/' target="_blank">`Barcode-coder`</a> | 항공권 Barcode 생성 |
| QRcode | <a href='https://github.com/davidshimjs/qrcodejs' target="_blank">`QRCode`</a> | 회원번호 QRcode 생성 |
| ScreenShot(Image) | <a href='https://html2canvas.hertzen.com/' target="_blank">`Screenshots`</a> | 항공권화면 이미지저장 |
| ScreenShot(PDF) | <a href='https://github.com/MrRio/jsPDF' target="_blank">`jsPDF`</a> | 항공권화면 PDF저장 |
| 결제 | <a href='https://www.iamport.kr' target="_blank">`아임포트`</a> | 항공권요금결제, 리무진요금결제 |


---
