public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {23,32,1,11,99,88};
        
        int max = arr[0];
        int secondLarge = Integer.MIN_VALUE;  // Initialize to smallest possible value
        
        // First find max
        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
           
            	secondLarge = max;  // Store old max as second largest
                max = arr[i];      // Update max
            }*? else if (arr[i] > secondLarge && arr[i] < max) {
                // Update second largest if current element is between max and secondLarge
                secondLarge = arr[i];
            }
        }
        
        System.out.println("Maximum: " + max);
        System.out.println("Second largest: " + secondLarge);
    }
}