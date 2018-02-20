package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int target = r.nextInt(100) +1;
		int count = 1, input = 0, min = 1, max = 100;
		String check = "";
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요"); 
		while(true) {
			System.out.println(min + "-" + max);
			System.out.print(count + ">>");
			input = s.nextInt();
			s.nextLine();
			if(input < target){
				System.out.println("더 높게");
				min = input;
			} else if( target < input ){
				System.out.println("더 낮게");
				max = input;
			} else {
				System.out.println("맞았습니다.\n다시하시겠습니까(y/n)>>");
				check = s.nextLine();
				if( check.equals("n") ) break;
				max = 100;
				min = 1;
				count = 0;
				target = r.nextInt(100) +1;
				System.out.println("수를 결정하였습니다. 맞추어 보세요"); 
			}
			count++;
		}
	}
}