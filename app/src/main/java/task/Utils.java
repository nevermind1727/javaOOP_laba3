package task;

public class Utils {
    public static String getTheBestSubject(Student[] student) {
        float maxscore = 0;
        String subname = "";
        float temp[] = new float[5];

        for (Student stud : student) {
            Subject[] subject = stud.getSubjects();
            for (int i = 0; i < subject.length; i++) {
                temp[i] += (subject[i].getMark() / student.length);
                if (maxscore < temp[i]) {
                    maxscore = temp[i];
                    subname = subject[i].getNameSubject();
                }
            }
        }
      return subname;
    }

  public static String getTheBestStudent(Student[] student) {
        float maxscore = 0;
        String studSurname = "";
        float temp[] = new float[5];

        for (int i = 0; i < student.length; i++) {
            float avgMark = 0;
            Subject[] subjects = student[i].getSubjects();
            for (int j = 0; j < subjects.length; j++) {
                avgMark += subjects[j].getMark();
            }
          temp[i] += avgMark / 5;
            if (maxscore < temp[i]) {
                maxscore = temp[i];
                studSurname = student[i].getSurname();
            }
        }
    return studSurname;
    }
}