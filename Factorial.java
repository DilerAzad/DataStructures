public class Factorial {
    //Simple code with loop
    static void factorialSimple(int num){
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                System.out.print(i+" ");
            }
        }
    }

    //Finding factorial in optimized way
    //find factorial till sqrt(num) and divide it by number it self
    static void factorial(int num){
        for(int i=1; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                if(i == num/i){
                    System.out.print(i +" ");
                }else{
                System.out.print(i +" "+ num/i + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        factorial(36);
    }
}
