package Others.OCA.exercises1.Q008;

public class Q008 {

    public static void main(String[] args) {


        //Question-Given the code fragment what is the result?
        String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " " );
                if (arr[i][j].equals("B")) {
                    continue;
                }
            }
            continue;
        }


//
//        //Question-Given the code fragment what is the result?
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+ " " );
//                continue;
//            }
//            continue;
//        }
//
//
//
//        //Question-Given the code fragment what is the result?
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+ " " );
//                continue;
//            }
//        }
//


    }
}
