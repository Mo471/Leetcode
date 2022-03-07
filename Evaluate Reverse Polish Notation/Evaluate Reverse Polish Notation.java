class Solution {
    public int evalRPN(String[] array) {
        
        Stack<String> stack = new Stack<String>();
        
        for (int i = 0; i < array.length; i++) {

                if (array[i].equals("+")) {

                    int temp1 = Integer.parseInt(stack.pop());
                    int temp2 = Integer.parseInt(stack.pop());
                    int result = temp2 + temp1;
                    stack.push(Integer.toString(result));

                } else if (array[i].equals("-")) {

                    int temp1 = Integer.parseInt(stack.pop());
                    int temp2 = Integer.parseInt(stack.pop());
                    int result = temp2 - temp1;
                    stack.push(Integer.toString(result));

                } else if (array[i].equals("/")) {
                    
                    int result;
                    int temp1 = Integer.parseInt(stack.pop());
                    int temp2 = Integer.parseInt(stack.pop());
                    if ((double)temp2 / (double)temp1 < 0) result = (int)Math.ceil((double)temp2 / (double)temp1);
                    else if((double)temp2 / (double)temp1 > 0) result = (int)Math.floor((double)temp2 / (double)temp1);
                    else result = 0;
                    stack.push(Integer.toString(result));

                } else if (array[i].equals("*")) {

                    int temp1 = Integer.parseInt(stack.pop());
                    int temp2 = Integer.parseInt(stack.pop());
                    int result = temp2 * temp1;
                    stack.push(Integer.toString(result));

                }
                else stack.push(array[i]);

            }

            return Integer.parseInt(stack.pop());
        
    }
}