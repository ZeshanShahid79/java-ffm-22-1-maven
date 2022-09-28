public class Main {
    public static int duplicate(int value){
        return value * 2;
    };

    public static int add(int value, int value2){
        return value + value2;
    }
    public static boolean biggerAs100(int value){
        return value >= 100;
    }

    public static int faculty(int number) {
        int result = 1;
        for(int i = 1; i<=number; ++i){
           result*= i;

        }
        return result;
    }


}