package StudentMitali;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Student {
    static class Details {
        String studentName;
        String RollNo;
        String parentsName;
        String address;
        String Class;
        int age;
        String phoneNo;
        String gender;
        Map<String, Double> grades = new HashMap<>();
        String Activities;
        String attendance;
        String healthStatus;
        String disciplinaryAction;
        Map<String, String> activities = new HashMap<>();

        public Details(String studentName, String RollNo, String parentsName, String address, String Class, int age,
                       String phoneNo, String gender, String attendance, String healthStatus, String disciplinaryAction) {
            this.studentName = studentName;
            this.RollNo = RollNo;
            this.parentsName = parentsName;
            this.address = address;
            this.Class = Class;
            this.age = age;
            this.phoneNo = phoneNo;
            this.gender = gender;
            this.attendance = attendance;
            this.healthStatus = healthStatus;
            this.disciplinaryAction = disciplinaryAction;
        }
    }

    static HashMap<String, Details> students = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT INFORMATION SYSTEM");
        System.out.println("Please enter the following details");

        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Please enter your Password:");
        String password = sc.nextLine();
        int choice;

        do {
            System.out.println("select an option ");
            System.out.println("1. Add Student ");
            System.out.println("2. View Student Details ");
            System.out.println("3. Exit");
            System.out.println("enter your choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nAdd student:");
                    addStudent(sc);
                    break;
                case 2:
                    System.out.println("View student details:");
                    ViewStudentdetails(sc);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private static void addStudent(Scanner sc) {
        System.out.println("name of student:");
        String name = sc.next();
        System.out.println("roll no:");
        String RollNo = sc.next();
        System.out.println("parents name:");
        String Parentsname = sc.next();
        System.out.println("address");
        String Address = sc.next();
        System.out.println("Class:");
        String Class = sc.next();
        System.out.println("enter your age:");
        int Age = sc.nextInt();
        System.out.println("phone number:");
        String PhoneNo = sc.next();
        System.out.println("gender:");
        String Gender = sc.next();
        System.out.println("Attendance:");
        String attendance = sc.next();
        System.out.println("HealthStatus::");
        String healthStatus = sc.next();
        System.out.println("Disciplinary action:");
        String DisciplinaryAction = sc.next();

        Details details = new Details(name, RollNo, Parentsname, Address, Class, Age, PhoneNo, Gender, attendance,
                healthStatus, DisciplinaryAction);
        students.put(RollNo, details);

        System.out.println("total number of subjects");
        int Subjects = sc.nextInt();

        for (int i = 0; i < Subjects; i++) {
            System.out.println("Enter subject name:");
            String subject = sc.next();
            System.out.println("Enter grade for subject " + subject + "out of 100:" );
            Double grade = sc.nextDouble();
            details.grades.put(subject, grade);
        }

        System.out.print("Enter number of activities: ");
        int Activities = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < Activities; i++) {
            System.out.print("Enter activity " + i + ": ");
            String activity = sc.nextLine();
            details.activities.put("Activity " + i, activity);
        }

    }

    private static void ViewStudentdetails(Scanner sc) {
        System.out.println("Student Roll Number:");
        String RollNo = sc.next();
        Details newstudent = students.get(RollNo);
        if (newstudent != null) {
            System.out.println("Choose an option:");
            System.out.println("1. Personal Information");
            System.out.println("2. Academic Information");
            System.out.println("3. Administrative Information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("1. Personal Information");
                    displaypersonalInformation(newstudent);
                    break;
                case 2:
                    System.out.println("2. Academic Information");
                    displayacademicinformation(newstudent);
                    break;
                case 3:
                    System.out.println("3. Administrative Information");
                    displayadministrativeinformation(newstudent);
                    break;
                case 4:
                    System.out.print("Exit... ");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }


    private static void displayadministrativeinformation(Details details) {
        System.out.println("Attendance: " + details.attendance + "%");
        System.out.println("Health Problem : " + details.healthStatus);
        System.out.println("Disciplinary action : " + details.disciplinaryAction);
    }

    private static void displayacademicinformation(Details details) {
        System.out.println("Grades:");
        details.grades.forEach((subject, grades) -> {
            System.out.println("Subject " + subject + ";Grades" + grades);
        });
    }

    private static void displaypersonalInformation(Details details) {
        System.out.println("Personal Information:");
        System.out.println("Student Name: " + details.studentName);
        System.out.println("Roll Number: " + details.RollNo);
        System.out.println("Parent's Name: " + details.parentsName);
        System.out.println("Address: " + details.address);
        System.out.println("Class: " + details.Class);
        System.out.println("Age: " + details.age);
        System.out.println("Phone Number: " + details.phoneNo);
        System.out.println("Gender: " + details.gender);
        System.out.println("Activities: " + details.Activities);
        System.out.println();
    }
}