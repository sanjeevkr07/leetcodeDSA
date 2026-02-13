class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0 ;
        int n = s.length();
        int maxLen = 0;

        for(int right = 0 ; right < n ; right++){
            int indx = s.charAt(right) - 'A';
            freq[indx]++;
            int maxi = mostFreqChar(freq);

            while((right-left+1) - maxi > k){

                int leftCharInd = s.charAt(left)-'A';
                freq[leftCharInd]--;
                left++;
            }

            maxLen = Math.max(maxLen,right-left+1);
        }

        // System.out.println(mostFreqChar(freq));

        return maxLen;
    }

    private static int mostFreqChar(int[] freq){
        int maxi = 0;
        for( int i = 0 ; i< freq.length ; i++){
            if(freq[i]>maxi){
                maxi = freq[i];
            }
        }

        return maxi;
    }
}






