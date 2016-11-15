package JavaStack;
import java.util.ArrayList;

/**
 * A generic stack implementation
 * 
 * @author Brian Hillsley
 *
 * @param <T> whatever generic type you like
 */
public class Stack<T> {

	private ArrayList<T> values;
	private int size;
	
	public Stack(){
		values = new ArrayList<T>();
		size = 0;
	}
	
	public T peek(){
		return values.get(size);
	}
	
	public void push(T t){
		values.add(t);
	}
	
	public T pop(T t) throws StackEmptyException {
		int lastIndex = size-1;
		T retT = values.get(lastIndex);
		values.remove(lastIndex);
		size--;
		return retT;
	}
	
	public boolean isEmpty(){
		if(size==0){
			return true;
		} else {
			return false;
		}
	}
	
	public int size(){
		return size;
	}
	
}
