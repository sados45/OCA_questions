package Others.OCA.exercises1.Q123;

public class App {

    String myStr = "9009";

    public void doStuff(String str) {

        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);

        }catch (NumberFormatException ne) {
            System.err.println("Error");

        }
        System.out.println("myStr: " + myStr + ", myNum: "+myNum);

    }
    public static void main(String[] args) {
        App obj = new App();
        obj.doStuff("7007");

        //Answer C myStr: 9009, myNum: 7007
    }
}
