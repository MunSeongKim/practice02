package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "금액:" );
		int money = scanner.nextInt();
		int result[] = new int[10];
		boolean sw = true;
		int flag = 50000;
		for(int i = 0; i < 10; i++){
			result[i] = money / flag;
			money = money - (result[i] * flag);
			if(sw == true){
				System.out.println(flag + "원: " + result[i] + "개");
				flag = flag / 5;
				sw = false;
			} else {
				System.out.println(flag + "원: " + result[i] + "개");
				flag = flag / 2;
				sw = true;
			}
		}

		
		scanner.close();
 	}
}