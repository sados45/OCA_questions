package Others.OCA.exercises1.Q047;

class C3 extends C2{


    public static void main(String[] args) {

C1 obj1 = (C1) new C2();
        System.out.println("1");
C2 obj2 = (C2) new C3();
        System.out.println("2");
C2 obj3 = (C2) new C1();            //C1 cannot be cast to class C2
        System.out.println("3");
C3 obj4 = (C3) obj2;


/*
Which line throws ClassCastException?
A. line 18
B. line 17
C. line 19   +     C1 cannot be cast to class C2
D. line 16
 */
    }
}
