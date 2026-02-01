package com.interfaces.defaultmethod.dataexportfeature;

public class PDFReport implements ReportExporter{
	
	public void exportCSV() {
        System.out.println("CSV export from PDF report");
    }

    public void exportPDF() {
        System.out.println("Report exported in PDF format");
    }

}
