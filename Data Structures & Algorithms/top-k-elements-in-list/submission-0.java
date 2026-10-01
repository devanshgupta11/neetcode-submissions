class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer>list = new ArrayList<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.keySet()){
            list.add(num);
        }

        list.sort((a , b ) -> map.get(b) - map.get(a));

        int [] res = new int [k];

        for(int i = 0 ; i<k ; i++){
            res[i] = list.get(i); 
        }

        return res; 
    }
}
