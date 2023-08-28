class Solution {

    public void swapArr(int arr[]){
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    public void negetionArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]^1;
        }
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            this.swapArr(image[i]);
            this.negetionArr(image[i]);
        }
        return image;
    }
}

public class FlippingAnImage{
    
    public static void main(String[] args) {
        int arr[][]= {{1,1,0},{1,0,1},{0,0,0}};
        Solution s = new Solution();
        int arr2[][] = s.flipAndInvertImage(arr);

        for(int i = 0; i<arr2.length; i++){
            for(int j =0; j<arr2[0].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}