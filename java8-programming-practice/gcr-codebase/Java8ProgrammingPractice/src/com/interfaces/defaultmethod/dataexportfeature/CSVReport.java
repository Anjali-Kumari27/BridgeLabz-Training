package com.interfaces.defaultmethod.dataexportfeature;

public class CSVReport implements ReportExporter {

	@Override
	public void exportCSV() {
		// TODO Auto-generated method stub
		System.out.println("Report exported in CSV format");
	}

	@Override
	public void exportPDF() {
		// TODO Auto-generated method stub
		System.out.println("PDF export from CSV report");
	}

}
