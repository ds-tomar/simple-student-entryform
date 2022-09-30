/*
*Write a program to accept name, roll-no and marks of english, mathematics, science, social science, and computer for
*  each student.

Calculate the total-marks and percentage for each student. Arrange the students in descending order of total marks.

Write a program to accept name, roll-no and marks of english, mathematics, science, social science, and computer for
* each student.

Calculate the total-marks and percentage for each student. Arrange the students in descending order of total marks.

Display the following menu to user:
press 1 for adding details of student
press 2 to display all student.
press 3 to arrange student in descending order of total marks
PRESS 4 TO EXIT


the details of students must be displayed in following format
Name		RollNo		TotalMarks
Vaibhav Diwan	81		500

hint: use System.out.format() to print details


Class must be properly encapsulated.

Calculation of total marks and percent should be in different class named as StudentOperation
*/

public class Student {
    private String name;
    private int rollNo;
    private int englishMark;
    private int mathematicsMark;
    private int scienceMark;
    private int socialScienceMark;
    private int computerMark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setEnglishMark(int englishMark) {
        this.englishMark = englishMark;
    }

    public void setMathematicsMark(int mathematicsMark) {
        this.mathematicsMark = mathematicsMark;
    }

    public void setScienceMark(int scienceMark) {
        this.scienceMark = scienceMark;
    }

    public void setSocialScienceMark(int socialScienceMark) {
        this.socialScienceMark = socialScienceMark;
    }

    public void setComputerMark(int computerMark) {
        this.computerMark = computerMark;
    }

    public int totalMarks() {
        return this.englishMark + this.mathematicsMark + this.scienceMark + this.socialScienceMark + this.computerMark;
    }

}
