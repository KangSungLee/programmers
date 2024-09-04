class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int num : numbers){
            double doubleInt = num;
            answer += doubleInt;
        }
        return answer / numbers.length;
    }
}