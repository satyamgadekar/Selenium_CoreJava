package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> Numlist = new ArrayList<Integer>();
		Numlist.add(1);
		Numlist.add(3);
		Numlist.add(2);
		Numlist.add(3);
		Numlist.add(5);
		Numlist.add(7);
		Numlist.add(6);
		Numlist.add(5);
		Numlist.add(1);
		
		//To print distinct values from an array
		List Num = Numlist.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct values are: " + Num);
		
		//To sort an array
		List Num1 = Numlist.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted values are : " + Num1);
		
		//To print distinct and sorted value
		List Num2 = Numlist.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Distinct values with sort are: " + Num2);
		System.out.println(Num.size());
	}

}
