package com.blz.training;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")

public class MoodAnalyzerTest {

	@Test
	public void givenNullMoodShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("Happy", mood);
	}
}