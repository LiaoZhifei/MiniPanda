package org.minipanda.thespring.inaction.ch1.impl;

import org.minipanda.thespring.inaction.ch1.CompactDisc;
import org.springframework.stereotype.Component;

@Component("sgtPeppers")
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public SgtPeppers() {
		System.out.println("The spring component which named 'SgtPepers' has been created!");
	}
	
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
