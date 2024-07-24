class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            int min = Integer.MAX_VALUE;
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                if(arr[i] > queries[j][2] && arr[i] < min){
                    min = arr[i];
                }
            }
            answer[j] = (min != Integer.MAX_VALUE) ? min : -1;
        }
        return answer;
    }
}