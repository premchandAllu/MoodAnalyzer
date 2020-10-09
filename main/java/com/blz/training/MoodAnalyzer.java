package com.blz.training;

import java.util.Scanner;

public class MoodAnalyzer {

	private String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyzeMood(String message) {
		this.message = message;
		return analyzeMood();
	}

	public String analyzeMood() {
		try {
			if (message.contains("Sad"))
				return "Sad";
			else
				return "Happy";
		} catch (NullPointerException e) {
			return "Happy";
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		sc.close();

		MoodAnalyzer obj = new MoodAnalyzer();
		String result = obj.analyzeMood(message);
		System.out.println(result);
	}
}