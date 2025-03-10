package work;

import java.util.Random;

public class Ex2_work {
	public static void main(String[] args) {
		
		// 변수 money에 10~5000까지의 난수를 발생시켜 넣는다.
		// 단, 발생하는 난수의 1의 자리는 반드시 0이어야 한다.
		// 발생한 난수를 가능한 한 적은 수의 동전으로 나눈 결과 출력.
		
		// 난수: 2590
		// 500원 : 5
		// 50원 : 1
		// 10원 : 4
		
		
		int[] coin = {500, 100, 50, 10};
		
		int money = new Random().nextInt(500 - 10 + 1) + 10;
		
		money *= 10;
		
		System.out.println("난수 : " + money);
		
		/* if( money % 10 == 0) {
			System.out.println("난수 : " + money);
		} // if  8*/
		
		
		for(int i = 0; i < coin.length; i++) {
			int res = money / coin[i];  // money를 배열로 나눈 값
			
			if( res > 0 ) {  // money를 나눈 후 나머지를 나눌 때 필요없는 동전은 걸러내는 조건문.
				System.out.printf("%d원 : %d\n",coin[i], res);
				money %= coin[i];  // 머니를 나누고 남는 나머지를 머니에 갱신해서 저장 후, 다시 for문으로 돌아가 [i+1]로 수행.
			} // if			
		
		} // for
		
		
		
	} // main

}

// i=0  :  





