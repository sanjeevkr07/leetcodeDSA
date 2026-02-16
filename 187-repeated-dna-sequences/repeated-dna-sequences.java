class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        List<String> result = new ArrayList<>();

        if(s.length()<10) return result;
        HashMap<String,Integer> map = new HashMap<>();

        //create window
        int left = 0;
        int right = 9;
        map.put(s.substring(left,right+1),1);
    
        left++;
        right++;
        // slide the window

        while(right < s.length()){
            // System.out.println(map);
            String sub = s.substring(left, right+1);
            if(map.containsKey(sub)){
                map.put(sub,2);
            }
            else{
                map.put(sub,1);
            }
            right++;
            left++;
        }

        // System.out.println(map);

        for(String str: map.keySet()){
            if(map.get(str)>1) result.add(str);
        }
        
        return result;
    }
}