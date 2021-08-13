
public class Queue<T> {
	Node<T> head = new Node<>();
	Node<T> tail = new Node<>();
	int Size;
	
	public void AppendData(T data) {
		if(Size>0) {
			Node <T> n = new Node<>();
			n.data=data;
			tail.next=n;
			tail=n;
		}
		else {
			head.data=data;
			tail=head;
		}
		Size++;
	}
	
	public void showData() {
		
		System.out.println("here is your Queue ");
		if(Size>0) {
			Node<T> n = head;
			while(n.next!=null) {
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);
		}else {
			System.out.println("No elements are present ");
		}
	}
	
}