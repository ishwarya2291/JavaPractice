package october;

public class ReverseArray {

    public String reverseArrayWithoutSplChars(String input){
        char[] inputCharArray = input.toCharArray();
        int left=0, right = input.length()-1;
        
        while(left<right){
            if(!isAlphabet(inputCharArray[left])){
                left++;
            }
            if(!isAlphabet(inputCharArray[right])){
                right--;
            }
            else{
                char temp = inputCharArray[left];
                inputCharArray[left] = inputCharArray[right];
                inputCharArray[right] = temp;
                left++;
                right--;
            }
        }
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(inputCharArray);
        return reversedString.toString();
    }

    public boolean isAlphabet(char character) {
         return ( (character >= 'A' &&  character <= 'Z') || (character >= 'a' &&  character <= 'z') );
    }
    
}
