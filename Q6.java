public class Q6 {
    public static void main(String[] args) {
        circularlyLinkedList<Integer>list=new circularlyLinkedList<>();
        circularlyLinkedList<Integer>list1=new circularlyLinkedList<>();
        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
        list.addLast(16);
        System.out.print("list1: ");
        list.print();

        list1=list1.clone(list);
        System.out.println("after clone:  ");
        System.out.print("list1:  ");
        list.print();

        System.out.print("list2:  ");
        list1.print();



    }
}
