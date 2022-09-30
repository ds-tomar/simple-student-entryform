public class StudentOperation {
    public int totalMarks(Student student) {
        return student.getEnglishMark() + student.getMathematicsMark() + student.getScienceMark() + student.getSocialScienceMark() + student.getComputerMark();
    }


}
