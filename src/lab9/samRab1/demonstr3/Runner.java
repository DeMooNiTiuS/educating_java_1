package lab9.samRab1.demonstr3;

public class Runner {
    public static void main(String[] args) {
        LinkList head = null;
        for (int i = 9; i >= 0; i--) {
            head = new LinkList(i*3, head);
        }

        LinkList ref = head;
        while (ref != null) {
            System.out.print(" " + ref.data);
            ref = ref.next;
        }
    }
}
