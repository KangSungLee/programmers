class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String menu:order){
            answer += (menu.indexOf("cafelatte") > -1)?5000:4500;
        }
        return answer;
    }
}