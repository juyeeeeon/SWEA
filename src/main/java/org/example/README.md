```java
//모두 import하기
import java.util.*;
import java.io.*;
```

```java
//Input과 Output
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//StringTokenizer
StringTokenizer st = new StringTokenizer(br.readLine());
st.nextToken();

~

bw.flush();
bw.close();
br.close();
```
이건 위에 것보다 속도가 느림.
```java
Scanner sc = new Scanner(System.in);
a = sc.nextInt();                           // int 변수 1개 입력받는 예제
b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
g = sc.nextByte();                          // char 변수 1개 입력받는 예제
var = sc.next();                            // 문자열 1개 입력받는 예제
AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
```

```java
//StringBuffer 사용
StringBuffer buffer = new StringBuffer();
buffer.append("adfds");
System.out.println(buffer);
```

```java
//int의 절댓값
Math.abs();
```

```java
//int을 String으로
String strN = Integer.toString(N);
```



