package Problem_1;

public class Problem_1_Java{

    public static int Problem_1() {
        int total = 0; 
        for (int i=1; i<1000; ++i) { 
            if (i%3 == 0 || i%5 == 0) { 
                total += i; 
            } 
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(Problem_1());
    }
}

