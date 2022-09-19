# DAA_Assignment
**Problem Statement:** 
Implement the solution for Maximum Sum Array by populating the array of size 14 with non-zero [positive/negative] random numbers.
Comment on sum, if first element is positive/negative and last element is positive/negative.

**Approach:**
Following steps are performed in order to find Maximum Crossing Sum Subarray:
Step 1: Find out the mid location of the array[mid=(low+high)/2]
Step 2: Calculate the sum of the left half array and find out the value of maximum sum and left most point of the array.
Step 3: Calculate the sum of the right half array and find out the value of maximum sum and right most point of the array.

**Solved Example:**
a= {4, 25, -8, -2, -3, 1, 24, -7, 9, -10, -5, 23, -6, -4}
mid=(low+high)/2=(1+14)/2=15/2=7.5=7
From the above example we can conclude that Maximum sum from left side is 41 and from right side is 10 and hence the crossing subarray is starting from the index 1 and ending at index 12
Crossing subarray of maximum sum is:
b= {4, 25, -8, -2, -3, 1, 24, -7, 9, -10, -5, 23}
Maximum sum is: 41+10=51


Test Case 1: first element positive & last element negative
a= {4, 25, -8, -2, -3, 1, 24, -7, 9, -10, -5, 23, -6, -4}
Comment on sum: Maximum sum obtained is 51

Test Case 2: first element positive & last also positive
a= {4, 25, -8, -2, -3, 1, 24, -7, 9, -10, -5, 23, -6, 4}
Comment on sum: Maximum sum obtained is 51 again which is same as the previously obtained sum

Test Case 3: first element negative & last element positive
a= {-4, 25, -8, -2, -3, 1, 24, -7, 9, -10, -5, 23, -6, 4}
Comment on sum: Maximum sum obtained in this case is 47 which is less than both the previously obtained sum by 4 

Test Case 4: first element negative & last element negative
a= {-4, 25, -8, -2, -3, 1, 24, -7, 9, -10, -5, 23, -6, -4}
Comment on sum: Maximum sum obtained in this case is again 47 which is same as in test case no 3

**Observations:** Sum obtained is same as that in case 1 and 2(51) which is greater than the sum obtained in test case 3 and 4(47). The difference obtained is differing by 4 which is the magnitude of first and last elements(4, -4) in an array. 


**Code:**
```
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
```

**OutPut:**
```
Test case no:1 -> First Element as Positive & Last element as Negative
Maximum sum of left subarray: 41
Maximum sum of right subarray: 10
Maximum Sum is: 51
Starting index of Maximum Sum Subarray is: 1
End Index of Maximum Sum Subarray is: 12
..............................................................        
    
Test case no:2 -> First Element as Positive & Last element as Positive
Maximum sum of left subarray: 41
Maximum sum of right subarray: 10
Maximum Sum is: 51
Starting index of Maximum Sum Subarray is: 1
End Index of Maximum Sum Subarray is: 12
..............................................................        
    
Test case no:3 -> First Element as Negative & Last element as Positive
Maximum sum of left subarray: 37
Maximum sum of right subarray: 10
Maximum Sum is: 47
Starting index of Maximum Sum Subarray is: 2
End Index of Maximum Sum Subarray is: 12
..............................................................        
    
Test case no:4 -> First Element as Negative & Last element as Negative
Maximum sum of left subarray: 37
Maximum sum of right subarray: 10
Maximum Sum is: 47
Starting index of Maximum Sum Subarray is: 2
End Index of Maximum Sum Subarray is: 12
..............................................................
```
