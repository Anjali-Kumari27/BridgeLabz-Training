package com.regex.extractlinkFromWeb;

import java.util.regex.*;
public class LinkFromWebPage {
	public static void main(String[] args) {
		String text = "Visit https://www.amazon.in";
		
		String regex = "\\bhttps://(www\\.)([a-zA-Z0-9.-]+)";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println("Link found : " + matcher.group());
		}
		
	}

}
