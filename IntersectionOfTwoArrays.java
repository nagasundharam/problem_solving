public class IntersectionOfTwoArrays {


class Solution {
    public int[] findArray(int[] nums, Map<Integer, Integer> map, int[] arr) {
        // Build frequency map from nums
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : arr) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1); // Decrement count
            }
        }

        // Convert list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        // Always build map from smaller array to save space
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        return findArray(nums1, map, nums2);
    }
}

    
}
