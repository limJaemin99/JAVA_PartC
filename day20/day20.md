# day20


C08 CharSequence Test

해시코드값이 같다면 동일한 객체에 값의 상태가 바뀌는것(가변)이고,
그렇지 않다면 객체가 새로 만들어지는것(불변)

1. String 클래스의 객체(불변객체)


2. Stringbuffer 클래스의 객체(가변객체)
객체명.append(값)	>> 값을 출력
insert(int , String) >> int번째 인덱스 위치에 삽입
delete(int1, int2) >> int1번째 인덱스부터 (int2-in1)개를 제거


3. String 클래스의 contains 메소드 인자는 CharSequence 타입이다.

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
C09 String Split Test

//split 메소드는 분리된 결과를 배열로 리턴
//토크나이저는 nextToken()으로 직접 하나씩 가져오기

1. split(값) >> 값(문자열)을 기준으로 문자열 분리
※ 리턴타입은 String[]이므로 String[]타입 객체를 생성 후 사용해야한다.
ex) String temp = "1 2 3 4 5"
    String[] result = temp.split(" ");	//띄어쓰기를 기준으로 분리


2. 문자열 토크나이저 (토큰: 어휘분석의 단위를 가리키는 컴퓨터용어이다. -위키백과)

토크나이저 선언부에서 기준을 정한다.
기준이 없으면 기본값은 공백이다.

nextToken() >> 기본값은 공백을 기준으로 함
hasMoreTokens() >> 다음 토큰 값이 있는지 여부를 boolean타입으로 리턴


3. 기준 문자열(delimiter) 가 공백이 아닐 때
▶ (토크나이저 선언부에서 기준을 정했을 경우)
String temp = "1xy2xy3xy4xy5";
stk = new StringTokenizer(temp,"xy");

같은 기준일때 split은 정확히 xy만 분리,
토크나이저는 xy 중 하나라도 포함되어 있으면 분리함.

StringTokenizer 클래스는 Enumeration <Object> 인터페이스를 implemets 한 클래스이다.
>> public class StringTokenizer implements Enumeration <Object>
만약 Tokenizer에서 previous를 사용하려면 인터페이스를 Iterator로 바꾼 뒤 ListIterator로 업캐스팅하여 사용한다.
>> public class StringTokenizer implements Iterator<T>
	if(객체 istanceOf ListIterator) ~~~ 이런식으로 사용

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
FunctionEx
인터페이스 중 ★추상메소드가 1개인 것★을 함수형 인터페이스라고 한다.
@ >> 애노테이션 : 실수를 방지하기 위해 사용
ex) 함수형 인터페이스에서 추상메소드를 2개 만들면 애노테이션이 오류를 발생시켜 알려준다(빨간줄)
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
C11 Function Test

람다식 구현 설명
함수인터페이스 타입의 객체를 선언하며 입력매개변수를 부여하고 구현까지 한번에 한다.
쉽게 말해, 익명클래스로 메소드를 구현하는걸 간단하게 해주는 방법이다.
ex) 함수인터페이스명  객체명  =  (값1 , 값2) -> {return 값1+값2}
※구현하는 메소드의 리턴타입에 맞게 리턴값을 제시해줘야 한다.
