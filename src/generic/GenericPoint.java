package generic;

public class GenericPoint<T> {

	private T x;

	private T y;

	public GenericPoint(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "GenericPoint [x=" + x + ", y=" + y + "]";
	}

}