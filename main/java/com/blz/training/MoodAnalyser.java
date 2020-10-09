package com.blz.training;

import java.util.Scanner;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood(String message) {
		this.message = message;
		return analyseMood();
	}

	public String analyseMood() {
		if (message.contains("Sad"))
			return "Sad";
		else
			return "Happy";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		sc.close();

		MoodAnalyser obj = new MoodAnalyser();
		String result = obj.analyseMood(message);
		System.out.println(result);
	}

}