public class prime {
    public static void main(String args[]) {
        for (int i = 50; i <= 100; i++) {

            if (i % 1 == 0) {
                continue; 
            }
            if (i % i == 0) {
                continue; 
            }

            if (i > 100) {
                break;
            }

            System.out.println(i);
        }
    }
}
