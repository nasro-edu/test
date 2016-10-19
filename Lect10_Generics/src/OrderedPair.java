/**
 * 
 */

/**
 * @author nasro
 *
 */
public class OrderedPair <K,V> implements MoreThanOneType<K, V> {
	private K key;
	private V value;
	public OrderedPair(K key, V value) {
		this.key = key;	this.value = value;
	}
	@Override
	public K getKey() {	return key;}

	@Override
	public V getValue() {return value;}
	@Override
	public String toString() {
		return "OrderedPair [key=" + key + ", value=" + value + "]";
	}
	public void display() {System.out.println(toString());}
}
