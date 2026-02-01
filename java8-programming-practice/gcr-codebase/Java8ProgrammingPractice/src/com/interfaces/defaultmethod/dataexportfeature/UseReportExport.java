package com.interfaces.defaultmethod.dataexportfeature;

public class UseReportExport {
	
	public static void main(String[] args) {

        ReportExporter report1 = new CSVReport();
        ReportExporter report2 = new PDFReport();

        System.out.println("CSV Report:");
        report1.exportCSV();
        report1.exportPDF();
        report1.exportToJSON(); // default method

        System.out.println();

        System.out.println("PDF Report:");
        report2.exportCSV();
        report2.exportPDF();
        report2.exportToJSON(); // works without changes
    }

}
