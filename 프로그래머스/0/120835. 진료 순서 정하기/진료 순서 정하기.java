class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++){
            for(int k = 0; k < emergency.length; k++){
                if(emergency[i] < emergency[k]){
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }
}