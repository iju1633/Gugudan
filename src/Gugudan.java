import java.util.Scanner;

//사용자로부터 숫자를 받아서 해당 구구단을 출력시키는 클래스
public class Gugudan {
	public static void main(String[] args) {

		System.out.println("내가 출력할 구구단은?");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println(num * 1);
		System.out.println(num * 2);
		System.out.println(num * 3);
		System.out.println(num * 4);
		System.out.println(num * 5);
		System.out.println(num * 6);
		System.out.println(num * 7);
		System.out.println(num * 8);
		System.out.println(num * 9);
		
		
	}
}
