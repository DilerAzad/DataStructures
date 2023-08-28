public class Recursion {
    //Printing n number
    static void Nto1(int num){
        if(num <= 0){
            return;
        }
        
        System.out.println(num);
        Nto1(num-1);
    }

    //Factorial
    static int factorial(int num){
        if(num <= 1){
            return 1;
        }

        return num * factorial(num-1);
    }

    //Fibonacii at n pasition 
    static long fibo(long num){
        if(num <= 2){
            return num;
        }

        return fibo(num-1) * fibo(num-2);
    }

    //Sum of Digits of the number
    static int digitSum(int num){
        if(num == 0){
            return 0;
        }

        return num%10 + digitSum(num/10);
    }

    //Product of digits
    static int digitProd(int num){
        if(num%10 == num){
            return num;
        }

        return num%10 * digitProd(num/10);
    }
    
    //Reverse a number
    static int revNUM1(int num, int rnum){
        if(num == 0){
            return rnum;
        }

        return revNUM1(num/10, (rnum*10)+(num%10));
    }

    static int revNUM2(int num){
        int rnum = 0;
        return revNUM1(num , rnum);
    }

    //Palindrome is a number which have its mirror number equal to it self
    static boolean isPalindrome(int num){
        return num == revNUM2(num);
    }

    //Count number of zeros in number
    static int zeros(int num){
        return helpZeros(num, 0);
    }

    static int helpZeros(int num, int count){
        if(num/10 == 0){
            return count;
        }

        return helpZeros(num/10, num%10 == 0 ? count+1 : count);
    }
    public static void main(String[] args) {
        System.out.println(zeros(305043)); 
    }   
}
