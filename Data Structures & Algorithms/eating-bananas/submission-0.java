class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        Arrays.sort(piles);

        int left = 1;
        int right = piles[n - 1];

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (eatingSpeed(piles, mid) > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private int eatingSpeed(int[] piles, int k) {
        int hours = 0;
        for (int pile : piles) {
            int hoursForThisPile = pile / k;
            if (pile % k != 0) {
                hoursForThisPile += 1;
            }
            hours += hoursForThisPile;
        }
        return hours;
    }
}
