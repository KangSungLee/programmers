class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a == b && a == c && a == d){
            answer = 1111 * a;
        } else if(a == b && a == c) {
            answer = (10 * a + d) * (10 * a + d);
        } else if(b == c && b == d) {
            answer = (10 * b + a) * (10 * b + a);
        } else if(c == d && c == a) {
            answer = (10 * a + b) * (10 * a + b);
        } else if(a == b && a == d) {
            answer = (10 * a + c) * (10 * a + c);
        } else if(a == b) {
            answer = (c == d) ? (a + c) * ((a < c) ? c - a : a - c) : c * d;
        } else if(a == d) {
            answer = (b == c) ? (a + c) * ((a < c) ? c - a : a - c) : b * c;
        } else if(a == c) {
            answer = (b == d) ? (a + b) * ((a < b) ? b - a : a - b) : b * d;
        } else if(b == c) {
            answer = (a == d) ? (a + b) * ((a < b) ? b - a : a - b) : a * d;
        } else if(b == d) {
            answer = (a == c) ? (a + b) * ((a < b) ? b - a : a - b) : a * c;
        } else if(c == d) {
            answer = (a == b) ? (a + c) * ((a < c) ? c - a : a - c) : a * b;
        } else {
            answer = (a < b && a < c && a < d) ? a : (b < c && b < d) ? b : (c < d) ? c : d;
        }
        return answer;
    }
}