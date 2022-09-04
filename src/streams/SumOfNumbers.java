package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(23,9,9,39,85,93,84,19,57);
		Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
		System.out.println("The sum of number is: "+ sum.get());
		sum();

	}
	
	public static void sum() {
		List<Integer> list = Arrays.asList(47, 92, 92, 95, 20, 92,29,29);
		Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
		System.out.println("The sum of the number: "+ sum.get());
	}

}
