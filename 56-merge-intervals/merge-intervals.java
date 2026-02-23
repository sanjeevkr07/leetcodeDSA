class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        int m = intervals.length;
        int n = intervals[0].length;

        List<int[]> result = new ArrayList<>();
        
        int[] interval = intervals[0];
        int start = intervals[0][0];
        int end = intervals[0][1];
        int i = 1 ; 
        while(i < m){
            int[] currInterval = intervals[i];
            // System.out.println("end: "+end+" comparing: "+ currInterval[0]+ " "+currInterval[1]);
            if(currInterval[0] <= interval[1] || end >= currInterval[0]){
                end = Math.max(end,currInterval[1]);
            }
            else{
               
                result.add(new int[]{start,end});
                interval = currInterval;
                start = interval[0];
                end = interval[1];
                // System.out.println(result);
            }
            i++;
        }
        result.add(new int[]{start,end});

        return result.toArray(new int[result.size()][]);      
    }
}