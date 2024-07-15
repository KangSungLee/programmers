class Solution {
    public int[] solution(int money) {
        int i = 0;
        while(money >= 5500) {
            i++;
            money -= 5500;
        }
        int[] answer = new int[]{i, money};
        return answer;
    }
}