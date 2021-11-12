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

public boolean insert(int knode){	
	if(compare(levi)==this.key){
		return true;
	}else if (compare(levi)<this.key){
		return insert(levi);
	}
	else{
		return insert(desni);
	}
}
public boolean insert(NodeBinarno node){
	//TODO
	return true;
}
public boolean search(int knode){
if(knode == key){
	return true;
}
else{
	if(knode<key){
		return levi.search(knode);
	}
	else if(knode>key){
		return desni.search(knode);
	}
	else{
		return false;
	}
}
}
public boolean search(NodeBinarno node){
	//TODO
	return true;
}
public boolean delete(int knode){
	if(knode==key){
	return true;
	}
	else{
	if(knode<key){
	return levi.delete(knode);
	}
	else if(knode>key){
	return desni.delete(knode);
	}
	else{
		return false;
	}
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
