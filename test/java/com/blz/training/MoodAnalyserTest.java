
	package com.blz.training;

	import static org.junit.Assert.assertEquals;

	import org.junit.Test;

	import junit.framework.Assert;
	public class MoodAnalyserTest {

		@SuppressWarnings("deprecation")
		@Test
		public void testMoodAnalysis_GivenSadMood_Constructor_ReturnSad() {
			MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad Mood");
			String message = moodAnalyzer.analyseMood();
			Assert.assertEquals("Sad", message);
		}
	}