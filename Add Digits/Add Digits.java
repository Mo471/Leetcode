class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }
}


/*
class Solution {
    public int addDigits(int num) {
        int result = 0;
        
        while (true) {
            result += num % 10;
            if (num / 10 > 0) {
                num /= 10;
            } else if (result / 10 > 0) {
                num = result;
                result = 0;
            } else break;    
        }        
        return result;
    }
}



*/