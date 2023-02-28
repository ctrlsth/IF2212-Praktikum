import java.util.ArrayList;  

public class WordProcessor {
    // Atribut statik untuk menyimpan daftar kata
    private static ArrayList<String> words;

    /**
     * Konstruktor
     * Inisialisasi daftar kata
     */
    public WordProcessor() {
		WordProcessor.words = new ArrayList<String>();
    }

    /**
     * Menambahkan kata ke dalam daftar kata
     * @param word
     */
    public static void addWord(String word) {
		WordProcessor.words.set(words.size(), word);
    }

    /**
     * Menghapus kata dari daftar kata
     * @param word
     */
    public static void removeWord(String word) {
		int i = 0;
		boolean gotDaWord = false;
		
		while (!gotDaWord && i < words.size()) {
			gotDaWord = word.equals(WordProcessor.words.get(i));
			i += 1;
		}
		
		if (gotDaWord) {
			WordProcessor.words.remove(i-1);
		}
    }

    /**
     * Mencetak daftar kata dengan format:
     * 1. kata1
     * 2. kata2
     * ...
     */
    public static void printWords() {
        int i;
        for (i = 0; i < WordProcessor.words.size(); i++) {
			System.out.println((i+1) + ". " + WordProcessor.words.get(i));
		}
    }

    /**
     * Mengembalikan kata terbalik pada index tertentu
     * Index dimulai dari 0
     * @param indeks
     * @return
     */
    private static StringBuilder reverseWord(int indeks) {
        StringBuilder idk = new StringBuilder(WordProcessor.words.get(indeks));
        idk.reverse();
        return idk;
    }
    
    /**
     * Mengembalikan apakah suatu kata pada index tertentu merupakan palindrome
     * Clue: gunakan method reverseWord
     * @param indeks
     * @return  true jika kata pada index tertentu merupakan palindrome
     *          false jika kata pada index tertentu bukan palindrome atau index tidak valid
     */
    public static boolean isPalindrome(int indeks) {
		
		String temp1 = WordProcessor.words.get(indeks);
		StringBuilder temp2  = reverseWord(indeks);
		
        return temp1.equals(temp2.toString());
    }
}
