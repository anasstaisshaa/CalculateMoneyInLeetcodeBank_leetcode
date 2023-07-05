class Solution {
    public int totalMoney(int n) {
        int startMoney = 1;
        int sum = 0;
        int currentMoney = startMoney;

        for (int i = 1; i <= n; i++) {
            sum += currentMoney;
            if (i % 7 == 0) {
                startMoney++;
                currentMoney = startMoney;
            } else {
                currentMoney++;
            }
        }

        return sum;
    }
}

