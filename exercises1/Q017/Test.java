package Others.OCA.exercises1.Q017;

public class Test {



    int x, y;

    public Test(int x, int y) {
        initialize(x, y);
    }

    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 3, y =5;
        Test obj = new Test(x, y);

        System.out.println(x + " " + y); // prints the local variables      //3 5
        System.out.println(obj.x + " " + obj.y); // prints the local variables  //9 25
    }


}
//What is the result?
//A.	Compilation fails.
//B.	3 5
//C.	0 0
//D.	9 25