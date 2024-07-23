package mid1.collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");


        System.out.println("first = " + first);
        // first = Node{item=A, next=Node{item=B, next=Node{item=C, next=null}}}

        // 모든 노드 탐색하기
        printAll(first);

        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 특정 index의 노드 조회하기
        int index = 2;
        Node node = getNode(first, index);
        System.out.println("node = " + node.item);

        // 데이터 추가하기
        add(first, "D");

        System.out.println("add = " + first);

    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            System.out.println(x.item);
            x = x.next;
        }
        return x; // x.next = null 이다.
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String param) {

        // 마지막 노드 찾기
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param); // 메모리를 new로 만든 메모리만큼만 사용한다.
    }

    /**
     * 각각의 노드를 연결(링크)해서 사용하는 자료 구조로 리스트를 만들 수 있는데 이것을 연결 리스트라고 한다.
     * 연결 리스트 = 링크드 리스트
     *
     * 연결 리스트는 배열 리스트의 단점을 어느정도 해결한다.
     */

}
