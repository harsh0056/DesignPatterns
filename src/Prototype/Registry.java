package Prototype;

public interface Registry <K,V>{

public void addPrototype(K key, V prototype);
    public V getPrototype(K key);

}
