package task;

public class Subject {
  private String[] nameSubjects = { "English", "Geography", "Math", "Art", "Biology" };
  private String nameSubject;
  private float mark;
  private boolean passed;

  public Subject(int i) {
    this.nameSubject = nameSubjects[i];
  }

  public String getNameSubject() {
    return this.nameSubject;
  }

  public void setMark(float mark) {
    this.mark = mark;
  }

  public float getMark() {
    return this.mark;
  }

  public void setPassed(boolean passed) {
    this.passed = passed;
  }

  public boolean getPassed() {
    return this.passed;
  }
}