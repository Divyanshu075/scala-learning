package a2;

public class JavaMain {

    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("sass", 34, "asas", "Sas");

        System.out.println(studentClass.rollNumber());
        System.out.println(studentClass.mobile());

        int a = (int) 34.33;

        studentClass.mobile_$eq("Dsadsad");

        System.out.println(studentClass.mobile());


    }
}
