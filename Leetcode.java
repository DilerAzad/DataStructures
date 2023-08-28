//Number of Steps to Reduce a Number to Zero
class Solution{
    public int numberOfSteps(int num) {
        return helpNOS(num, 0);
    }

    public int helpNOS(int num, int count){
        if(num == 0){
            return count;
        }

        return helpNOS(isEven(num) ? num/2 : num-1, ++count);
    }

    public boolean isEven(int num){
        return num%2 == 0;
    }
}

public class Leetcode{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numberOfSteps(14));
    }
}