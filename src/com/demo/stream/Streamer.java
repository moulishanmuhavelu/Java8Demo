package com.demo.stream;

import java.util.ArrayList;
import java.util.List;

public class Streamer {

	private List<String> words = new ArrayList<String>();

	public static void main(String arg[]) {
		Streamer streamer = new Streamer();
		streamer.buildList();
		streamer.countEmptyWordsJava7();
		streamer.countEmptyWordsJava8();
	}
	private void countEmptyWordsJava7() {
		int count = 0;
		for (String str : words) {
			if(str.isEmpty()) {
				count++;
			}
		}
		System.out.println("countEmptyWordsJava7:" + count);
	}
	
	private void countEmptyWordsJava8() {
		long count = words.stream().filter(word -> word.isEmpty()).count();
		System.out.println("countEmptyWordsJava7:" + count);
	}
	private void buildList() {
		words.add("BAT");
		words.add("");
		words.add("FOX");
		words.add("TO");
		words.add("");
		words.add("TOP");
		words.add("");
	}


}
