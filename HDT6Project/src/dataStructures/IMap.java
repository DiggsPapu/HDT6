package dataStructures;

public interface IMap<T> {
	public void Insert(T key, T value);
	public String Search(T key, String value);
	public String Removin(T key, String value);
}
