//최종 요구사항 1
//사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
//예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.
//이 요구사항은 앞의 실습을 소화했으면 구현할 수 있기 때문에 생략한다.

import java.util.Scanner;

public class Gugudan {
	
	public static void main(String[] args) {
		
		System.out.println("what is your number for Gugudan?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Your chosen number : "+num);
		
		int[] result = new int[num];
		
		for(int i=0; i<result.length; i++) {
			result[i] = (1+i) * num;
			System.out.println(result[i]);
		}
		
		
	}
}