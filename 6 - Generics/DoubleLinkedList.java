/**
 * LinkedList.java
 * [Implementasi dari Double Linked List]
 * @author [18221171] [Hans Stephano E]
 */

public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Konstruktor
     * buat Double linked list dengan size = 0 dan head = tail = null
     */
    public DoubleLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

    /**
     * Cari elemen yang terletak pada posisi position
     * @param position
     * @return elemen pada posisi position jika ada, null jika tidak ada
     */
    public Node<T> getNode(int position) {
		if (this.size <= position) {
			return null;
		}
		else
		{
			int counter = 0;
			Node<T> current = this.head;
			while (counter < position) {
				current = current.getNext();
				counter += 1;
			}
			
			return current;
		}
	}

    /**
     * Tambah elemen dengan nilai item dengan menambahkan
     * node sebagai elemen paling belakang
     * @param item
     */
    public void add(T item) {
		this.tail.setNext(new Node(item, this.tail, null));
		this.tail = this.tail.getNext();
	}

    /**
     * Cari nilai elemen pada posisi position
     * @param position
     * @return nilai elemen pada posisi position jika ada, null jika tidak ada
     */
    public T get(int position) {
		Node<T> theNode = getNode(position);
		if (theNode != null) {
			return theNode.getValue();
		}
		return null;
	}

    /**
     * Ubah nilai elemen pada posisi position menjadi nilai item jika ada
     * @param position
     * @param item
     */
    public void set(int position, T item) {
		Node<T> theNode = getNode(position);
		if (theNode != null) {
			theNode.setValue(item);
		}
	}

    /**
     * Hapus elemen pada posisi position jika ada
     * @param position
     */
    public void remove(int position) {
		Node<T> theNode = getNode(position);
		if (theNode != null) {
			Node<T> prevNode = theNode.getPrev();
			Node<T> nextNode = theNode.getNext();
			if (prevNode != null) {
				prevNode.setNext(nextNode);
			}
			if (nextNode != null) {
				nextNode.setPrev(prevNode);
			}
		}
	}

    /**
     * Hapus semua elemen dari Double Linked List
     */
    public void clear() {
		Node<T> current = this.head;
		Node<T> storeNext;
		while (current != null) {
			current.setPrev(null);
			storeNext = current.getNext();
			current.setNext(null);
			current = storeNext;			
		}
		this.size = 0;
	}

    /**
     * Getter size
     * @return size
     */
    public int getSize() {
		return this.size;
	}

    /**
     * Menampilkan keseluruhan isi Double Linked List
     * Format yang dikeluarkan adalah sebagai berikut, misal isi list adalah [1,2,3,4]
     * Maka output yang dihasilkan adalah (dengan enter) :
     * 1 2 3 4
     */
    public void display() {
		Node<T> current = this.head;
		Node<T> whatsNext = null;
		while (current != null) {
			whatsNext = current.getNext();
			if (whatsNext == null) {
				System.out.println(String.valueOf(current.getValue()));
			}
			else {
				System.out.print(String.valueOf(current.getValue() + " "));
			}
		}
	}

    /**
     * Find element position
     * jika terdapat lebih dari 1 elemen dengan nilai yang sama, maka ambil posisi
     * yang ditemukan pertama kali dari head
     * @return posisi dari sebuah item mulai dari head dengan zero indexing
     */
    public Integer find(T item) {
		Node<T> current = this.head;
		boolean notFound = true;
		int counter = 0;
		while (current != null && notFound) {
			notFound = current.getValue().equals(item);
			current = current.getNext();
			counter += 1;
		}
		
		if (notFound) {
			return -1;
		}
		else {
			return counter-1;
		}
	}
}
