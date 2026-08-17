class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        if (head == null) return -1;

        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            if (cnt == index) {
                return temp.val;
            }
            cnt++;
            temp = temp.next;
        }
        return -1;
    }
    public void addAtHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }
    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    public void addAtIndex(int index, int val) {

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node temp = head;
        int cnt = 0;
        while (temp != null) {

            if (cnt == index - 1) {
                Node newNode = new Node(val);

                newNode.next = temp.next;
                temp.next = newNode;

                return;
            }

            cnt++;
            temp = temp.next;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.next;
            }
            return;
        }
        Node temp = head;
        int cnt = 0;

        while (temp != null) {

            if (cnt == index - 1) {

                if (temp.next != null) {
                    temp.next = temp.next.next;
                }

                return;
            }
            cnt++;
            temp = temp.next;
        }
    }
}