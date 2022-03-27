import java.util.ArrayList;

public class Career {

  private String name;
  ArrayList<Student> st;

  public Career(String name, ArrayList<Student> st) {
    this.name = name;
    this.st = st;
  }

  public Career(String name, Student st) {
    this.name = name;
    this.st = new ArrayList<Student>();
    this.st.add(st);
  }

  public Career(String name){
    this.st = new ArrayList<Student>();
    this.name = name;
  }

  public String toString() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addStudent(Student stu) {
    this.st.add(stu);
  }

  public void showStudents(){
    for (Integer i = 0; i < this.st.size(); i++) {
      System.out.println(this.st.get(i).getPer()+" - "+this.st.get(i).getSignIn());
    }
  }
}
