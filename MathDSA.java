public class MathDSA {
    //Prime numbers are numbers those are divisible by 1 and it self
    //Composite number are those which have more than two factors (number which are not prime)
    //Cheack condition till Square mid of number
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i=2; i * i <= num; i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }

    static boolean isPrimeOtimized(int num){
        if(num <= 1)
            return false;

        else if(num == 2 || num == 3 || num == 5)
            return true;

        else if(num%2 != 0 && num%3 != 0 && num%5 !=0)
            return true;

        else
            return false;
    }

    //Finding Square mid of a number
    static boolean isPerfectSqrt(int num){
        for(int i=2; i * i <= num; i++){
            if(i*i == num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSqrt(26));
    }
}
