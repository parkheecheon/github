package baseball.domain;

import java.util.*;

public class Ball {
	
	public List<Integer> random(){
		List<Integer> numbers = new ArrayList<>();
		
		while(numbers.size()<3) {
			int number = new Random().nextInt(9)+1;
			
			numbers.add(number);
		}
		return numbers;
		
	}
	
	
	
	
}
