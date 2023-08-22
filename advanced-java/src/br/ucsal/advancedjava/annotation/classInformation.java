package br.ucsal.advancedjava.annotation;

 @interface classInformation {

	 
	 String autor();

	 int numberClass();
	 
	 String blog() default "bonfireWebSite";
	 
	 String site () default "pinkFloydFanPage";
 }
