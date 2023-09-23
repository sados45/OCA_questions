package Others.OCA.exercises1.Q116;

public class C extends A{

    public void test(){
        System.out.println("C");
    }


    public static void main(String[] args) {

        A b1 = new A();
        A b2 = new C();

        b1 = (A) b2;        //line n1
        A b3 = (B) b2;      //line n2    ClassCastException
        b1.test();
        b3.test();
    }
}

/*
What is the result?
A. AB
B. AC
C. CC
D. A ClassCastException is thrown only at line n1.
E. A ClassCastException is thrown only at line n2.
Answer: B

 */