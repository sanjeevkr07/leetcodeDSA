class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWordCount=Integer.MIN_VALUE;

        for(String s:sentences){
            //get work count for each

            int wordCount=s.split(" ").length;
            maxWordCount=wordCount>maxWordCount?wordCount:maxWordCount;
        }
        return maxWordCount;
    }
}