package Others.OCA.exercises1.Q022;

public class Q022 {

    public static void main(String[] args) {


        int ans ;


        try{
            int num = 10;
            int div = 0;
            ans = num/div;
        } catch(ArithmeticException ae){

            ans = 0;                                    //line n1

        } catch(Exception e){
            System.out.println("Invalid calculation");

        }



//        System.out.println("Answer =  " + ans );      //line n2


        //Error message--> java: variable ans might not have been initialized
    }
}
