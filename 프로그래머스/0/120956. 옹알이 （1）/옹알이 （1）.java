class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strArr = {"aya", "ye", "woo", "ma"};
        for (String str : babbling) {
            for (String i : strArr) {
                str = str.replace(i, " ");
                if(str.trim().length() == 0) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}