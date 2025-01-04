class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
       HashMap<Integer,Integer> mp = new HashMap();

       for(int i = 0 ;i<indices.length;i++){
        if(s.startsWith(sources[i],indices[i])){
            mp.put(indices[i],i);
        }
       }
       //System.out.println(mp);
        StringBuilder sb = new StringBuilder();
       for(int i = 0;i<s.length();){
        if(mp.containsKey(i)){
            sb.append(targets[mp.get(i)]);
            i+=sources[mp.get(i)].length();
        }
        else{
            sb.append(s.charAt(i));
            i++;
        }

       }
       return sb.toString();
    }
}