//Class for calculating maximum sum;
class MaximumSumArrayImplementation {
    // Constructor;
    MaximumSumArrayImplementation() {

    }

    // Assigning negative infinity to left sum;
    int leftSum = (int) Double.NEGATIVE_INFINITY;
    // Maximum sum of left side;
    int lsum = 0;
    // Index variable of left side;
    int maxleft = -1;
    // Assigning negative infinity to rigt sum;
    int rightSum = (int) Double.NEGATIVE_INFINITY;
    // Maximum sum of right side;
    int rsum = 0;
    // Index variable of right side;
    int maxRight = -1;

    // Function to find maximum sum for crossing sub array
    public void maxCrossSubArray(int arr[], int low, int high) {
        // Calculating mid value for dividing array into two parts;
        int mid = (int) (low + high) / 2;

        // Left subarray;
        for (int i = mid; i >= low; i--) {
            lsum = lsum + arr[i];
            if (lsum > leftSum) {
                leftSum = lsum;
                maxleft = i;
            }
        }
        System.out.println("Maximum sum of left subarray: " + leftSum);

        // Right subarray;
        for (int j = mid + 1; j <= high; j++) {
            rsum = rsum + arr[j];
            if (rsum > rightSum) {
                rightSum = rsum;
                maxRight = j;
            }

        }
        System.out.println("Maximum sum of right subarray: " + rightSum);

        // Returning an array containing range and maximum sum of crossingSubarray;
        /*
         * int arr1[] = new int[3];
         * arr1[0] = maxleft;
         * arr1[1] = maxRight;
         * arr1[2] = leftSum + rightSum;
         * return arr1;
         */
        System.out.println("Maximum Sum is: " + (leftSum + rightSum));
        System.out.println("Starting index of Maximum Sum Subarray is: " + (maxleft + 1));
        System.out.println("End Index of Maximum Sum Subarray is: " + (maxRight + 1));

    }

}

// Main class for implementing method
public class MaximumSumArray {
    public static void main(String arg[]) {
        MaximumSumArrayImplementation m = new MaximumSumArrayImplementation();
        MaximumSumArrayImplementation m1 = new MaximumSumArrayImplementation();
        MaximumSumArrayImplementation m2 = new MaximumSumArrayImplementation();
        MaximumSumArrayImplementation m3 = new MaximumSumArrayImplementation();
        // Test case no:1 -> First Element as Positive & Last element as Negative;
        System.out.println("Test case no:1 -> First Element as Positive & Last element as Negative");
        int arr[] = { 4, 25, -8, -2, -3, 1, 24, -7, 9, -10, -5, 23, -6, -4 };
        m.maxCrossSubArray(arr, 0, arr.length - 1);
        System.out.println("..............................................................");
        System.out.println("    ");

        // Test case no:2 -> First Element as Positive & Last element as Positive;
        System.out.println("Test case no:2 -> First Element as Positive & Last element as Positive");
        int arr1[] = { 4, 25, -8, -2, -3, 1, 24, -7, 9, -10, -5, 23, -6, 4 };
        m1.maxCrossSubArray(arr1, 0, arr1.length - 1);
        System.out.println("..............................................................");
        System.out.println("    ");

        // Test case no:3 -> First Element as Negative & Last element as Positive;
        System.out.println("Test case no:3 -> First Element as Negative & Last element as Positive");
        int arr2[] = { -4, 25, -8, -2, -3, 1, 24, -7, 9, -10, -5, 23, -6, 4 };
        m2.maxCrossSubArray(arr2, 0, arr2.length - 1);
        System.out.println("..............................................................");
        System.out.println("    ");

        // Test case no:4 -> First Element as Negative & Last element as Negative;
        System.out.println("Test case no:4 -> First Element as Negative & Last element as Negative");
        int arr3[] = { -4, 25, -8, -2, -3, 1, 24, -7, 9, -10, -5, 23, -6, -4 };
        m3.maxCrossSubArray(arr3, 0, arr3.length - 1);
        System.out.println("..............................................................");
        System.out.println("    ");

    }
}