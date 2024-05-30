class Solution {

    public int countTriplets(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; ++i) {
            int xorA = 0;
            for (int j = i + 1; j < arr.length; ++j) {
                xorA ^= arr[j - 1];
                int xorB = 0;
                for (int k = j; k < arr.length; ++k) {
                    xorB ^= arr[k];
                    if (xorA == xorB) {
                        ++count;
                    }
                }
            }
        }
        return count;
    }
}