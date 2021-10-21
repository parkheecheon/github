package baseball;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Computer {

	public static void main(String[] args) {
		
		boolean run = true;
		int numOfDigit = 3;
		
		
			Scanner scan = new Scanner(System.in);
			
			int[] computer = new int[numOfDigit];
			for(int i=0;i<numOfDigit;i++) {
				computer[i] = (int)(Math.random()*9);
				while(computer[0]==0) 
					computer[0] = (int)(Math.random()*9)+1;
				
			}
			System.out.println(Arrays.toString(computer));
					
			while(run) {
				int strike=0, ball=0;
				
				System.out.print("숫자를 입력 하세요 : ");
				int userNum = scan.nextInt();
//				scan.nextLine();
				int[] user = Stream.of(String.valueOf(userNum).split("")).mapToInt(Integer::parseInt).toArray();		
				System.out.println(Arrays.toString(user));
						
				for(int i=0;i<user.length;i++) {
					for(int j=0;j<computer.length;j++) {
						if(i==j) {
							if(user[i]==computer[j]) {
								strike++;
							}	
						}else if(user[i]==computer[j]){
								ball++;					
						}
					}
				}	
				System.out.println(ball + "볼 " + strike + "스트라이크");
				
			
			if(strike==numOfDigit) {
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
				System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
				int select = scan.nextInt();
				scan.nextLine();
				if(select ==1) {
						continue;
				} else if (select == 2) {
						break;
				}
			}
		}
					
	}

		
	
}