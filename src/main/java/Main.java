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

/*    public static int faculty(int number) {
        int result = 1;
        int i = 1;
        while(i <= number){
            result *= i;
            i++;
        }*/


       // for(int i = 1; i<=number; ++i){
        //   result*= i;
       // }
      //  return result;
   // }

    public static int faculty(int number){
        if (number<=1){
            return 1;
        } else {
            return faculty(number-1) *number;
        }
    }


}