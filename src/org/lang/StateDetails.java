package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("Tamil is spoken in north India");

	}
	public void northIndia() {
		System.out.println("Hindi is spoken in south India");

	}
	public static void main(String[] args) {
		StateDetails s=new StateDetails();
		LanguageInfo l=new LanguageInfo();
		s.southIndia();
		s.northIndia();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
	}



}
