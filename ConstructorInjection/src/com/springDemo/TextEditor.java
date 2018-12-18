package com.springDemo;

public class TextEditor {

	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker) {
		
		System.out.println("TextEditor Constructor");
		this.spellChecker = spellChecker;
	}
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
