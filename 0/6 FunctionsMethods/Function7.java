//7 -->  Funtion Overloading --> Multiple functions with the same name but different parameters


//Funtion overloading using parameters

public class Function7 {

    //function to calculate 2 numbers
    public static int Sum (int a, int b){
        int sum = a + b;
        return sum;
    }

    //function to calculate 3 numbers
    public static int Sum (int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Sum(5,2));
        System.out.println(Sum(5,2,3));
    }
    
}
