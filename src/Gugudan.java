//최종 요구사항 2
//사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
//예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.
//팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.

import java.util.Scanner;

public class Gugudan{
	
	public static void main(String[] args) {
		
		System.out.println("What is your number?");
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine(); // int num = sc.nextInt();과 다르게 ,이 포함된 입력값이기때문에 String!
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		int[] result = new int[first * second];
		
		for(int j=1; j<first+1; j++) {
		for(int i=1; i<second+1;i++) {
			result[i-1] = i * j;
			System.out.println(j+"*"+i+" = " + result[i-1]);
		}
		}
		
	}
}