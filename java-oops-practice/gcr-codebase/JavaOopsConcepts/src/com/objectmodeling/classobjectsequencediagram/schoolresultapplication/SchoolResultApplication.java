package com.objectmodeling.classobjectsequencediagram.schoolresultapplication;

/* School Result Application


Class Diagram
 
The class diagram represents the structure of a school results application where students have subjects, and their scores are calculated for grades.
Diagram Description:
Classes: Student, Subject, GradeCalculator
Relationships:
A Student has multiple Subject entries (Aggregation).
GradeCalculator computes the results for a Student.
→ Draw the Class Diagram


Object Diagram

An object diagram provides a snapshot of the Student and their Subject objects at a particular point.
Example:
Student: John
Subjects: Maths, Science
Marks: 90, 85
→ Draw the Object Diagram


Sequence Diagram

The sequence diagram shows how objects interact to calculate grades.
Scenario: A student requests their grade based on marks in subjects.
Actors:
Student
GradeCalculator

Feature :                   School Results Application
Classes :                   Student, Subject, GradeCalculator
Relationships :             Aggregation
Primary Functionality :     Calculate grade
Key Entities                Students, Subjects, Grades

*/

