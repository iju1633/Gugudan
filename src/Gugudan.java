import java.util.Scanner;

//사용자로부터 숫자를 받아서(6단,7단) 해당 구구단을 출력시키는 클래스
public class Gugudan {
	public static void main(String[] args) {

		System.out.println("내가 출력할 구구단은?"); // 6단과 7단인걸 알지만;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
//		int i = 1;
//		while(i<10) {
//			System.out.println(num * i);
//			i++;
//		}
		for(int i = 1; i<10; i++) {
			System.out.println(num * i);
		}
		
	}
}
