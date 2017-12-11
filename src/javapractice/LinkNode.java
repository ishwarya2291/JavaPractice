package javapractice;

public class LinkNode implements ILinkNode{

    public int value;
    public LinkNode next;
    
    public LinkNode(int value) {
        this.value = value;
        this.next = null;
    }
    
    @Override
    public void print(LinkNode node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    
}
