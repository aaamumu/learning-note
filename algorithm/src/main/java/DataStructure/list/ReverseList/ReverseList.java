package DataStructure.list.ReverseList;

/**
 * @ClassName: ��ת�����ݹ鷴ת����
 * @Description:TODO(��ת��������)
 * @author:������
 * @date:2022��8��1�� ����12:38:22
 */
public class ReverseList {

    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node next = head.next;
        Node newNode = reverseList(next);
        next.next = head;
        head = null;
        return newNode;
    }
}
