public class Student {

private String Name;
private int Age;
private double GPA;

public Student(String Name, int Age, double GPA){
    this.Name=Name;
    this.Age=Age;
    this.GPA=GPA;
}
public String getName(){
  return Name;
}
public void setName(String Name ){
    this.Name=Name;
}
public int getAge(){
    return Age;
}
public void setAge(int Age){
    this.Age=Age;
}
public double getGPA(){
    return GPA;
}
public void setGPA(double GPA){
    this.GPA=GPA;
}
public void DisplayInfo(){
    System.out.println("Name: " + Name);
    System.out.println("Age: " + Age);
    System.out.println("GPA: "+ GPA);
}
public void Study(){
    System.out.println(Name + " is studying");
}
}

