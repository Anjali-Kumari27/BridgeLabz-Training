package com.objectmodeling.assistedproblems.companydepartmentcomposition;

public class CompanyDepartmentComposition {
	
	public static void main(String[] args) {

        // Create company
        Company company = new Company("TechNova Pvt Ltd");

        // Create departments
        Department it = new Department("IT");
        Department hr = new Department("HR");

        // Add employees to departments
        it.addEmployee("Amit");
        it.addEmployee("Riya");

        hr.addEmployee("Suresh");
        hr.addEmployee("Neha");

        // Add departments to company
        company.addDepartment(it);
        company.addDepartment(hr);

        // Show full structure
        company.showCompanyDetails();

        // Close company (composition)
        company.closeCompany();
    }

}

