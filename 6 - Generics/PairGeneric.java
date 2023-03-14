/* 18221171 - Hans Stephano */
/* Topik - Generics */

interface Pair<K,V>{
    public K getKey();
    public V getValue();
}
public class PairGeneric<K,V> implements Pair<K,V>{
    private K key;
    private V value;

    public PairGeneric(K key,V value){
        //Konstruktor
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        //Kembalikan nilai key
        return this.key;
    }
    public V getValue(){
        //Kembalikan nilai value
        return this.value;
    }

    public String getTypeKeyandValue(){
        //Mencetak tipe data key dan value
        //Contoh "1 memiliki tipe Integer dan value dari key tersebut memiliki tipe String dengan nilai berupa Halo"
        //Format "key memiliki tipe key_type dan value dari key tersebut memiliki tipe value_type dengan nilai berupa value"
        return (String.valueOf(this.key + " memiliki tipe " + this.key.getClass().getSimpleName() + " dan value dari key tersebut memiliki tipe " + this.value.getClass().getSimpleName() + " dengan nilai berupa " + this.value));
    }
}
