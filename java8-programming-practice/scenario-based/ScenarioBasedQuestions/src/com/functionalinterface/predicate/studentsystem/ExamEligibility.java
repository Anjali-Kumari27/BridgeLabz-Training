package com.functionalinterface.predicate.studentsystem;
/*
 * 1.In a student system, use a Predicate to check if a student is eligible for exam (attendance ≥ 75%).
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExamEligibility {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Anjali" , 40 , 80.9));
		students.add(new Student("Ananya" , 38 , 67.6));
		students.add(new Student("Devika" , 78 , 78));
		Predicate<Student> isEligible = (s)->s.attendance>=75;
		
		students.forEach(s->{
		if(isEligible.test(s)) {
			System.out.println(s.studentName + " is Eligible for the Exam");
		}else {
			System.out.println(s.studentName + " is Not Eligible for the Exam");
		}
		});
	}

}
