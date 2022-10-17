package a4;

import a3.Calculator;
import a3.CalculatorImpl;
import a3.CalculatorImpl$;
import a3.JavaSingelton;

public class JavaMain {

    public JavaMain() {
        System.out.println("Initaiazation");
    }

    public static void main(String[] args) {

        Student student = new Student("asa", "ass", 22);

        System.out.println(student.fName());

        Student.printFullName(student);

        System.out.println(student);

        new JavaMain();


        Student$ sty = Student$.MODULE$;

        Calculator calculator = CalculatorImpl$.MODULE$;

        sty.printFullName(student);

        calculator.add(1, 2);
    }
}
