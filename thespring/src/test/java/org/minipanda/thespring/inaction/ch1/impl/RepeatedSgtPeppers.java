package org.minipanda.thespring.inaction.ch1.impl;

import org.minipanda.thespring.inaction.ch1.CompactDisc;
import org.springframework.stereotype.Component;

@Component("repeatedSgtPeppers")
public class RepeatedSgtPeppers implements CompactDisc {
	
	private String title = "RepeatSgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public RepeatedSgtPeppers() {
		System.out.println("The spring component which named 'RepeatedSgtPeppers' has been created!");
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
