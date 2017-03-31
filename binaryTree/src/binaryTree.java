
public class binaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		tree t1 = new tree();
		
		t1.insert(10);
		t1.insert(8);
		t1.insert(6);
		t1.insert(9);
		t1.insert(20);
		t1.insert(15);
		t1.insert(21);
		t1.insert(3);
		t1.insert(7);
		

		
		t1.inOrder(t1.root);
		t1.max();
		t1.min();
		
		

	}

}

class node{
	public int data;
	public node left;          // where data is smaller
	public node right;		// where data is bigger
}




class tree{
	public node root;    // before initialized, the root equals to zero.
	
	public node find(int key) {
		if(root == null) {
			System.out.println("empty tree.");
			return null;
		}
		node current = root;
		while (current.data != key) {
			if(key>current.data){
				current = current.right;
			
			}
			else {
				current = current.left;
			}
			if (current == null) {
				System.out.println(key+" not found!");
				return null;
			}
			
		}
		System.out.println(key+" found!");
		return current;
	}
	
	public void insert(int key) {
		node newNode = new node();
		newNode.data = key;
		if (root == null) {
			root = newNode;
		}
		else {
			node currNode = root;
			node parent;
			while (true) {
				parent = currNode;
				if(key<currNode.data){
					currNode = currNode.left;
					if(currNode==null){
						parent.left = newNode;
						return;
					}
				}
				else {
					currNode = currNode.right;
					if(currNode==null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrder(node localNode) {
		if (localNode!=null) {
			// System.out.print(localNode.data+"->");  // front Order 
			inOrder(localNode.left);
			// System.out.print(localNode.data+"->"); // inOrder
			inOrder(localNode.right);
			System.out.print(localNode.data+"->");    // back Order
		}
	}
	
	public void max() {
		node currNode = root;
		node parNode = root;
		while (currNode!=null) {
			parNode = currNode;
			currNode = currNode.right;
		}
		System.out.println();
		System.out.println("max is: "+parNode.data);
		
	}
	
	public void min() {
		node curNode = root;
		node parNode = root;
		while (curNode!=null) {
			parNode = curNode;
			curNode = curNode.left;
		}
		System.out.println("min is: "+parNode.data);
	}
	
	
}
