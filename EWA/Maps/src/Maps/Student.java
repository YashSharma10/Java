

package Maps;

import java.util.*;

public class Student {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		map.put("YASH","A");
		map.put("MOHIT","B");
		map.put("AKUL","C");
		map.put("SUNNY","A");
		map.put("AMAN","B");
		map.put("SHIVAM","C");
		map.put("DRIZZLE","B");
		map.put("ADI","A");
		while (true) {
			System.out.println("MENU");
			System.out.println("1. ADD STUDENT");
			System.out.println("2. REMOVE STUDENT");
			System.out.println("3. MODIFY GRADES");
			System.out.println("4. PRINT");
			System.out.println("5. QUIT");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the student's name: ");
				String studentName = sc.next();
				System.out.print("\nEnter the grade for " + studentName + ": ");
				String grade = sc.next();
				map.put(studentName, grade);
				System.out.println(studentName + "'s grade (" + grade + ") has been added.\n");
				break;
			case 2:
				System.out.print("Enter the name of the student to remove: ");
				String studentName1 = sc.next();
				if (map.containsKey(studentName1)) {
					map.remove(studentName1);
					System.out.println(studentName1 + "'s record has been removed.\n");
				} else {
					System.out.println(studentName1 + " not found in the records.");
				}
				break;
			case 3:
				System.out.print("Enter the name of the student to modify the grade: ");
				String studentName2 = sc.next();
				if (map.containsKey(studentName2)) {
					System.out.print("Enter the new grade for " + studentName2 + ": ");
					String newGrade = sc.next();
					map.put(studentName2, newGrade);
					System.out.println(studentName2 + "'s grade has been updated to " + newGrade + ".");
				} else {
					System.out.println(studentName2 + " not found in the records.");
				}
				break;
			case 4:
				if(map.isEmpty()) {
					System.out.println("No record available");
				}
				else {
					System.out.println("Student Grades : ");
					for(Map.Entry<String, String> entry :map.entrySet()) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					}
				};
				break;
			case 5:
				System.out.println("Exiting program.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");

			}
			System.out.println("YASH SHARMA 22CSU295");
		}
		
	}

}
