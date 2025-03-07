- 언제 리팩터링을 시작해야 해야 하는지? 또는 언제 리팩터링을 종료 해야하는지?
    - 코드에서 냄새(악취)가 나면 그때 시작한다.
    - 종료 시점은 알려 주지 않고 리팩터링을 하면 해결 할 수 있는 문제의 징후를 제시
- 3.1 기이한 이름(Mysterious Name)
    - 코드는 단순하고 명료하게 작성해야 한다.
        - 명료하게 표현하는데 가장 중요한 것은 **이름**
        - 이름만 보고도 무슨 일을 하고 어떻게 사용해야 하는지 명확히 알 수 있도록 **엄청나게 신경 써서 이름을 지어야 한다.**
    - 굳이 이름을 바꿔야 하나?
        - 이름만 잘 지어도 코드를 파악하느라 소비하는 시간을 크게 줄일 수 있다.
        - 이름을 짓는 과정중에 마땅한 이름이 생각나지 않는다면 설계에 근본적인 문제가 숨어 있을 가능성이 있다.
- 3.2 중복 코드(Duplicated Code)
    - 똑같은 표현식을 사용하는 경우 → **함수 추출하기**
    - 코드가 비슷하긴한데 완전히 똑같지 않다면 → **문장 슬라이드하기**로 비슷한 부분을 한곳에 모아 함수 추출하기를 더 쉽게 적용할 수 있는지 살펴보기
    - 같은 부모로 부터 파생된 서브 클래스들에 중복 코드가 있으면 각자 따로 호출되지 않게 **메서드 올리기**를 통해 부모로 옮긴다.
- 3.3 긴 함수(Long Function)
    - *길게 풀어 쓴 함수 vs 길게 풀어 쓴 함수를 잘게 쪼개기*
    - 짧은 함수로 구성된 코드를 이해하기 쉽게 만드는 가장 확실한 방법은 좋은 이름 이다.
        - 이름을 잘 지어 놓으면 본문을 볼 이유가 사라진다.
    - 주석을 달아야 할 만한 부분은 무조건 함수로 만든다.
        - 함수 본문에는 주석으로 설명하려던 코드가 담기고 함수 이름은 동작 방식이 아닌 **의도**가 드러나게 짓는다.
    - 원래 코드보다 길어지더라도 함수로 뽑는다.
        - **단, 함수 이름에 코드의 목적을 드러내야 한다.**
    - 긴 함수를 어떤 기준으로 쪼개야 할까?
        - 분기문, 반복문 있으면 쪼개자
        - **무엇을 할지 설명하기 위해서 주석을 달아야 한다고 생각한다면 함수로 추출하자(추천)**
    - 함수를 쪼개면 이해하기 더 어려워 지는 경우가 있다 어떤 경우일까?
        - 먼저 쪼개서 어려워졌다면 쪼개기전 코드가 더 읽기 쉬웠나? 하고 생각해 보자
        - 추상화 레벨이 제각각이면 코드를 읽기가 어려워짐
- 3.4 긴 매개변수 목록(Long Parameter List)
    - 매개변수를 질의 함수로 바꾸기
    - 객체 통째로 넘기기
    - 매개 변수 객체 만들기
    - 여러 함수를 클래스로 묶기
- 3.5 전역 데이터(Global Data)
    - 어디에서든 건드릴 수 있고 값을 누가 바꿨는지 찾아낼 방법이 없다는게 문제
    - 전역 데이터 사용을 방지하기 위해 **변수 캡슐화하기**를 사용
    - 가변 전역 데이터틑 사용하는 것을 지양하자
    - 프로그램이 구동 된 후에 값이 바뀌지 않는다고 보장할 수 있는 전역 데이터는 그나마 안전한다
- 3.6 가변 데이터(Mutable Data)
    - 함수형 프로그래밍에서는 데이터는 절대 변하지 않고, 데이터를 변경하려면 반드시 변경하려는 값에 해당하는 복사본을 만들어서 반환한다는 개념을 기본으로 삼고 있다.
    - 가변 데이터 컨트롤 하기
        - **변수 캡슐화하기**를 적용하여 정해놓은 함수를 거쳐야만 값을 수정 할 수 있도록 하기
        - 하나의 변수에 용도가 다른 값들을 저장하느라 값을 갱신하는 경우 이면 **변수 쪼개기**
- 3.7 뒤엉킨 변경(Divergent Change)
    - 단일 책임 원칙(SRP): 단일 모듈은 변경의 이유가 하나, 오직 하나여야만 한다는 설계 원칙
        - 단일 모듈은 오직 하나의 액터에 대해서만 책임져야 한다(클린 아키텍처)
- 3.8 산탄총 수술(Shotgun Surgery)
    - 산탄총 수술은 코드를 변경할 때마다 자잘하게 수정해야 하는 클래스가 많을 때를 말한다.
- 3.9 기능 편애(Feature Envy)$›
    - 어떤 함수가 자기가 속한 모듈의 함수나 데이터보다 다른 모듈의 함수나 데이터와 상호작용 할 일이 더 많을 때 풍기는 냄새다.
        - 해결방법은 호출하는 쪽으로 옮겨주면 된다.
        - 만약 함수의 일부에서만 기능을 편애하면 그 부분만 옮겨준다.
    - 함수가 사용하는 모듈이 다양하다면 어느 모듈로 옮겨야 할까?
        - 가장 많은 데이터를 포함한 모듈로 옮긴다.
    - 디자인 패턴
        - 전략패턴(Strategy)
        - 방문자 패턴(Visitor)
        - 자기 위임(Self - Delegation)
    - Strategy, Vistor 는 의도적으로 데이터와 연산을 분리해 놓은 것이기 때문에 Feature envy 의 예외 케이스이다
- 3.10 데이터 뭉치(Data Clumps)
- 3.11 기본형 집착(Primitive Obsession)
    - 전화번호를 단순히 문자 집합으로만 표현하기엔 아쉬움이 많다
    - 기본형을 객체로 바꾸기
    - 타입 코드를 서브클래스로 바꾸기
    - 조건부 로직을 다형성으로 바꾸기
- 3.12 반복되는 switch문(Repeated Switches)
- 3.13 반복문(Loops)
- 3.14 성의 없는 요소(Lazy Element)
- 3.15 추측성 일반화(Speculative Generality)
    - 이 냄새는 ‘나중에 필요할거야’ 라는 생각으로 당장은 필요 없는 모든 종류의 후킹 포인트와 특이 케이스 처리 로직을 작성해둔 코드에서 풍긴다
    - 미래를 대비해 작성한 부분을 실제로 사용하게 되면 다행이지만, 그렇지 않는다면 쓸데없는 낭비일 뿐이다. 당장 걸리적거리는 코드는 눈앞에서 치워버리자
- 3.16 임시 필드(Temporal Field)
- 3.17 메시지 체인(Message Chains)
    - 메시지 체인은 클라이언트가 한 객체를 통해 다른 객체를 얻은 뒤 방금 얻은 객체에 또 다른 객체를 요청하는 식으로, 다른 객체를 요청하는 작업이 연쇄적으로 이어지는 코드를 말한다.
- 3.18 중개자(Middle Man)
    - middle man이 아무것도 하는일이 없으면 생략 하는게 좋을 수 있다
- 3.19 내부자 거래(Insider Trading)
- 3.20 거대한 클래스(Large Class)
    - 클래스 추출하기
- 3.21 서로다른 인터페이스의 대안 클래스들(Alternative Classes with Different Interfaces)
- 3.22 데이터 클래스(Data Class)
    - 데이터 클래스란 데이터 필드와 게터/세터 메서드로만 구성된 클래스를 말한다
    - 레코드 캡슐화 하기 - public 필드를 private으로 변경
    - 세터 제거하기
- 3.23 상속 포기(Refused Bequest)
- 3.24 주석(Comment)
    - 레이어가 시작하는 부분, 인터페이스에는 주석을 달아주는 것이 좋다. 단, 최신화 필요
    - 한국에서는 어려운 영어 이름에 한글로 주석 달아주자
