class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

       do{
            slow = findNextNumber(slow);
            fast = findNextNumber(findNextNumber(fast));


        }while( slow != fast);

        return slow == 1;
    }

    private static int findNextNumber(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10 ;
            n = n / 10;
            sum += rem*rem;
        }

        return sum;
    }
}