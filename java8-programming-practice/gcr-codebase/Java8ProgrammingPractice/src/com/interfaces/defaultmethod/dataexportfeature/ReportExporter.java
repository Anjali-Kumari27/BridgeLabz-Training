package com.interfaces.defaultmethod.dataexportfeature;

public interface ReportExporter {

	// existing features
	void exportCSV();

	void exportPDF();

	// new feature added later
	// default method avoids breaking old classes
	default void exportToJSON() {
		System.out.println("Exporting report as JSON");
	}

}
