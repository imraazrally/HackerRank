import java.util.Iterator;

class Stack <Item> implements Iterable<Item>{
	Node currentElement;
	int position=0;
		
	public void push(Item data){
		Node temp=currentElement;
		currentElement=new Node(data);
		currentElement.next=temp;
		position++;
	}
	
	public Item pop(){
		if(position==0)return null;
		Node poppedElement=currentElement;
		currentElement=currentElement.next;
		position--;
		return poppedElement.data;
	}
	
	public boolean isNotEmpty(){
		if(position==0)return false;
		return true;
	}
	
	//--------------------------------------

	private class Node{
		Item data;
		Node next;
		public Node(Item data){
			this.data=data;
			this.next=null;
		}
	}

	@Override
	public Iterator<Item> iterator() {
		return new stackIterator();
	}
	
	private class stackIterator implements Iterator<Item>{
		public boolean hasNext(){
			return isNotEmpty();
		}
		
		public Item next(){
			return pop();
		}
	}
}
