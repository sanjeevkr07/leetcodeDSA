class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder str = new StringBuilder(s);

        int i = 0;

        while(i<str.length()-1){
    
            //System.out.println("i at (START):"+i);
            if(str.charAt(i) == str.charAt(i+1)){
                //System.out.println("char matched: "+str.charAt(i)+ " "+str.charAt(i+1));
                str.deleteCharAt(i+1);
                str.deleteCharAt(i);
                
                //System.out.println("new String :"+str);
                if(i!=0) i--;
            }
            else {
               // System.out.println("No Match found increment");
                i++;
            }
           // System.out.println("i at (END):"+i);

        }
        //System.out.println(str);
        return str.toString();
    }
}