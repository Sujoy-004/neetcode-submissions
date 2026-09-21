class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> uniqueElements = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(uniqueElements, (a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueElements.get(i);
        }
        
        return result;
    }
}
