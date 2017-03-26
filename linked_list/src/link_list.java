
public class link_list {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkList thelist = new LinkList();
		
		thelist.insertFirst(22,1.11);
		thelist.insertFirst(33,1.1);
		thelist.insertFirst(44,1.1);
		thelist.insertFirst(55,1.1);
		thelist.insertFirst(66,1.1);
		
		thelist.dispList();
		
		while (!thelist.isEmpty()) {
			Link aLink = thelist.deleteFirst();
			System.out.println("Deleted ");
			aLink.disp();
		}
		

	}

}


class Link{
	public int iData;
	public double dData;
	public Link next;
	
	public Link(int id,double dd) {
		iData = id;
		dData = dd;
	}
	
	public void disp() {
		System.out.println("iData:"+iData);
		System.out.println("dData:"+dData);
	}
}

class LinkList{
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(int id,double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void dispList() {
		System.out.println("first-->last");
		Link current = first;
		while (current != null) {
			current.disp();
			current = current.next;
		}
		System.out.println("");
	}
}


