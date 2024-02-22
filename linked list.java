import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	LinkedList L1 = new LinkedList ();
	  L1.addlast (80);
	  L1.addlast (90);
	  L1.addlast (78);
	  L1.print();
	  System.out.println("--------------------------------------------------------------------------------");
	  L1.delFirst();
	  L1.print ();
  }
}
class Node
{
  int data; 
  Node next;
    Node (int data)
  {
	this.data = data;
	this.next = null;
  }
}
class LinkedList
{
  Node head;
    LinkedList ()
  {
	this.head = null;
  }
  void addlast (int data)
  {
	Node newNode = new Node (data);
	if (this.head == null)
	  {
		this.head = newNode;
	  }
	else
	  {
		Node temp = head;
		while (temp.next != null)
		  {
			temp = temp.next;
		  }
		temp.next = newNode;
	  }
  }
  void delFirst(){
      if(head==null){
          System.out.println("List is empty");
      }
      else{
          head=head.next;
      }
  }
  void print ()
  {
	Node temp = head;
	while (temp != null)
	  {
		System.out.println (temp.data);
		temp = temp.next;
	  }
  }

}