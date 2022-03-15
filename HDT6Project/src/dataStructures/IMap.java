package dataStructures;

import java.util.ArrayList;

public interface IMap<T> {
	public void Insert(T key, T value);
<<<<<<< HEAD
	public ArrayList<T> Search(T key);
	public ArrayList<T> Remove(T key, String value);
=======
	public String SearchValue(T key, String value);
	public String SearchKey(T key);
	public String Removin(T key, String value);
	public void ShowMapping();
	public String getKeyFromValue(T value);
>>>>>>> a9e7f46edd87a42c8ab0cfd735640ceafe635c3c
	
}
