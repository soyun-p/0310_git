package work;

import java.util.Random;
import java.util.Scanner;

public class Ex5_homework_bassball_check {
	public static void main(String[] args) {
		
		// 숫자 야구 (전공자들은 배열을 이용해서 입력을 243 붙여서 받는 거로.)
		
		// 1~9 사이의 중복되지 않는 난수를 3개 생성.
		// 629(<-- 발생된 세 자리의 난수. 사용자에게 보여주지는 않는다.)
		
		// 백의 자리 : 1
		// 십의 자리 : 2
		// 일의 자리 : 3  (키보드에서 입력받는다.)
		// 1 Strike, 0 Ball
		
		// 백의 자리 : 9
		// 십의 자리 : 1
		// 일의 자리 : 6
		// 0 Strike, 2 Ball  -> 자리수까지 맞은 숫자의 갯수 : 스트라이크, 맞은 숫자의 갯수 : 볼
		
		// 백의 자리 : 1
		// 십의 자리 : 7
		// 일의 자리 : 5
		// Out!!
		
		// 백의 자리 : 6
		// 십의 자리 : 2
		// 일의 자리 : 9
		// 4회만에 정답!!
		
		
		
		// 컴퓨터 난수 배열 생성
		int[] cArr = new int[3]; 
		
		// 컴퓨터 난수 배열에 초기화
		for(int i = 0; i < cArr.length; i++){
			cArr[i] = new Random().nextInt(9) + 1;		
		} // for
		

		
		
		
		// 숫자 입력
		Scanner sc = new Scanner(System.in);

		System.out.println("백의 자리 수 : ");
		int n1 = sc.nextInt();
		
		System.out.println("십의 자리 수 : ");
		int n2 = sc.nextInt();
		
		System.out.println("일의 자리 수 : ");
		int n3 = sc.nextInt();
	    
	    
		// 입력 숫자 배열 생성 및 초기화
		int[] nArr = new int[3];
		
		for(int i = 0; i < nArr.length; i++) {
			
			for(int j = 1; j <= 3; j++) {
				
				
			} // for inner
		} // for outer
	    
	   
		             
		
	    
		// strike와 ball의 초기화
		int strike = 0;
		int ball = 0;
		
		// strike와 ball의 계산
		for(int i = 0; i < nArr.length; i++) { // 입력 받은 숫자의 범위
			
			for(int j = 0; j < cArr.length; j++) { // 컴퓨터 난수의 범위
			
				// strike 계산
				if( nArr[i] == cArr[j] ) {
					if( i == j ) { // strike인 경우 값을 하나씩 늘린다.
						strike++;		
					}// if inner		
				} // if outer
				
				// ball 계산
				if( i != j ) {
					if( nArr[i] == cArr[j] ) {
						ball++;
					} // if inner
				} // if outer
				
		
			} // for inner	
		} // for outer
		
		
		// 결과 출력
		if( strike == 3 ) {
			System.out.println("Out!!");
		}else if( strike == 0 && ball == 0 ) {
			System.out.printf("%d회만에 정답입니다.\n");
			
		}else {
			System.out.printf("%d Strike, %d Ball\n", strike, ball);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

}
