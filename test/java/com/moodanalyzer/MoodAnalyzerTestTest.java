package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;




public class MoodAnalyzerTestTest {

	@Test
	public void givenMessage_whenSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String actual = moodAnalyzer.analyzeMood("I am Sad");
		String expected = "SAD";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void givenMessage_whenHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String actual = moodAnalyzer.analyzeMood("I am Happy");
		String expected = "HAPPY";
		Assert.assertEquals(expected, actual);
	}

	
	}




	

