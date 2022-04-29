package com.edu;

public class TextEditor {
	private SpellCheck spellcheck;
	
	public SpellCheck getSpellcheck() {
		return spellcheck;
	}

	public void setSpellcheck(SpellCheck spellcheck) {
		this.spellcheck = spellcheck;
	}

	public void textFunc() {
		if (spellcheck != null) {
			spellcheck.spell();
		}
		else { 
			System.out.println(" No words present ");
		}
}
}