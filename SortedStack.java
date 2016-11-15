package JavaStack;

/**
 * 
 * @author Brian Hillsley
 *
 * @param <T>
 */
public class SortedStack<T extends Comparable> extends Stack<T> {
	
	/**
	 * ASCENDING: Highest value at top of stack. Lowest value at bottom of stack.
	 * DESCENDING:  Lowest value at top of stack. Highest value at bottom of stack.
	 *
	 */
	public static enum Order {ASCENDING, DESCENDING};
	Order order;
	
	public SortedStack(Stack<T> stack, Order o){
		this.order = o;
	}
	
	public SortedStack(){
		super();
	}
	
	/**
	 * Push involves both pushing and re-sorting
	 */
	public void push(T newItem){
		
	}
	
	/**
	 * Using just stacks
	 * An empty stack is considered sorted
	 * @return
	 */
	private boolean isSorted(){
		Stack<T> other = new Stack<T>();
		try {
			other.push(this.pop());
		} catch (Exception e){
			return true;
		}
		while(!this.isEmpty()){
			if(0>(other.peek()).compareTo(this.peek())){
				return false;
			}
		}
		return true;
	}
	
}
