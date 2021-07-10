package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;




public class MoodAnalyzerTestTest {

	@Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    
    @Test
    public void givenNullMoodShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    
    
    @Test
    public void givenMessage_whenNull_ShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.exceptionType);
        }
    }
    
    @Test
    public void givenMessage_whenEmpty_ShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println("here");
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
        }
    }

}




	

