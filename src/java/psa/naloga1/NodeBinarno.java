package psa.naloga1;
// LEVO < X < DESNO
public class NodeBinarno {
	private static int counter;
	private int key;
	private NodeBinarno levi;
	private NodeBinarno desni;

	public NodeBinarno(int knode){
		this.key = knode;
	}

	public int getKey(){
		return key;
	}
	public NodeBinarno getLevi(){
		return levi;
	}
	public NodeBinarno getDesni(){
		return desni;
	}

	public boolean insert(NodeBinarno node){
		int compared = compare(node);
		if (compared > 0) {
			if (this.desni == null) {
				this.desni = node;
				return true;
			}else{
				return this.desni.insert(node);
			}
		} else if (compared < 0) {
			if (this.levi == null) {
				this.levi = node;
				return true;
			} else {
				return this.levi.insert(node);
			}
		}else{
			return false;
		}
	}

	public boolean search(NodeBinarno node){
		int compared = compare(node);
		if (compared > 0) {
			if (this.desni == null) {
				return false;
			}else{
				return this.desni.search(node);
			}
		} else if (compared < 0) {
			if (this.levi == null) {
				return false;
			} else {
				return this.levi.search(node);
			}
		}else{
			return true;
		}
	}

	public boolean delete(NodeBinarno node){
		//TODO
		return true;
	}

	public int compare(NodeBinarno node) {
		counter++;
		return node.key - this.key;
	}

	public int getCounter() {
		return counter;
	}

	public void resetCounter() {
		counter=0;
	}
}
