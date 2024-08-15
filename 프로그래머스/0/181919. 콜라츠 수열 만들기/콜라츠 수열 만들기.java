class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int num = 0;
        while(n != 1){
            answer[num++] = n;
            n = (n % 2 == 0)? n / 2 : 3 * n + 1;
        }
        answer[num++] = 1;
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = answer[i];
        }
        return arr;
    }
}