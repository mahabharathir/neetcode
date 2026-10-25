class Points{
    int x;
    int y;
    double distance;

    Points(double distance,int x, int y){
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

class CloseComparator implements Comparator<Points>{
    public int compare(Points a, Points b){
        if(a.distance > b.distance){
            return 1;
        }else if(a.distance < b.distance){
            return -1;
        }
        return 0;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Points> pq = new PriorityQueue<Points>(new CloseComparator());

        for(int[] point : points){
            double distance = Math.sqrt((-point[0] * -point[0])+ (-point[1] * -point[1]));
            pq.add(new Points(distance, point[0], point[1]));
        }

        int[][] result = new int[k][2];
        int index =0;
        while(k>0){
            Points point = pq.poll();
            result[index][0]=point.x;
            result[index][1]=point.y;
            k--;
            index++;
        }
        return result;
    }
}
