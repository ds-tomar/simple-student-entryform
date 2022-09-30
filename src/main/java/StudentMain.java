import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        final int MAX_SIZE = 2;
        Student[] students = new Student[MAX_SIZE];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int choice;

        do {
            System.out.println("\n---------------------------- Option ----------------------------");
            System.out.println("Press 1 for adding details of student.");
            System.out.println("Press 2 to display all student.");
            System.out.println("Press 3 to arrange student in descending order of total marks.");
            System.out.println("Press 4 to EXIT.");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    if (count != MAX_SIZE) {
                        students[count] = new Student();
                        System.out.println("\n------------------------- Student Form -------------------------");
                        System.out.print("Enter your name: ");
                        students[count].setName(scanner.nextLine());
                        System.out.print("Enter you roll number: ");
                        students[count].setRollNo(scanner.nextInt());
                        System.out.print("Enter English Mark: ");
                        students[count].setEnglishMark(scanner.nextInt());
                        System.out.print("Enter Mathematics Mark: ");
                        students[count].setMathematicsMark(scanner.nextInt());
                        System.out.print("Enter Science Mark: ");
                        students[count].setScienceMark(scanner.nextInt());
                        System.out.print("Enter Social Science Mark: ");
                        students[count].setSocialScienceMark(scanner.nextInt());
                        System.out.print("Enter Computer Mark: ");
                        students[count].setComputerMark(scanner.nextInt());
                        System.out.println("-------------------------- Thank You ---------------------------\n");
                        count++;
                        break;
                    }
                    else {
                        System.out.println("---------------------");
                        System.out.println("Storage is full");
                        System.out.println("---------------------");
                    }
                }
                case 2: {
                    display(students, count);
                    break;
                }
                case 3: {
                    sort(students, count);
                    display(students, count);
                    break;
                }
                case 4: {
                    System.out.println("Exiting................");
                    System.out.println("-------------------------- Thank You ---------------------------\n");
                    break;
                }
                default:
                    System.out.println("\n----------------------------------------------------------------");
                    System.out.printf("%42s%n", "Please Enter valid key");
                    System.out.println("----------------------------------------------------------------");
            }
        }
        while (choice != 4);

    }

    public static void display(Student[] students, int noOfObject) {
        System.out.println("\n------------------------- STUDENT DATA --------------------------");
        System.out.format("%2c%-25s%-25s%s%n", ' ', "Student Name", "Roll Number", "Total Marks");
        for (int i = 0; i < noOfObject; i++) {
            System.out.format("%2c%-30s%-24d%3d%n", ' ', students[i].getName(), students[i].getRollNo(),
                    students[i].totalMarks());
        }
        System.out.println("-----------------------------------------------------------------");
    }

    public static void sort(Student[] students, int noOfObject) {
        for (int i = 0; i < noOfObject; i++) {
            for (int j = i + 1; j < noOfObject; j++) {
                if (students[i].totalMarks() < students[j].totalMarks()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}
