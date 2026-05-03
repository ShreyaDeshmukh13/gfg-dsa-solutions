class Solution {
    public int findFloor(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= x) {
                ans = mid;        // store possible floor
                start = mid + 1;  // move right to find larger valid
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}