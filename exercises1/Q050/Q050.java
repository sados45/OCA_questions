package Others.OCA.exercises1.Q050;

final class Q050 {

   final static void main(String[] args) {


        //50. Which two code fragments cause compilation errors? (Choose two.)

        //A.
        //double y1 = 203.22;  float fit = y1;   //To fix it float fit = (float) y1;

        //B.
        float fit1 = (float) 1_11.00;

        //C.
        //Float fit2 = 100.00;        //To fix it --> Float fit = 100.00F;

        //D.
        int y2 = 100;
        float fit3 = (float) y2;

        //E.
        float fit4 = 100.00F;

        //Answer: A C


        System.out.println("aaa");

    }
}
