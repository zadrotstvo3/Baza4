package Lambda;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator() {
//            @Override
//            public void calc(int a, int b) {
//                System.out.println(a+b);
//            }
//        };
        Calculator calculator = ( int a,int b) -> {
            System.out.println(a+b);
        };
        calculator.calc(5,6);
    }
}
