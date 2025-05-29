import java.util.*;
class Linkedlist{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public void merge(Node head1, Node head2){
        Node current1 = head1;
        Node current2 = head2;
        Linkedlist mergedList = new Linkedlist();
        while(current1 != null && current2 != null){
            if(current1.data < current2.data){
                mergedList.insert(current1.data);
                current1 = current1.next;
            }else{
                mergedList.insert(current2.data);
                current2 = current2.next;
            }
        }
        while(current1 != null){
            mergedList.insert(current1.data);
            current1 = current1.next;
        }
        while(current2 != null){
            mergedList.insert(current2.data);
            current2 = current2.next;
        }
        mergedList.display();
    }
    public void removeduplicates(Node head){
        Node current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }
}
public class Merge_Two_Sorted_Linkedlist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c= sc.nextInt();
        int d= sc.nextInt();
        Linkedlist list1 = new Linkedlist();
        for(int i=0; i<c; i++){
            list1.insert(sc.nextInt());
        }
        Linkedlist list2 = new Linkedlist();
        for(int i=0; i<d; i++){
            list2.insert(sc.nextInt());
        }
        Linkedlist list3 = new Linkedlist();
        list3.merge(list1.head,list2.head);

        Linkedlist list4 = new Linkedlist();
        list4.removeduplicates(list3.head);
        list4.display();
    }
}
