package DataStructure.list.ReverseList;

public class Node {
    //������
    public int data;
    //ָ����ָ����һ���ڵ�
    public Node next;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
