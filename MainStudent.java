public class MainStudent {
    public static void main(String[] args) {
        Student Student1= new Student("Malek",18,3.1);
        Student Student2= new Student("Farida",19,3.6);

        Student1.DisplayInfo();
        Student1.Study();

        System.out.println("-----------------");

        Student2.DisplayInfo();
        Student2.Study();




    }
}
