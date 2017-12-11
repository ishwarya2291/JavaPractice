import october.ReverseArray;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;

public class ReverseArrayTest {
    
    ReverseArray reverseArray;
    
    public ReverseArrayTest() {
    }
    
    @Before
    public void setUp(){
        reverseArray = new ReverseArray();
    }
    
    @Test
    public void reverseArrayWithoutSplCharsTest(){
        //Arrange
        String expectedInput = "Ab,c,de!$";
        String expectedOutput = "ed,c,bA!$";
        
        //Act
        String actualOutput = reverseArray.reverseArrayWithoutSplChars(expectedInput);
        
        //Assert
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }
    
    @Test
    public void isAlphabetTrueTest(){
        //Arrange
        char expectedCharacter = 'a';
        boolean expectedResult = true;
        
        //Act
        boolean actualResult = reverseArray.isAlphabet(expectedCharacter);        

        //Assert
        assertThat(actualResult).isEqualTo(expectedResult);
    }
    
    @Test
    public void isAlphabetFalseTest(){
        //Arrange
        char expectedCharacter = ',';
        boolean expectedResult = false;
        
        //Act
        boolean actualResult = reverseArray.isAlphabet(expectedCharacter);        

        //Assert
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
