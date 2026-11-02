
class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        int[] res = new int[k];

        // Step 1: Count frequencies
        Map<Integer, Integer> count = new HashMap<>();

        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 3: Put elements into frequency buckets
        for (int i : count.keySet()) {
            buckets[count.get(i)].add(i);
        }

        // Step 4: Collect top k elements
        int index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {

            for (int num : buckets[i]) {

                res[index] = num;
                index++;

                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}