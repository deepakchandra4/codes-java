public class ContainerWithMostWater11{
    static int maxArea(int[] height) {
        int n = height.length - 1;;
        int maxArea = 0; 
        int i = 0 ;
        while(i<n){
           int currArea = Math.min(height[i] , height[n]) * (n-i);
           maxArea = Math.max(maxArea , currArea);

           if(height[i] < height[n]){
               i++;
           }else{
               n--;
           }
        }
        return maxArea;
   }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println(result);
    }
}