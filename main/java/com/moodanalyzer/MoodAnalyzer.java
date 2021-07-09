package com.moodanalyzer;

public class MoodAnalyzer {
	
	private String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.toLowerCase().contains("sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			throw new NullPointerException("Invalid message");
			
		}

	}

}
