package hashmapsimple;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * @author detectivejd
 * @param <K>
 * @param <V> 
 */
public class MyMap<K, V> implements Map<K,V>{
    private int size;
    private Entry<K,V>[] table;
    /**
     * Construye un nuevo HashMap con una cantidad a almacenar por 
     * defecto
     */
    public MyMap() {
        this(4);
    }
    /**
     * Construye un nuevo HashMap según la cantidad de elementos que
     * deseamos almacenar
     * 
     * @param xcap -> capacidad de elementos a almacenar 
     */
    public MyMap(int xcap) {
        if(xcap <= 0){
            throw new IllegalArgumentException("Capacidad no permitida: " + xcap);
        }
        table = new Entry[xcap];
        size = 0;
    }
    /**
     * Construye un nuevo HashMap que utilizamos para almacenar toda una 
     * estructura de datos tipo map a nuestra estructura de datos
     * 
     * @param m 
     */
    public MyMap(Map<? extends K, ? extends V> m) {
        this(m.size());
        this.putAll(m);
    }
    /**
     * Limpia todas las entradas almacenadas de nuestro HashMap
     */
    @Override
    public void clear() {
        for(int i = 0; i < table.length; i++){
            table[i] = null;
        }
        size = 0;
    }
    /**
     * Transferiere toda una estructura de tipo Map a 
     * nuestro HashMap "casero"
     * 
     * @param m -> mapa de clave/valor
     */
    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        if(m.size() > 0){
            m.entrySet().forEach((e) -> {
                this.put(e.getKey(), e.getValue());
            });
        }
    }
    /**
     * Almacenamos una nueva entrada clave/valor a nuestro HashMap 
     * "casero", si nuestro map contiene una entrada con la key 
     * existente, el valor viejo será reemplazado
     * 
     * @param key -> clave
     * @param value -> valor
     * @return V -> valor
     */
    @Override
    public V put(K key, V value) {
        if(key != null){
            int index = this.hash(key);
            if (table[index]!= null && table[index].getKey().equals(key)) {
                V oldValue = table[index].getValue();
                table[index].setValue(value);
                return oldValue;
            }  
            this.addEntry(key, value);
            return value;
        }
        return null;
    }
    /**
     * Almacenamos la clave/valor a nuestra estructura de datos
     * 
     * @param key -> clave
     * @param value -> valor
     */
    private void addEntry(K key, V value){
        if(size >= table.length * 3/4){
            Entry<K,V>[] tmp = table;
            size = 0;
            table = Arrays.copyOf(table, table.length * 2);
            for(int i = 0; i < table.length; i++){
                table[i] = null;
            }
            for (Entry<K, V> e : tmp) {     
                if(e != null){
                    put(e.getKey(),e.getValue());
                }
            }            
        }
        int index = hash(key);
        table[index] = new Entry(key, value);
        size++;
    }
    /**
     * Obtiene el índice para una entrada hash nueva o existente 
     * 
     * @param key -> clave
     * @return int -> índice para obtener una entrada existente
     */
    private int hash(Object key) {        
        return (key.hashCode() & 0x7fffffff) % table.length;
    }
    /**
     * Encuentra un valor mediante una clave pasada por parámetro
     * 
     * @param key -> clave
     * @return V -> valor 
     */
    @Override
    public V get(Object key) {        
        return (this.getEntry(key) == null) ? null : this.getEntry(key).getValue();
    }
    /**
     * Verifica si existe una entrada por medio de una clave 
     * pasada por parámetro
     * 
     * @param key -> clave
     * @return boolean -> verdadero o falso
     */
    @Override
    public boolean containsKey(Object key) {
        return this.getEntry(key) != null;
    }
    /**
     * Obtenemos una entrada mediante una clave pasada por parámetro
     * 
     * @param key -> clave
     * @return Entry<K, V> -> entrada clave/valor
     */
    private Entry<K, V> getEntry(Object key) {
        int index = hash(key);
        if(table[index] != null){
            if (table[index].getKey().equals(key)){
                return table[index];
            }            
        } 
        return null;
    }
    /**
     * Verifica si existe una entrada por medio de un valor pasado 
     * por parámetro 
     * 
     * @param value -> valor
     * @return boolean -> verdadero o falso 
     */
    @Override
    public boolean containsValue(Object value){
        if(value != null){
            for (Entry val : table) {
                if (val != null && value.equals(val.getValue())){
                    return true;
                }            
            }
        }
        return false;       
    }
    /**
     * Devuelve la cantidad de elementos almacenados en nuestra
     * estructura de datos
     * 
     * @return int -> entero 
     */
    @Override
    public int size() {
        return size;
    }
    /**
     * Verifica si nuestra estructura de datos esta vacía o no
     * 
     * @return boolean -> verdadero o falso 
     */
    @Override
    public boolean isEmpty(){
        return size == 0;
    }
    /**
     * Elimina una entrada existente por medio de una clave 
     * pasada por parámetro
     * 
     * @param key
     * @return V -> valor 
     */
    @Override
    public V remove(Object key){
        int index = hash(key);
        if(table[index] != null && table[index].getKey().equals(key)){
            Entry<K,V> e = table[index];
            table[index] = table[last()];
            table[last()] = null;
            size--;
            return e.getValue();                            
        }
        return null;
    }
    private int last(){
        if(size > 0){
            for(int i = table.length -1; i > 0; i--){
                if(table[i] != null){
                    return i;
                }
            }
        }
        return -1;
    }
    /*-----------------------------------------------------------*/
    /**
     * Devuelve un conjunto de todas las claves almacenadas en 
     * nuestra estructura de datos
     * 
     * @return Set<K> -> tupla de claves
     */
    @Override
    public Set<K> keySet() {
        return new KeySet();
    }   
    /*-----------------------------------------------------------*/
    /**
     * KeySet es una clase interna que utilizamos para las iteraciones
     * (recorridos que hacemos con foreach) de las claves
     */
    private class KeySet extends AbstractSet<K>{
        /**
         * Personaliza el recorrido de las claves
         * 
         * @return Iterator<K> -> recorrido de claves
         */
        @Override
        public Iterator<K> iterator() {
            return new KeyIterator();
        }
        /**
         * Misma idea de la función size de nuestra estructura
         * 
         * @return int -> entero 
         */
        @Override
        public int size() {
            return size;
        }        
    }
    /**
     * Clase interna para dar estilo al recorrido de las claves
     */
    private final class KeyIterator extends HashIterator<K> {
        /**
         * Obtiene la siguiente clave del recorrido
         * 
         * @return K -> clave
         */
        @Override
        public K next() {
            return nextEntry().getKey();
        }        
    }
    /*-----------------------------------------------------------*/
    /**
     * Devuelve una colección de los valores almacenados de 
     * nuestra estructura de datos
     * 
     * @return Collection<V> -> colección de valores
     */
    @Override
    public Collection<V> values() {
        return new Values();
    }
    /**
     * Values es una clase interna que utilizamos para las iteraciones
     * (recorridos que hacemos con foreach) de los valores
     */
    private class Values extends AbstractCollection<V>{
        /**
         * Personaliza el recorrido de los valores
         * 
         * @return Iterator<V> -> recorrido de valores
         */
        @Override
        public Iterator<V> iterator() {
            return new ValueIterator();
        }
        /**
         * Misma idea de la función size de nuestra estructura
         * 
         * @return int -> entero 
         */
        @Override
        public int size() {
            return size;
        }        
    }
    /**
     * Clase interna para dar estilo al recorrido de los valores
     */
    private final class ValueIterator extends HashIterator<V>{
        /**
         * Devuelve el siguiente valor del recorrido
         * 
         * @return V -> valor 
         */
        @Override
        public V next() {
            return nextEntry().getValue();
        }        
    }
    /*-----------------------------------------------------------*/
    /**
     * Devuelve un conjunto de las entradas almacenadas en 
     * nuestra estructura de datos
     * 
     * @return Set<Map.Entry<K, V>> -> conjunto de entradas
     */
    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return new EntrySet();
    }
    /**
     * EntrySet es una clase interna que utilizamos para las iteraciones
     * (recorridos que hacemos con foreach) de las entradas
     */
    private class EntrySet extends AbstractSet<Map.Entry<K,V>> {
        /**
         * Personaliza el recorrido de las entradas
         * 
         * @return Map.Entry<K, V> -> recorrido de entradas
         */
        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }
        /**
         * Misma idea de la función size de nuestra estructura
         * 
         * @return int -> entero 
         */
        @Override
        public int size() {
            return size;
        }        
    }
    /**
     * Clase interna para dar estilo al recorrido de las entradas
     */
    private final class EntryIterator extends HashIterator<Map.Entry<K,V>> {
        /**
         * Devuelve la siguiente entrada del recorrido
         * 
         * @return V -> valor 
         */
        @Override
        public Entry<K, V> next() {
            return nextEntry();
        }        
    }
    /*-----------------------------------------------------------*/
    /**
     * Clase abstracta que usamos para los distintos tipos de 
     * recorridos empleados en nuestra estructura de datos
     * 
     * @param <E> 
     */
    private abstract class HashIterator<E> implements Iterator<E> {
        private int index = 0;
        private Entry<K,V> currEntry = null;
        private Entry<K,V> nextEntry = null;
        /**
         * Construye una nueva iteración hash
         */
        @SuppressWarnings("empty-statement")
        HashIterator() {
            index = 0;
            for(; index< size; index++){
                if(table[index]!= null){
                    nextEntry = table[index];
                    break;
                }
            }
        }
        /**
         * Verifica si hay una siguiente entrada
         * 
         * @return boolean -> verdadero o falso 
         */
        @Override
        public boolean hasNext() {
            return nextEntry != null;
        }
        /**
         * Obtiene la entrada próxima, y también es una función 
         * sobreexplotada para los recorridos ;)
         * 
         * @return Entry<K,V> -> entrada clave/valor
         */
        @SuppressWarnings("empty-statement")
        public Entry<K,V> nextEntry() {
            currEntry = nextEntry;
            nextEntry = table[index];
            index++;            
            if (index <= size && table[index] != null) {
                nextEntry = table[index];               
            } else {
                nextEntry = null;
                for (;index < size; index++){
                    if (table[index] != null){
                        nextEntry = table[index];
                    }
                }
            }
            return currEntry;
        }
    }   
    /*-----------------------------------------------------------*/
    /**
     * Clase interna para definir las entradas clave/valor que 
     * almacenaremos en nuestra estructura de datos
     * 
     * @param <K>
     * @param <V> 
     */
    class Entry<K,V> implements Map.Entry<K,V>{
        final K key;
        V value;
        Entry(K k, V v) {
            value = v;
            key = k;
        }
        @Override
        public final K getKey() {
            return key;
        }
        @Override
        public final V getValue() {
            return value;
        }        
        @Override
        public V setValue(V v) {
            V val = value;
            value = v;
            return val;
        }
        @Override
        public String toString() {
            return getKey() + " -> " + getValue();
        }
    }
}