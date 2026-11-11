// This program determines a student's grade based on marks.
public class StudentGrade {
	public static void main(String[] args) {
		int marks = 50;

		if (marks >= 0 && marks <= 100) {
			if (marks >= 70) {
				System.out.println("Grade: A");
			} else if (marks >= 60) {
				System.out.println("Grade: B");
			} else if (marks >= 50) {
				System.out.println("Grade: C");
			} else if (marks >= 40) {
				System.out.println("Grade: D");
			} else {
				System.out.println("Grade: F (Fail)");
			}
		} else {
			System.out.println("Invalid marks! Please enter a value between 0 and 100.");
		}
	}
}
