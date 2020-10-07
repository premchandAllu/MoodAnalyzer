package com.blz.training;

import java.util.Scanner;
public class MoodAnalyzer 
{
	public String analyzeMood(String message) {
		if (message.contains("Sad"))
			return "Sad";
		else
			return "Happy";

	}
	public static void main(String[] args) 
	 {
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();

		MoodAnalyzer obj = new MoodAnalyzer();
		String result = obj.analyzeMood(message);
		System.out.println(result);
	}

}