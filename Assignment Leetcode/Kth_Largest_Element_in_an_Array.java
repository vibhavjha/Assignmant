import java.util.PriorityQueue;

public class  Kth_Largest_Element_in_an_Array{
    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {

            pq.add(nums[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println("Kth Largest Element: " + pq.peek());
    }
}