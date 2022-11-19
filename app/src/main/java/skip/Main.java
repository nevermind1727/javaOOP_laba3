package skip;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[2];

        for (int i = 0; i < students.length; i++) {
            String name, surname, group;
            System.out.println("Enter name: ");
            name = sc.next();
            System.out.println("Enter surname: ");
            surname = sc.next();
            System.out.println("Enter group: ");
            group = sc.next();
            students[i] = new Student(name, surname, group);

            Subject subjects[] = new Subject[2];
            for (int s = 0; s < subjects.length; s++) {
                subjects[s] = new Subject(s);
                subjects[s].setMark((float) (1+Math.random() * (5-2)));
                subjects[s].setPassed(subjects[s].getMark() >= 2);
            }
            students[i].setSubjects(subjects);
        }
        for (Student student: students) {
            System.out.println(student.getId() + ": " + student.getName() + " Scores:");
            for (Subject subject: student.getSubjects()) {
                System.out.println(subject.getNameSubject() + " " + subject.getMark() + " - passed" + subject.getPassed());
            }
        }
    }
}
