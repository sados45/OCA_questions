package Others.OCA.exercises1.Q049;

public class Q049 {

    public static void main(String[] args) {


        int n[][] = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) {

            for (int y : n[i]) {
                System.out.print(y);
            }
        }

    }
}
