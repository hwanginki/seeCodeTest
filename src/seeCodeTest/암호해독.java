package seeCodeTest;

import java.io.*;

/*
모든 알고리즘을 해독할 수 있는 알고리즘 7 원석를 보유한 알고리즘 제왕 **파이**와 **썬**은 죽기 전,
이 보물에 '암호'를 걸어 세계 어딘가에 묻어놨다고 공표하였다. 그가 남긴 문자는 아래와 같다.

섬으로 향하라!

+ -- + - + -
+ --- + - +
+ -- + - + -
+ - + - + - +

정답 : J E J U

해(**1**)와 달(**0**),
Code의 세상 안으로!(**En-Coding**)
 */
public class 암호해독 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); // 개수(4)

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine().replace(" ", "").replace('+', '1').replace('-', '0');
		}
		
		char[] binary = new char[n];
		
		for (int i = 0; i < n; i++) {
			binary[i] = (char) Integer.parseInt(arr[i], 2);
			bw.write(binary[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}
}
