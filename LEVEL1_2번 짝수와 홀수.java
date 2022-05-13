
class evenodd {
    String getevenodd(int a){

        if(a % 2 == 0) {
            return "even";
        }else {
            return "odd";
        }
    }
}

public class Main {
    public static void main(String[] args) {


        evenodd c = new evenodd();
        System.out.println(c.getevenodd(6));
    }
}
