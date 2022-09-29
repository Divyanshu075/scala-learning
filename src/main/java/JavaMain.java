import scala.Tuple2;

public class JavaMain {

    public static void main(String[] args) {

        StudentScala studentScala = new StudentScala("asas", 32323);
        System.out.println(studentScala.toString());

        System.out.println(StudentScala.defaultName());

        studentScala.$plus(new StudentScala("asas", 323));

        Tuple2<Integer, String> tuple2 = new Tuple2<>(1, "222");

        System.out.println(tuple2._1);
        System.out.println(tuple2._2);
    }
}
