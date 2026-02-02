package com.functionalinterface.function.studentmarks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Grade {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Anjali" , 40, 89));
		students.add(new Student("Ananya" , 38, 85));
		students.add(new Student("Devika" , 78, 84));
		students.add(new Student("Arpita" , 56, 71));
		
		Function<Student, String> gradeFunction = s -> {
			if(s.marks >= 75) {
				return "Grade A";
			}
			else if(s.marks >=60) {
				return "Grade B";
			}else {
				return "Grade C";
			}
		};
		
		students.forEach(m->{
			System.out.println(m.studentName + " -> " + gradeFunction.apply(m));
		});
	}

}
