class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        int m = firstList.length;
        int n = secondList.length;

        int i = 0 ;
        int j = 0 ;

        List<int[]> result = new ArrayList<>();

        while(i < m && j < n){
            int start = Math.max(firstList[i][0],secondList[j][0]);
            int end = Math.min(firstList[i][1],secondList[j][1]);

            if (end - start >= 0){
                result.add(new int[]{start,end});
            } 

            if(firstList[i][1] > secondList[j][1]) j++;
            else i++;

        }
        
        return result.toArray(new int[result.size()][]);
    }
}


//                         i
// [[0,2],[5,10],[13,23],[24,25]]
//                         j
// [[1,5],[8,12],[15,24],[25,26]]

// [[1,2],[5,5],[5,8],[15,23],[24,24],[25,25]]

// ___________________________________________
//             i
// [[1,5],[10,14],[16,18]]
//                 j
// [[2,6],[8,10],[11,20]]

// [[2,5],[10,10],[11,14],[16,18]]

// ____________________________________________
//         i
// [[1,2],[5,6]]
//         j
// [[3,4],[7,8]]

// _____________________________________________

//         i
// [[1,2],[5,7]]
//         j
// [[2,4],[7,10]]

// [[2,2],[7,7]]

// _____________________________________________

// i
// [[1,100]]
//         j
// [[2,5],[10,20],[30,40],[90,110]]

// [[2,5],[10,20],[30,40],[90,100]a]



