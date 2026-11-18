class Pairs{
    int[] point;
    int dist; 

    Pairs(int[] point, int dist){
        this.point = point;
        this.dist =dist;
    }
}

class DistanceComparator implements Comparator<Pairs>{
    public int compare(Pairs a, Pairs b){
        if(a.dist > b.dist){
            return 1;
        }else if(a.dist < b.dist){
            return -1;
        }else{
            return 0;
        }
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pairs> minHeap = new PriorityQueue<Pairs>(new DistanceComparator());
        for(int[] point : points){
            int dist = point[0] * point[0] + point[1] * point[1];
            minHeap.add(new Pairs(point, dist));
        }
        int[][] result = new int[k][2];
        for(int i=0; i<k; i++){
            result[i][0] = minHeap.peek().point[0];
            result[i][1] = minHeap.peek().point[1];
            minHeap.poll();
        }

        return result;
    }
}
