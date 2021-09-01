# SpringMVC-admin-web-page

## 프로젝트 목적
상품을 관리 서비스를 제공하는 웹페이지 구현

## 구현할 기능 목록
#### 1. 상품 도메인 모델
* 상품 ID
* 상품명
* 가격
* 수량
#### 2. 상품 관리 기능
* 상품 목록
* 상품 상세
* 상품 등록
* 상품 수정

----
## 구현 페이지
#### 상품 목록 페이지
* 상품을 누르면 상품 상세 페이지로 이동
* 상품 등록을 누르면 상품 등록 페이지로 이동
<img src="https://user-images.githubusercontent.com/74363918/126291990-308d1ba9-219b-4805-9b2d-7f162da295c1.PNG" width="500">

#### 상품 상세 페이지
* 상품 상세 정보 확인
* 상품 수정 버튼을 누르면 상품 수정 페이지로 이동, 상품 목록으로 이동
<img src="https://user-images.githubusercontent.com/74363918/126291988-cedc1ee8-7e8e-40a6-a47d-f7b83741e649.PNG" width="400">

#### 상품 등록 페이지
* 상품을 등록하면 일반 상세 페이지가 아닌 "저장완료!" 상태메시지가 있는 상품 상세 페이지로 이동 
> "/basic/items/{itemsId}?status=true"

<img src="https://user-images.githubusercontent.com/74363918/126291980-21bc765f-0906-471b-8f42-292fb1f50a83.PNG" width="400"> <img src="https://user-images.githubusercontent.com/74363918/126294490-a2fe8c46-6e86-4e7c-a137-a39931d6e921.PNG" width="400">




#### 상품 수정 페이지
* 상품 수정 후 저장하면 해당 상품 상세 페이지로 이동
<img src="https://user-images.githubusercontent.com/74363918/126291984-857bcae0-da16-475d-b631-e41c468946f3.PNG" width="400">

