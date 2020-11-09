import java.util.Scanner;

//사용자로부터 숫자를 받아서(6단,7단) 해당 구구단을 출력시키는 클래스
public class Gugudan {
	public static void main(String[] args) {

		System.out.println("내가 출력할 구구단은?"); // 6단과 7단인걸 알지만;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("out number is : " + num);
			if(num>9) {
				System.out.println("error is caused because of big number");
				}
			else if (num<1) {
				System.out.println("error is caused because of small number");
				}
			else {
				for(int i = 1; i<10; i++) {
					System.out.println(num * i);}
				}
				
		
		
	}

		
	}

