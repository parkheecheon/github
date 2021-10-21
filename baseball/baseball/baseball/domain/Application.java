package baseball.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		Ball random = new Ball();
		
		System.out.println(random.random());
		
		
		List list = Arrays.asList(1,2,3);
		
		System.out.println(list.get(0));
	}

}
