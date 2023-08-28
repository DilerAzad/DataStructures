public class Bit{

    //Return 1 if number is odd
    public static boolean isOdd(int num){
        return (num & 1) == 1;
    }

    //Find the binary bit at index of decimal number
    public static int bitAt(int num, int index){
        return (num >> (index-1)) & 1;
    }


    //Give the single unique number in array of dublicate number
    public static int findUnique(int arr[]){
        int num = 0;
        for(int n : arr){
            num ^= n;
        }

        return num;
    }

    //Change i'th bit 0->1, 1->1
    public static int setBitAt(int num,int index){
        return num | (1<<index-1);
    }

    //Reset i"bit 0->0,1->0;
    public static int resetBit(int num, int index){
        return num & ~(1<<index-1);
    }

    //Find magic number (Amazon question)
    public static int magicNumber(int num){
        int ans = 0;
        int base = 5;
        while(num > 0){
            int last = num & 1;
            ans += last * base;
            base *= 5;
            num >>= 1;
        }

        return ans;
    }
    
    //number of bits in binary
    public static int numBitBinary(int num){
        int ans = 0;
        
        while(num > 0){
            ans++;
            num >>= 1;
        }

        return ans;
    }

    //Number of digits in any base
    public static int numBit(int num, int base){
        return (int)(Math.log(num) / Math.log(base))+1;
    }


    //Binary of decimal number
    public static void binaryNum(int num){
        int size = numBit(num,2);
        int ans[] = new int[size];
        
        for(int i = size-1; i>=0; i--){
            ans[i] = num&1;
            num >>= 1;
        }

        for(int i=0;i<size;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
    //If the number is power of 2, returns true
    //note fix for n=0
    public static boolean powOfTwo(int num){
        return (num & (num-1)) == 0;
    }

    //Find x^y
    public static int power(int base, int pow){
        int ans = 1;

        while(pow > 0){
            ans *= (pow & 1) != 0 ? base : 1;
            base *= base;
            pow >>= 1;
        }
        return ans;
    }

    //Number of set bits
    public static int setBitsNum(int num){
        int ans = 0;
        while(num > 0){
            ans += (num & 1);
            num >>= 1;
        }

        return ans;
    }

    //XOR till that number
    public static int xorTill(int num){
        if(num % 4 == 0){
            return num;
        }

        else if(num % 4 == 1){
            return 1;
        }

        else if(num % 4 == 2){
            return num+1;
        }

        else{
            return 0;
        }

    }

    //XOR in range
    public static int XORrange(int from, int till){
        return xorTill(till)^xorTill(from-1);
    }
    public static void main(String[] args){
        System.out.println(XORrange(3,10));
    }
    

    //Note : Integer.toBinaryString(x) returns the string of value x                 
}