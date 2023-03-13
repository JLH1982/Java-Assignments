public class CollegeCourse {
   private String courseID;
   private int creditHour;
   private char grade;

   public String getCourseID() {
      return this.courseID;
   }

   public int getCreditHour() {
      return this.creditHour;
   }

   public char getGrade() {
      return this.grade;
   }

   public void setCourseID(String id) {
      this.courseID = id;
   }

   public void setCreditHour(int hour) {
      this.creditHour = hour;
   }

   public void setGrade(String letterGrade) {
      this.grade = Character.toUpperCase(letterGrade.charAt(0));
   }
}