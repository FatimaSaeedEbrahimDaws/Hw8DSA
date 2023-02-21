public class Q1 {
    public static void main(String[] args) {
        circularlyLinkedList<Integer> list = new circularlyLinkedList<>();

        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
        list.print();
    }
}
/*  public void addFirst(E newElment)
    {if (size==0)
    {   tail=new Node<E>(newElment,null);
        tail.setNext(tail);}
    else {
       tail.next=new Node<>(newElment,tail.next);
        tail.setNext(tail.next);
    }

        size++;

    }*/