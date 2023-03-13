public class Student {
    private int studentNum;
    private CollegeCourse[] course = new CollegeCourse[5];

    public int getStudentNum() {
        return this.studentNum;
    }

    public void setStudentNum(int num) {
        this.studentNum = num;
    }

    public CollegeCourse getCourse(int index) {
        return this.course[index];
    }

    public void setCourseID(String id, int index) {
        this.course[index].setCourseID(id);
    }

    public void setCreditHour(int hour, int index) {
        this.course[index].setCreditHour(hour);
    }

    public void setGrade(String grade, int index) {
        this.course[index].setGrade(grade);
    }
}