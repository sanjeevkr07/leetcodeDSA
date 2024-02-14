class Solution {
    public int minPartitions(String n) {
        int maxDigit=1;

        for(char c:n.toCharArray()){

            // System.out.println(c-48);
            maxDigit=maxDigit>(c-48)?maxDigit:(c-48);
        }
        return maxDigit;
    }
}