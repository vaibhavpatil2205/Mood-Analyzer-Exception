package com.moodanalyzer;

public class MoodAnalyzer {
	
	public String analyzeMood(String message) {
		
		if (message.toLowerCase().contains("sad"))
				return "SAD";
				return "HAPPY";
	}

}
