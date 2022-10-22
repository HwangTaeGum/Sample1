import java.util.Scanner;
public class CircleArea{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		System.out.println("5개의 정수를 입력하세요.");
		double sum = 0.0;
		
		for(int i=0; i < intArray.length; i ++) {
			intArray[i] = scanner.nextInt();
			
		for(int i1=0; i1 < intArray.length; i1++) 
			sum += intArray[i1];
		
		System.out.println("평균은" + sum/intArray.length + "입니다.");
		
		scanner.close();
		
		
		}
		
	}
}