class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int add=0;
        while (n > 0) {   //LEET CODE
            int rem = n % 10;
            product = product * rem;
            add=add+rem;
            n=n/10;
        }
        int subtractProductAndSum=product-add;
        return subtractProductAndSum;
    }
}
