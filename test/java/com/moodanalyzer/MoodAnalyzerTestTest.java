package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;




public class MoodAnalyzerTestTest {

	@Test
	public void givenMessage_whenSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Sad");
		String actual = moodAnalyzer.analyseMood();
		String expected = "SAD";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void givenMessage_whenNotSad_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Happy");
		String actual = moodAnalyzer.analyseMood();
		String expected = "HAPPY";
		Assert.assertEquals(expected, actual);
	}
		
		
		
		@Test
		public void givenNull_ShouldReturnHappy() {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("null");
			String actual = moodAnalyzer.analyseMood();
			String expected = "HAPPY";
			Assert.assertEquals(expected, actual);
			
		}
		
	
	
}




	

