class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 && flowerbed[0]==1)
            return n==0?true:false;
        if(flowerbed.length == 1 && flowerbed[0]==0)
            return n<=1?true:false;
        int flowersCanBeAdded = 0;
        int m = flowerbed.length;
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            flowersCanBeAdded++;
        }


        for(int i=1;i<m-1;i++){
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                flowerbed[i]=1;
                flowersCanBeAdded++;
            }
        }

        if(flowerbed[m-1]==0 && flowerbed[m-2]==0){
            flowerbed[m-1]=1;
            flowersCanBeAdded++;
        }
        return n<=flowersCanBeAdded?true:false;
    }
}