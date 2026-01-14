package com.tree.treeterminology;

/*
 * Scenario: You are developing a company organizational chart application. The company has
the following hierarchy:
CEO
/ \
CTO CFO
/ \ \
Dev Lead HR
/ \
Dev1 Dev2
Questions: a) Identify all leaf nodes in this organizational tree. b) What is the height of the tree?
c) What is the depth of “Dev Lead”? d) List all ancestors of “Dev1”. e) What is the degree of the
CTO node?
Expected Analysis: Students should be able to apply tree terminology to real-world
hierarchical structures and understand the relationships between nodes.

 */

public class UseTreeTerminology {

    public static void main(String[] args) {

        // -------- Creating Employees (Nodes) --------
        EmployeeNode CEO = new EmployeeNode("CEO");

        EmployeeNode CTO = new EmployeeNode("CTO");
        EmployeeNode CFO = new EmployeeNode("CFO");

        EmployeeNode devLead = new EmployeeNode("Dev Lead");
        EmployeeNode HR = new EmployeeNode("HR");

        EmployeeNode dev1 = new EmployeeNode("Dev1");
        EmployeeNode dev2 = new EmployeeNode("Dev2");

        // -------- Building the Tree Structure --------
        CEO.addChild(CTO);
        CEO.addChild(CFO);

        CTO.addChild(devLead);
        CTO.addChild(HR);

        devLead.addChild(dev1);
        devLead.addChild(dev2);

        // -------- Answers --------
        System.out.println("\na. Leaf Nodes: Dev1, Dev2, HR, CFO");
        System.out.println("\nb. Height of Tree: 3");
        System.out.println("\nc. Depth of Dev Lead: 2");
        System.out.println("\nd. Ancestors of Dev1: Dev Lead, CTO, CEO");
        System.out.println("\ne. Degree of CTO: " + CTO.children.size());
    }
}
