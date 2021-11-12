package psa.naloga1;

public class NodeSeznam {
	private static int counter;
	private int key;
	private NodeSeznam tail;

	public int getKey(){
		return key;
	}
	public NodeSeznam getTail(){
		return tail;
	}

	public NodeSeznam(int key){
		this.key=key;
	}

	public int compare(NodeSeznam node) {
		counter++;
		return node.key - this.key;
	}

	public boolean insert(int knode){
		if(tail==null){
			tail = new NodeSeznam(knode);
			return true;
		}
		else{
			return tail.insert(knode);
		}
	}
	public boolean insert(NodeSeznam node){
		if(tail==null){
			tail = node;
			return true;
		}
		else{
			return tail.insert(node);
		}
	}

	public boolean delete(int knode){
		if(knode == key){}
		if(tail == null){
			return false;
		}
		else{
			if(tail.key == knode){
				tail = tail.tail;
				return true;
			}
			else{
				return tail.delete(knode);
			}
		}
	}
	public boolean delete(NodeSeznam node){
		delete(node.key);
		if(node.tail == null){
			return false;
		}
		else{
			return delete(node.tail.key);
		}
	}

	public boolean search(int knode){
		if(key == knode){
			return true;
		}
		else{
			if(tail == null){
				return false;
			}
			else{
				return tail.search(knode);
			}
		}
	}

	public int getCounter() {
		return counter;
	}

	public void resetCounter() {
		counter=0;
	}
}
