class Solution {
    public int countBinarySubstrings(String s) {
        // 00110011

        ArrayList<Integer> list = new ArrayList<>();

        int total = 1;
        for(int i = 1;i<s.length() ; i++){
            if(s.charAt(i)==s.charAt(i-1)) total++;
            else{
                list.add(total);
                total= 1;
            }
        }
        list.add(total);
        int count = 0 ;
        for(int i = 1;i<list.size(); i++){
            count = count + Math.min(list.get(i),list.get(i-1));
        }
        

    

        //System.out.println(list);
        return count;
    }
}