
//이중 for문을 이용한 구구단 출력
public class Gugudan {


	public static void main(String[] args) {
		
		int[] result = new int[9]; //크기가 9인 배열함수 설정
		
		for(int j = 1; j<10; j++)
		{
			System.out.println(j+"단입니다");
		for(int i = 0; i<9; i++)
		{
			result[i] = j * (i+1);
			System.out.println(result[i]);
		}
		
		}
	}
}
