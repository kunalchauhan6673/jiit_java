public class Q1_ppy {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0) { 
                break;
            }
            if (i % 5 == 0) { 
                continue;
            }
             System.out.println(i+" ");
        }
    }
}
