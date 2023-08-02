package com.lumen.ref;

import java.util.Arrays;
import java.util.List;

class Course {
	String courseName;

	void show() {
		System.out.println("Showing Courses: ");
	}

}

interface CourseDetails {
	Course getCourse();
}

//interface CourseDetails {
//	List<String> showCourses();
//}

public class MethodRefConst {

	public static void main(String[] args) {

//		CourseDetails courseDetails = () -> Arrays.asList("C++", "Python", "Java", "JavaScript");
//		courseDetails.showCourses().forEach(course -> System.out.println(course));

		// using lambda returns a course object
		CourseDetails courseDetails = () -> new Course();
		Course course = courseDetails.getCourse();
		course.show();

		// using constructure ref
		courseDetails = Course::new;
		course = courseDetails.getCourse();
		course.show();

	}
}
