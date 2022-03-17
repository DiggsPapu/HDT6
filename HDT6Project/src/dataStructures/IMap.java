package dataStructures;

public interface IMap<T> {
	public void Insert(T key, T value);
	public String SearchValue(T key, String value);
	public String SearchKey(T key);
	public String Removin(T key, String value);
	public void ShowMapping();
	public void ShowMapping2();
	public String getKeyFromValue(T value);
	public String SearchValue(String value);
	public int countValues(T value);
	
}
