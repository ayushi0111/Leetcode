class Solution {
    public int searchInsert(int[] nums, int target) {
     int n= nums.length;
    // Lower and upper bounds
    int start = 0;
    int end = n - 1;
 
    // Traverse the search space
    while (start <= end)
    {
        int mid = (start + end) / 2;
 
        // If target is found
        if (nums[mid] == target)
            return mid;
 
        else if (nums[mid] < target)
            start = mid + 1;
 
        else
            end = mid - 1;
    }
 
    // Return insert position
    return end + 1;
}
}