package a1;

public class JavaTailRec {

    static int rec1(int n) throws Exception {
        if (n == 1) {
            throw new Exception("sas");
        } else return rec1(n - 1);
    }

    public static void main(String[] args) {

        try {
            rec1(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
