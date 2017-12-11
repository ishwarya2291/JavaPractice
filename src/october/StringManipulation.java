package october;

public class StringManipulation {
    
    public static void main(String args[]){
        StringManipulation stringManipulation = new StringManipulation();
        System.out.println(stringManipulation.reverseStringByWord("I am going to reverse this string"));
    }
    
    String reverseStringByWord(String inputString){
        String[] words = inputString.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for(int i=words.length-1 ; i>=0 ; i--){
            reversedString.append(words[i]);
            reversedString.append(" ");
        } 
        return reversedString.toString();
    }
    
}
