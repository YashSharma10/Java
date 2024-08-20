package StudentMitali;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMitali {

	static class Student {
		String rollNumber;
		String name;
		String className;
		String phoneNumber;
		int attendance;
		String healthInfo;
		String disciplinaryAction;
		Map<String, Double> grades = new HashMap<>();
		Map<String, String> coCurricularActivities = new HashMap<>();

		public Student(String rollNumber, String name, String className, String phoneNumber, int attendance,
				String healthInfo, String disciplinaryAction) {
			this.rollNumber = rollNumber;
			this.name = name;
			this.className = className;
			this.phoneNumber = phoneNumber;
			this.attendance = attendance;
			this.healthInfo = healthInfo;
			this.disciplinaryAction = disciplinaryAction;
		}
	}

	static Map<String, Student> students = new HashMap<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. Add Student");
			System.out.println("2. View Student Details");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addStudent(scanner);
				break;
			case 2:
				viewStudentDetails(scanner);
				break;
			case 3:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	private static void addStudent(Scanner scanner) {
		System.out.print("Enter student name: ");
		String name = scanner.nextLine();
		System.out.print("Enter roll number: ");
		String rollNumber = scanner.nextLine();
		System.out.print("Enter class name: ");
		String className = scanner.nextLine();
		System.out.print("Enter phone number: ");
		String phoneNumber = scanner.nextLine();
		System.out.print("Enter attendance percentage: ");
		int attendance = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter health problem if any: ");
		String healthInfo = scanner.nextLine();
		System.out.print("Enter disciplinary action: ");
		String disciplinaryAction = scanner.nextLine();

		Student student = new Student(rollNumber, name, className, phoneNumber, attendance, healthInfo,
				disciplinaryAction);

		System.out.print("Enter number of subjects: ");
		int numSubjects = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numSubjects; i++) {
			System.out.print("Enter subject " + (i + 1) + " name: ");
			String subject = scanner.nextLine();
			System.out.print("Enter grade for " + subject + ": ");
			double gradeValue = scanner.nextDouble();
			scanner.nextLine();
			student.grades.put(subject, gradeValue);
		}

		System.out.print("Enter number of co-curricular activities: ");
		int numActivities = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numActivities; i++) {
			System.out.print("Enter co-curricular activity " + (i + 1) + ": ");
			String activity = scanner.nextLine();
			student.coCurricularActivities.put("Activity " + (i + 1), activity);
		}

		students.put(rollNumber, student);
	}

	private static void viewStudentDetails(Scanner scanner) {
		System.out.print("Enter student roll number: ");
		String rollNo = scanner.nextLine();
		Student selectedStudent = students.get(rollNo);
		if (selectedStudent != null) {
			System.out.println("1. Personal Information");
			System.out.println("2. Academic Information");
			System.out.println("3. Administrative Information");
			System.out.print("Enter your choice: ");
			int infoChoice = scanner.nextInt();
			scanner.nextLine();
			switch (infoChoice) {
			case 1:
				displayPersonalInfo(selectedStudent);
				break;
			case 2:
				displayAcademicInfo(selectedStudent);
				break;
			case 3:
				displayAdministrativeInfo(selectedStudent);
				break;
			default:
				System.out.println("Invalid choice!");
			}
		} else {
			System.out.println("Student not found!");
		}
	}

	private static void displayPersonalInfo(Student student) {
		System.out.println("Name: " + student.name);
		System.out.println("Roll Number: " + student.rollNumber);
		System.out.println("Class: " + student.className);
		System.out.println("Phone Number: " + student.phoneNumber);
	}

	private static void displayAcademicInfo(Student student) {
		System.out.println("Grades:");
		student.grades.forEach((key, value) -> {
			System.out.println("- Subject: " + key + ", Grade: " + value);
		});
	}

	private static void displayAdministrativeInfo(Student student) {
		System.out.println("Attendance: " + student.attendance + "%");
		System.out.println("Health Problem : " + student.healthInfo);
		System.out.println("Disciplinary action : " + student.disciplinaryAction);
		System.out.println("Co-curricular Activities:");
		student.coCurricularActivities.forEach((key, value) -> {
			System.out.println("- " + value);
		});
	}
}
