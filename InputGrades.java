import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] student = new Student[10];
        for (int x = 0; x < student.length; x++) {
            student[x] = new Student();
        }
        for (int x = 0; x < student.length; x++) {
            System.out.println("STUDENT #" + (x + 1));
            System.out.print("Enter ID for student #" + (x + 1) + ": ");
            student[x].setStudentNum(input.nextInt());
            for (int y = 0; y < 5; y++) {
                boolean isValid = false;
                System.out.println();
                System.out.print("Enter course ID #" + (y + 1) + ": ");
                student[x].setCourseID(input.next(), y);
                System.out.print("Enter credit hours for course #" + (y + 1) + ": ");
                student[x].setCreditHour(input.nextInt(), y);
                do {
                    System.out.print("Enter grade for course #" + (y + 1) + ": ");
                    student[x].setGrade(input.next(), y);
                    switch (student[x].getCourse(y).getGrade()) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'F':
                            isValid = true;
                            break;
                        default:
                            System.out.print("Invalid grade. ");
                            isValid = false;
                            break;
                    }
                } while (!isValid);
            }
            System.out.println();
            System.out.println("====================================");
        }
        for (int x = 0; x < student.length; x++) {
            System.out.println("STUDENT #" + student[x].getStudentNum());

            // displays courses
            System.out.println("Course ID # \tCredit hour \t Grade");

            for (int y = 0; y < 5; y++) {
                System.out.println(y + " -- " +
                        student[x].getCourse(y).getCourseID() + "\t" +
                        student[x].getCourse(y).getCreditHour() + "\t" +
                        student[x].getCourse(y).getGrade());
            }

            System.out.println();
            System.out.println("====================================");
        }
    }
}