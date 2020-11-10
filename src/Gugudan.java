import java.util.Scanner; // Scanner 대문자

//method 함수를 설정하여 좀더 이해가 쉽게 코드 짜기
public class Gugudan {
	public static int[] calculate(int times) { //배열함수 설정.
		int[] result = new int[9]; // new 까먹지마
		
		for(int i=0; i<result.length; i++) {
			result[i] = (1+i) * times; // times를 왜 설정해놓고 안써
		}
		
		return result;
	}
	public static void print(int[] result) {
		for(int i=0; i<result.length;i++) {
			System.out.println(result[i]);// 그냥 result라고 하니까 [I@8efb846와 같은 결과 나옴.
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("What is your number?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 기억 안났음
		System.out.println("your adopted num : "+num);
		
			int result[] = calculate(num);
			print(result);
			
		

	}
}
