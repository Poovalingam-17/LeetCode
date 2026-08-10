class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int num = Math.round(purchaseAmount/10.0f)*10;
        return 100 - num;
    }
}