
public class TrieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie = new Trie();
		String [] dic = {"geeks", "code", "xyz", 
                           "forgeeks", "paper"};
		String [] dic2 = {"news", "abcd", "tree", 
                "geeks", "paper"};
		String word = "newspaper";
		
		for(int i =0; i<dic2.length;i++){
			System.out.println(dic2[i]);
			trie.insert(dic2[i]);
		}
		System.out.println(trie.bothPossible(word));

	}

}
