package Project;

import java.util.*;

public class Mitali {
    static int count = 0;
    static ArrayList<String> Name = new ArrayList<>();
    static ArrayList<String> Course = new ArrayList<>();
    static ArrayList<Integer> BME = new ArrayList<>();
    static ArrayList<Integer> BEEE = new ArrayList<>();
    static ArrayList<Integer> EC = new ArrayList<>();
    static ArrayList<Integer> DS = new ArrayList<>();
    static ArrayList<Integer> Maths = new ArrayList<>();
    static ArrayList<Double> Percentage = new ArrayList<>();
    static ArrayList<Integer> AssignmentsSubmitted = new ArrayList<>();
    static ArrayList<ArrayList<String>> SportsEventsList = new ArrayList<>();
    static ArrayList<ArrayList<String>> QuizEventsList = new ArrayList<>();
    static ArrayList<ArrayList<String>> CulturalEventsList = new ArrayList<>();
    static ArrayList<ArrayList<String>> VolunteerWorkList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************************************************\n");
        System.out.println("----------------WELCOME TO STUDENT GRADEBOOK SYSTEM----------------\n");
        System.out.println("*******************************************************************\n");

        while (true) {
            System.out.println("Student Gradebook System Menu:\n");
            System.out.println("1. Add Student Data");
            System.out.println("   - Add information about a new student, including marks in different courses.");
            System.out.println("2. Class Statistics");
            System.out.println("   - View statistics for the entire class, including highest, lowest, and average percentages.");
            System.out.println("3. Add Sports Participation");
            System.out.println("   - Record participation in sports events.");
            System.out.println("4. Add Quiz Participation");
            System.out.println("   - Record participation in quiz events.");
            System.out.println("5. Add Cultural Participation");
            System.out.println("   - Record participation in cultural events.");
            System.out.println("6. Add Volunteer Work");
            System.out.println("   - Record participation in volunteer work.");
            System.out.println("7. Display Students Table");
            System.out.println("   - View a table containing details of all students.");
            System.out.println("8. Retrieve Individual Student Details");
            System.out.println("   - Retrieve and display individual student's details.");
            System.out.println("9. Exit\n");
            System.out.print("Enter your choice: ");
            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer menu choice.");
                scanner.next();
                continue;
            }


            scanner.nextLine();

            switch (choice) {

                case 1:
                    addStudentDetails(scanner);
                    break;
                case 2:
                    displayClassStatistics();
                    break;
                case 3:
                    addSportsParticipation(scanner);
                    break;
                case 4:
                    addQuizParticipation(scanner);
                    break;
                case 5:
                    addCulturalParticipation(scanner);
                    break;
                case 6:
                    addVolunteerWork(scanner);
                    break;
                case 7:
                    displayStudentTable();
                    break;
                case 8:
                    retrieveIndividualStudentDetails();
                    break;
                case 9:
                    System.out.println("Exiting Student Gradebook System.");
                    System.out.println("------------Thank you!-----------");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid choice from the menu.");
                    continue;
            }
        }
    }
    public static void addStudentDetails(Scanner scanner) {

        System.out.println("Enter the name of the student");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty. Please enter a name.");
            return;
        }
        Name.add(name);
        System.out.println("Enter the course: ");
        String course = scanner.nextLine();
        if (course.isEmpty()) {
            System.out.println("Course cannot be empty. Please enter a course.");
            return;
        }
        Course.add(course);

        int bme, beee, ec, ds, maths;

        do {
            System.out.println("Enter marks for BME (0-100): ");
            bme = scanner.nextInt();
        } while (bme < 0 || bme > 100);
        BME.add(bme);

        do {
            System.out.println("Enter marks for BEEE (0-100): ");
            beee = scanner.nextInt();
        } while (beee < 0 || beee > 100);
        BEEE.add(beee);

        do {
            System.out.println("Enter marks for EC (0-100): ");
            ec = scanner.nextInt();
        } while (ec < 0 || ec > 100);
        EC.add(ec);

        do {
            System.out.println("Enter marks for DS (0-100): ");
            ds = scanner.nextInt();
        } while (ds < 0 || ds > 100);
        DS.add(ds);

        do {
            System.out.println("Enter marks for Maths (0-100): ");
            maths = scanner.nextInt();
        } while (maths < 0 || maths > 100);
        Maths.add(maths);

        double percentage = calculatePercentage(bme, beee, ec, ds, maths);
        Percentage.add(percentage);

        System.out.print("Enter number of assignments submitted (out of 10): ");
        int assignments = scanner.nextInt();
        while (assignments < 0 || assignments > 10) {
            System.out.println("Invalid input. Assignments submitted should be between 0 and 10.");
            System.out.print("Enter number of assignments submitted (out of 10): ");
            assignments = scanner.nextInt();
        }
        AssignmentsSubmitted.add(assignments);
        ArrayList<String> studentSportsEvents = new ArrayList<>();
        ArrayList<String> studentQuizEvents = new ArrayList<>();
        ArrayList<String> studentCulturalEvents = new ArrayList<>();
        ArrayList<String> studentVolunteerWork = new ArrayList<>();

        SportsEventsList.add(studentSportsEvents);
        QuizEventsList.add(studentQuizEvents);
        CulturalEventsList.add(studentCulturalEvents);
        VolunteerWorkList.add(studentVolunteerWork);

        count++;
    }
    public static void displayStudentTable() {
        if (count == 0) {
            System.out.println("No student records available to display.");
        } else {
            System.out.println("Student Records:");
            System.out.printf("%-20s%-20s%-10s%-10s%-10s%-10s%-10s%-15s%-15s%-15s%-15s%n",
                    "Name", "Course", "BME", "BEEE", "EC", "DS", "Maths", "Percentage", "Assignments", "Sports",
                    "Quiz", "Cultural", "Volunteer");

            for (int i = 0; i < count; i++) {
                double percentage = calculatePercentage(BME.get(i), BEEE.get(i), EC.get(i), DS.get(i), Maths.get(i));
                Percentage.set(i, percentage);

                ArrayList<String> studentSportsEvents = SportsEventsList.get(i);
                ArrayList<String> studentQuizEvents = QuizEventsList.get(i);
                ArrayList<String> studentCulturalEvents = CulturalEventsList.get(i);
                ArrayList<String> studentVolunteerWork = VolunteerWorkList.get(i);

                System.out.printf("%-20s%-20s%-10d%-10d%-10d%-10d%-10d%-15.2f%-15d%-15s%-15s%-15s%-15s%n",
                        Name.get(i), Course.get(i), BME.get(i), BEEE.get(i), EC.get(i), DS.get(i), Maths.get(i),
                        percentage, AssignmentsSubmitted.get(i), String.join(", ", studentSportsEvents),
                        String.join(", ", studentQuizEvents), String.join(", ", studentCulturalEvents),
                        String.join(", ", studentVolunteerWork));
            }
        }
    }
    public static void retrieveIndividualStudentDetails() {
        if (count == 0) {
            System.out.println("No student records available.");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            String studentName = sc.nextLine();
            int studentIndex = Name.indexOf(studentName);

            if (studentIndex != -1) {
                System.out.println("Student Details:");
                System.out.println("Name: " + Name.get(studentIndex));
                System.out.println("Course: " + Course.get(studentIndex));
                System.out.println("BME: " + BME.get(studentIndex));
                System.out.println("BEEE: " + BEEE.get(studentIndex));
                System.out.println("EC: " + EC.get(studentIndex));
                System.out.println("DS: " + DS.get(studentIndex));
                System.out.println("Maths: " + Maths.get(studentIndex));
                System.out.println("Percentage: " + Percentage.get(studentIndex));
            } else {
                System.out.println("Student not found.");
            }
        }
    }

    public static void displayClassStatistics() {
        if (count == 0) {
            System.out.println("No student records available to calculate statistics.");
        } else {
            double highestPercentage = Percentage.get(0);
            double lowestPercentage = Percentage.get(0);
            String studentHighest = Name.get(0);
            String studentLowest = Name.get(0);
            double totalPercentage = 0;

            for (int i = 0; i < count; i++) {
                double currentPercentage = Percentage.get(i);
                totalPercentage += currentPercentage;

                if (currentPercentage > highestPercentage) {
                    highestPercentage = currentPercentage;
                    studentHighest = Name.get(i);
                }

                if (currentPercentage < lowestPercentage) {
                    lowestPercentage = currentPercentage;
                    studentLowest = Name.get(i);
                }
            }

            double averagePercentage = totalPercentage / count;
            System.out.println("Class Statistics:");
            System.out.println("Highest Percentage: " + highestPercentage + "% (Student: " + studentHighest + ")");
            System.out.println("Lowest Percentage: " + lowestPercentage + "% (Student: " + studentLowest + ")");
            System.out.println("Average Percentage: " + averagePercentage + "%");
        }
    }
    public static void addSportsParticipation(Scanner scanner) {
        System.out.print("Did the student participate in sports events? (yes/no): ");
        String sportsOption = scanner.nextLine().toLowerCase();

        if (sportsOption.equals("yes")) {
            System.out.print("Enter sports event: ");
            String sportsEvent = scanner.nextLine();
            SportsEventsList.get(count - 1).add(sportsEvent);
            System.out.println("Sports participation recorded.");
        } else if (sportsOption.equals("no")) {
            System.out.println("No sports participation recorded.");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
    }

    public static void addQuizParticipation(Scanner scanner) {
        System.out.print("Did the student participate in quiz events? (yes/no): ");
        String quizOption = scanner.nextLine().toLowerCase();

        if (quizOption.equals("yes")) {
            System.out.print("Enter quiz event: ");
            String quizEvent = scanner.nextLine();
            QuizEventsList.get(count - 1).add(quizEvent);
            System.out.println("Quiz participation recorded.");
        } else if (quizOption.equals("no")) {
            System.out.println("No quiz participation recorded.");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
    }

    public static void addCulturalParticipation(Scanner scanner) {
        System.out.print("Did the student participate in cultural events? (yes/no): ");
        String culturalOption = scanner.nextLine().toLowerCase();

        if (culturalOption.equals("yes")) {
            System.out.print("Enter cultural event: ");
            String culturalEvent = scanner.nextLine();
            CulturalEventsList.get(count - 1).add(culturalEvent);
            System.out.println("Cultural participation recorded.");
        } else if (culturalOption.equals("no")) {
            System.out.println("No cultural participation recorded.");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
    }

    public static void addVolunteerWork(Scanner scanner) {
        System.out.print("Did the student participate in volunteer events? (yes/no): ");
        String volunteerOption = scanner.nextLine().toLowerCase();

        if (volunteerOption.equals("yes")) {
            System.out.print("Enter volunteer event: ");
            String volunteerEvent = scanner.nextLine();
            VolunteerWorkList.get(count - 1).add(volunteerEvent);
            System.out.println("Volunteer participation recorded.");
        } else if (volunteerOption.equals("no")) {
            System.out.println("No volunteer participation recorded.");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
    }

    public static double calculatePercentage(int bme, int beee, int ec, int ds, int maths) {
        int totalMarks = bme + beee + ec + ds + maths;
        return ((double) totalMarks / 500) * 100;
    }
}
