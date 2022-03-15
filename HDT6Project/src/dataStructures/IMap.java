package dataStructures;

import java.util.ArrayList;

public interface IMap<T> {
	public void Insert(T key, T value);
	public ArrayList<T> Search(T key);
	public ArrayList<T> Remove(T key, String value);
	
}
