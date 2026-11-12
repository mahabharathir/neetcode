class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleet = 0;

        double[][] cars = new double[position.length][2];
        for(int i=0; i<position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i])/speed[i];
        }

        Arrays.sort(cars, (a,b)-> Double.compare(b[0], a[0]));

        double prevTime =0;
        for(int i=0; i<cars.length; i++){
            double currTime = cars[i][1];
            if(currTime > prevTime){
                fleet++;
                prevTime = currTime;
            }
        }
        return fleet;
    }
}
