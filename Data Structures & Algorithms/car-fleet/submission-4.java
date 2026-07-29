class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n= position.length;
        double[][] time= new double[n][2];
        for(int i=0;i<n;i++){
            time[i][0]=position[i];
            time[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(time,(a,b)->Double.compare(b[0],a[0]));
        int fleet=0;
        double prevtime=-1;
        for(int i=0;i<n;i++){
            double currtime=time[i][1];
            if(currtime>prevtime){
                fleet++;
                prevtime=currtime;
            }

        }
        return fleet;
    }
}
