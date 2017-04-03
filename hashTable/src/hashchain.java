
public class hashchain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkList L = new linkList(13);
		L.insert(10);
		L.insert(100);
		L.insert(200);
		L.insert(22);
		L.insert(9889);
		L.disp();
		
	}

}

class node{
	int value;
	node nextNode;
	public node(int data) {
		value = data;
	}
}

class link{
	node root = null;
	node newNode;
	
	
	public void insert(int value) {
		newNode = new node(value);    // every time wants to insert a new value, you must create a new instance, or it will always be the first instance.
		newNode.nextNode=null;
		if (root==null) {
			root = newNode;
			return;
		}
		node parent = root;
		node currNode = root;
		while (currNode!=null) {
			parent = currNode;
			currNode = currNode.nextNode;
		}
		parent.nextNode = newNode;
		return;
	}
	
	public void disp() {
		node currNode = root;
		while (currNode!=null) {
			System.out.print(currNode.value+",");
			currNode = currNode.nextNode;
		}
		System.out.println();
	}
}

class linkList{
	link[] arrLink;
	int len;
	public linkList(int number) {
		arrLink = new link[number];
		len = number;
		for (int i = 0; i < len; i++) {
			arrLink[i] = new link();
		}
	}
	
	public void insert(int value) {
		int index = value%len;
		arrLink[index].insert(value);
	}
	
	public void disp() {
		for(int i=0;i<len;i++){
			System.out.print("index "+i+": ");
			arrLink[i].disp();	
		}
	}
	
}