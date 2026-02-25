package Queue;

import java.util.PriorityQueue;

public class Rope {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = { 4, 3, 2, 6 };
        for (int i=0; i< arr.length; i++){
            pq.add(arr[i]);
        }
        int res = 0;

        while (pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            res += first+second;
            pq.add(first+second);
        }
        System.out.println("cost : "+res);
    }
}
