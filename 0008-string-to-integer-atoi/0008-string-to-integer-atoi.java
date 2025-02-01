class Solution {
    public int myAtoi(String s) {
        int iterator = 0;
        while(iterator < s.length() && s.charAt(iterator) == ' ') iterator++;

        int sign = 1;
        if(iterator < s.length()  && s.charAt(iterator) == '-'){
            sign = -1;
            iterator++;
        } else if(iterator < s.length() && s.charAt(iterator) == '+'){
            sign = 1;
            iterator++;
        }

        while(iterator < s.length() && s.charAt(iterator) == '0') iterator++;

        long ans = 0;

        while(iterator < s.length()){
            char ch = s.charAt(iterator);
            if(ch >= '0' && ch <= '9'){
                int digit = ch-'0';
                ans = ans * 10 + digit;
                if(ans > Integer.MAX_VALUE && sign == 1){
                    return Integer.MAX_VALUE;
                }else if(ans > Integer.MAX_VALUE && sign == -1) return Integer.MIN_VALUE;
            }else{
                break;
            }
            iterator++;
        }

        return (int)(ans*sign);
    }
}