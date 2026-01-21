package com.generics.multileveluniversitycoursemanagement;

import java.util.List;

public class CourseUtility {

	public static void displayAllCourses(List<? extends CourseType> courseTypes) {
		for (CourseType type : courseTypes) {
			type.displayEvaluation();
		}
	}
}
