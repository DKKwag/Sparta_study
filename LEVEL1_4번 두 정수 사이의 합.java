class twoint {
    long gettwoint(long a, long b) {
        long sum = 0;
        if (a > b) {
            for (long i = b; i <= a; i++) {
                sum += i;
            }
        }
        else{
            for (long i = a; i <= b; i++) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {


        twoint b = new twoint();
        System.out.println(b.gettwoint(1, 10));
    }
}
