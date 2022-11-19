package task;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            String name, surname, group;
            System.out.println("Enter name: ");
            name = sc.next();
            System.out.println("Enter surname: ");
            surname = sc.next();
            System.out.println("Enter group: ");
            group = sc.next();
            students[i] = new Student(name, surname, group);

            Subject subjects[] = new Subject[5];
            for (int s = 0; s < subjects.length; s++) {
                subjects[s] = new Subject(s);
                subjects[s].setMark((float) (1 + Math.random() * (5 - 2)));
                subjects[s].setPassed(subjects[s].getMark() >= 2);
            }
          students[i].setSubjects(subjects);
        }
      for (Student student : students) {
          float sumMarks = 0;
          System.out.println(student.getId() + ": " + student.getSurname() + " Scores:");
          for (Subject subject : student.getSubjects()) {
              System.out.println(subject.getNameSubject() + " " + subject.getMark() + " - passed: " + subject.getPassed());
              sumMarks += subject.getMark();
          }
        float avgMark = sumMarks / student.getSubjects().length;
          System.out.println("Average mark of student: " + avgMark);
          if (avgMark < 5) {
              System.out.println("Type of grants: Default");
          } else {
              System.out.println("Type of grants: Raised");
          }
      }
      sc.close();
      String theBestSubject = Utils.getTheBestSubject(students);
      System.out.println("Subject with higher marks: " + theBestSubject);
      String theBestStudent = Utils.getTheBestStudent(students);
      System.out.println("Student with higher marks: " + theBestStudent);
    }
}
