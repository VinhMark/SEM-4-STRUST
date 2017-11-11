package model;

import java.util.ArrayList;
import java.util.List;

import entities.Language;

public class LanguageModel {

	public List<Language> findAll() {
		List<Language> languages = new ArrayList<Language>();
		languages.add(new Language("l1","language 1"));
		languages.add(new Language("l2","language 2"));
		languages.add(new Language("l3","language 3"));
		languages.add(new Language("l4","language 4"));
		languages.add(new Language("l5","language 5"));
		return languages;
	}
	
}
