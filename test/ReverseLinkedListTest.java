import javapractice.ILinkNode;
import javapractice.LinkNode;
import javapractice.ReverseLinkedList;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ReverseLinkedListTest {
    
    @Test
    public void iteratorMethodTest(){
        //Arrange
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkNode expectedLinkedList = new LinkNode(10);
        expectedLinkedList.next = new LinkNode(20);
        expectedLinkedList.next.next = new LinkNode(30);
        expectedLinkedList.next.next.next = new LinkNode(40);
        expectedLinkedList.next.next.next.next = new LinkNode(50);
        
        LinkNode expectedReversedLinkedList = new LinkNode(50);
        expectedReversedLinkedList.next = new LinkNode(40);
        expectedReversedLinkedList.next.next = new LinkNode(30);
        expectedReversedLinkedList.next.next.next = new LinkNode(20);
        expectedReversedLinkedList.next.next.next.next = new LinkNode(10);
        
        //Act
        LinkNode actualReversedLinkedList = reverseLinkedList.iteratorMethod(expectedLinkedList);
        
        //Assert
        assertThat(actualReversedLinkedList.value).isEqualTo(expectedReversedLinkedList.value);
        assertThat(actualReversedLinkedList.next.value).isEqualTo(expectedReversedLinkedList.next.value);
        assertThat(actualReversedLinkedList.next.next.value).isEqualTo(expectedReversedLinkedList.next.next.value);
        assertThat(actualReversedLinkedList.next.next.next.value).isEqualTo(expectedReversedLinkedList.next.next.next.value);
        assertThat(actualReversedLinkedList.next.next.next.next.value).isEqualTo(expectedReversedLinkedList.next.next.next.next.value);
    } 
    
    @Test
    public void stackImplementationTest(){
        //Arrange
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkNode expectedLinkedList = new LinkNode(10);
        expectedLinkedList.next = new LinkNode(20);
        expectedLinkedList.next.next = new LinkNode(30);
        expectedLinkedList.next.next.next = new LinkNode(40);
        expectedLinkedList.next.next.next.next = new LinkNode(50);
        
        LinkNode expectedReversedLinkedList = new LinkNode(50);
        expectedReversedLinkedList.next = new LinkNode(40);
        expectedReversedLinkedList.next.next = new LinkNode(30);
        expectedReversedLinkedList.next.next.next = new LinkNode(20);
        expectedReversedLinkedList.next.next.next.next = new LinkNode(10);
        
        //Act
        LinkNode actualReversedLinkedList = reverseLinkedList.stackImplementation(expectedLinkedList);
        
        //Assert
        assertThat(actualReversedLinkedList.value).isEqualTo(expectedReversedLinkedList.value);
        assertThat(actualReversedLinkedList.next.value).isEqualTo(expectedReversedLinkedList.next.value);
        assertThat(actualReversedLinkedList.next.next.value).isEqualTo(expectedReversedLinkedList.next.next.value);
        assertThat(actualReversedLinkedList.next.next.next.value).isEqualTo(expectedReversedLinkedList.next.next.next.value);
        assertThat(actualReversedLinkedList.next.next.next.next.value).isEqualTo(expectedReversedLinkedList.next.next.next.next.value);
    } 
}
