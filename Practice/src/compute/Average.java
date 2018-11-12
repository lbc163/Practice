package compute;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		int count = 0;
		int number;
		while(true) {
		       try {
			          number = scanner.nextInt();
			          if(number == 0) {
				               break;
				      }
			          sum += number;
			          count++;
		        }catch(InputMismatchException e) {
			          System.out.printf("���L�D��ƿ�J: %s%n",scanner.next());
	            }
	    }
		System.out.printf("���� %.2f%n",sum/count);
   }
}
