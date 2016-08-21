package name.dimasik.dev.web.portalanalyzer.util;

/**
 * TODO add description
 *
 * @author Dmytro Kudria
 * @author <a href="http://dimasik.name">http://dimasik.name</a>
 *
 */
public class Pair<T, K> {

	private final T first;
	private final K second;

	public Pair(T first, K second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}

	public K getSecond() {
		return second;
	}
}
