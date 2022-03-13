package dataStructures;

public interface IHashTable<T> {
	public void Insert(T key, T value);
	public T Search(T key);
	public T Remove(T key);
}
