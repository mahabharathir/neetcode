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
            return -1;
        }else if(a.dist < b.dist){
            return 1;
        }else{
            return 0;
        }
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pairs> maxHeap = new PriorityQueue<Pairs>(new DistanceComparator());
        for(int[] point : points){
            int dist = point[0] * point[0] + point[1] * point[1];
            maxHeap.add(new Pairs(point, dist));
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int[][] result = new int[k][2];
        for(int i=0; i<k; i++){
            result[i][0] = maxHeap.peek().point[0];
            result[i][1] = maxHeap.peek().point[1];
            maxHeap.poll();
        }

        return result;
    }
}
