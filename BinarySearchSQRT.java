public class BinarySearchSQRT{
    //Find the perfect Square root
    static double sqrt(int num){
        int st = 0;
        int ed = num;
        int root = ed + (st - ed)/2;

        while(st<=ed){
            
            if(root * root == num){
                return root;
            }

            else if(root * root < num){
                st = root + 1;
            }else {
                ed = root - 1;
            }
            root = ed + (st - ed)/2;
        }

        double rt = root;
        double base = 0.1;
        for(int i=0;i<10;i++){
            
            while(rt * rt <= num){
                rt += base;
            }   
            rt-=base;
            base /= 10; 
        }
        return rt;
    }

    //Square root using Newtons formula
    static double newtonSQRT(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n /x)) ;
            if (Math.abs (root - x) < 0.01) {
                break;
            }
            x = root;
            }
            return root;
    }
        

    public static void main(String[] args) {
        System.out.printf("%.10f",newtonSQRT(79));
    }
}