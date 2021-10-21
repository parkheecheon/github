package baseball;

import java.util.*;
import java.util.stream.Stream;

public class Baseball {
	/* 컴퓨터는 임의의 숫자 3자리를 정함.
	 * 유저는 3자리를 입력하여 컴퓨터가 입력한 숫자와 비교
	 * 동일한 숫자가 있으면 볼, 동일한 숫자가 동일한 위치에 있으면 스트라이크
	 * 4볼은 1스트라이크
	 * 3 스트라이크 시 게임종료
	 * 게임을 종료 후 다시 시작 또는 완전히 종료
	 */
	public static void main(String[] args) {
		
		// computer 임의의 수 3자리 -> integer 배열
		int numOfDigit = 3;
		int[] computer = new int[numOfDigit];
		for(int i=0;i<numOfDigit;i++) {
			computer[i] = (int)(Math.random()*9);
			while(computer[0]==0) 
				computer[0] = (int)(Math.random()*9)+1;
			
		}
		System.out.println(Arrays.toString(computer));
		
		
		// 유저 3자리 -> integer 배열
		Scanner scan = new Scanner(System.in);
		int userNum = scan.nextInt();
		int[] user = Stream.of(String.valueOf(userNum).split("")).mapToInt(Integer::parseInt).toArray();		
		System.out.println(Arrays.toString(user));
	
	
		// 볼 스트라이크 판정
		for(int i=0;i<user.length;i++) {
			for(int j=0;j<computer.length;j++) {
				if(i==j) {
					if(user[i]==computer[j]) {
						System.out.println("스트라이크");
					}	
				}else if(user[i]==computer[j]){
					System.out.println("볼");					
				}
				
			}
	
		}	
	
	
	}

}
