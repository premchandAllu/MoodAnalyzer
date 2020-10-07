
	package com.blz.training;

	import static org.junit.Assert.assertEquals;

	import org.junit.Test;

	import junit.framework.Assert;

	public class MoodAnalyzerTest {

		@Test
		public void testMoodAnalysis_GivenHappyMood_ReturnHappy() {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
			String message = moodAnalyzer.analyzeMood("I am in Happy Mood");
			Assert.assertEquals("Happy", message);
		}
	}
