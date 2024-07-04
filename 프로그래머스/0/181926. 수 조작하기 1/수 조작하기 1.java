class Solution {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++){
            String k = control.substring(i, i + 1);
            switch(k){
                case "w":
                    n++;
                    break;
                case "s":
                    n--;
                    break;
                case "d":
                    n += 10;
                    break; 
                case "a":
                    n -= 10;
                    break;
                default:
                    break;
            }
        }
        return n;
    }
}