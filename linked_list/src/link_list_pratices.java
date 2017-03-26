
public class link_list_pratices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createList L = new createList();

		L.insertNode(100);
		L.insertNode(20);
		L.insertNode(40);
		L.dispLink();
		L.insertLast(22);
		L.dispLink();
		L.delelteLast();
		L.dispLink();
		L.dispLink2();
		
		
		
		
	}

}


class node{  // single node
	public int data;
	public node next;
	public node previous;
	public void disp() {
		System.out.println("data: "+data);
	}
}

class createList{
	private node first;
	public node last;
	public createList() {
		 first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertNode(int data) {
		node newNode = new node();
		if (isEmpty()) {
			last = newNode;
		}
		else {
			first.previous = newNode;  // initialize the double linked list
		}
		newNode.data = data;
		newNode.next = first;
		newNode.previous = null;
		first = newNode;
	}
	
	public void insertLast(int data) {
		node newNode = new node();
		newNode.data = data;
		newNode.previous = last;
		newNode.next = null;
		last.next = newNode;
		last = newNode;
	}
	
	public void deleteFirst() {
		//node temp = new node();
		first.next = first;
		//temp = first;
	}
	
	public void delelteLast() {
		last = last.previous;
		last.next = null;
	}
	
	public void dispLink() {
		node currentNode = first;
		System.out.print("start->");
		while (currentNode!=null) {
			System.out.print(currentNode.data+"->");
			currentNode = currentNode.next;
		}
		System.out.print("end\n");
	}
	
	public void dispLink2() {
		node currentNode = last;
		System.out.print("end->");
		while (currentNode!=null) {
			System.out.print(currentNode.data+"->");
			currentNode = currentNode.previous;
		}
		System.out.print("start\n");
	}
	
	public boolean find(int data) {
		node currentNode = first;
		boolean found = false;
		while (currentNode!=null) {
			if (currentNode.data == data) {
				System.out.println("found:" + data);
				found = true;
			}
			if (!found) {
				System.out.println("not found!");
			}
			currentNode = currentNode.next;
		}
		return found;
	}
	
	public void delete(int data) {
		node currNode = first;
		node previous = first;
		if (isEmpty()) { // only if "firstNode==null", currNode.next can be used;
			System.out.println("Not found!");
			return;
		}
		while (currNode.data!= data) {
			if (currNode.next == null) { 
				System.out.println("Not found!");
				return;   // can not found the data, return;
			}
			else {
				previous = currNode;
				currNode = currNode.next; //in this way, current and previous can be the right place;
			}
		}
		// data found
		if (currNode == first) {
			first = first.next;
		}
		else {
			previous.next = currNode.next;
		}
	}

	
}