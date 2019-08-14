class QueueImplementationUsingLinkedlist
{
	public static void main(String[] args) {
		queue obj=new queue();
		obj.enqueue(12);
		obj.enqueue(13);
		obj.enqueue(14);
		obj.enqueue(15);
		obj.show();
		obj.dequeue();
		obj.dequeue();
		obj.enqueue(171);
		obj.show();
		obj.dequeue();
	}

}

class queue
{
	Node head;
	public void enqueue(int elem)
	{
		Node newNode=new Node(elem);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node Temp=head;
		while(Temp.next!=null)
		{
			Temp=Temp.next;
		}
		Temp.next=newNode;
	}
	}


	public void dequeue()
	{
		if(head==null)
		{
			System.out.println("nothing to dequeue");
		}
		else
		{
			Node temp=head;
			head=head.next;
			System.out.println(temp.data+"dequeued");
		}
	}

	public void show()
	{
		Node Temp=head;
		while(Temp.next!=null)
		{
			System.out.println(Temp.data);
			Temp=Temp.next;
		}
		System.out.println(Temp.data);
	}



}
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}