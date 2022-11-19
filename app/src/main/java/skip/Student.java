package skip;

public class Student {
    int id;
    static int nextId = 1;
    String name;
    String surname;
    String group;
    Subject[] subjects;

    public Student() {}

  public Student(String name, String surname, String group) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

  public void setId(int id) {
        this.id = id;
    }

  public int getId() {
        return this.id;
    }

  public void setName(String name) {
        this.name = name;
    }

  public String getName() {
        return this.name;
    }

  public void setSurname(String surname) {
        this.surname = surname;
    }

  public String getSurname() {
        return this.surname;
    }

  public void setGroup(String group) {
        this.group = group;
    }

  public String getGroup() {
        return this.group;
    }

  public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

  public Subject[] getSubjects() {
        return this.subjects;
    }
}