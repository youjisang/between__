# between 채팅앱

## 1. __설명__

- 비트윈 앱 기능 중 채팅프로젝트(해커톤)
- 작업 소요기간 3일

## 2. __Application Structure 및 동영상 link__

- Application의 구조를 기능별로 1.로그인 2. 채팅 3. 일정관리로 구성
- [동영상 링크](https://youtu.be/k7C1DMJDYc0)

## 3. __기능 설명__

- 채팅의 주된 기능으로써, 서버는 firebase 사용
- firebase 기능 중 인증, 데이터베이스, 실시간 데이터베이스 사용
- 주요 라이브러리 - glide, recyclerView

## 4. __주요 Issue__

### 4-1. 로그인시 파트너 매칭 Issue

#### _how to solve_?


- 내 전화번호와 파트너 전화번호 <-> 파트너 전화번호와 내 전화번호가 일치되는 것을 체크할 수 있는 데이터 모델을 따로 만든다.
- 사용자가 자신의 전화번호와 파트너의 전화번호를 입력 했을 때 1. 매칭이 되는 번호가 있다면, 정상적으로 다음 액티비티로 이동 2. 없다면, 상대방을 기다리는 액티비티에서 대기
- 매칭이 되는 로직은 데이터 변화를 감지하는 addListenerForSingleValueEvent 메소드를 사용해서 매칭을 체크할 수 있었다.

### 4-2. 채팅 Issue

#### _how to solve_?

- 두 사용자간에 채팅 방을 데이터모델로 따로 만든다.
- 채팅은 UI는 RecyclerView로 구현했고, adapter 내부 기능중 getItemViewType을 활용했다. 
- 사용자 정보를 체크 후, 사용자가 본인이면 myChatting item, 본인이 아니면 friendChatting item으로 만든 layout을 inflate해서 ui상에 보여지게 했다.   

### 4-3. 일정관리 시 UI Issue

#### _how to solve_?

- 스피너, 스위치, 라디오버튼 등을 활용해서 처리했다.

## 5. __Retrospect__

- 기간이 길지 않은 해커톤 프로젝트였기에, UI적으로 신경을 많이 못썼고, 디비 설계에 부족함을 느꼈다.
- 설계의 중요성과 일정관리 그리고 협업시 중요한 이슈를 경험하게 해준 프로젝트였다.

