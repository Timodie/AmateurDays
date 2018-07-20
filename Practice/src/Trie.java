import java.util.Map;
import java.util.HashMap;

public class Trie {

	private static class TrieNode{
		Map<Character, TrieNode>children;
		boolean endOfWord;
		
		public TrieNode(){
			children = new HashMap<Character,TrieNode>();
			endOfWord = false;
		}
	}
		private TrieNode root;
		
		public Trie(){
			root = new TrieNode();
		}
		
		public void insert(String word){
			TrieNode curr = root;
			for(int i=0; i<word.length(); i++){
				char ch = word.charAt(i);
				TrieNode node = curr.children.get(ch);
				if(node == null){
					node = new TrieNode();
					curr.children.put(ch, node);
				}
				curr = node;
			}
			curr.endOfWord = true;
		}
		
		public boolean search(String word){
			TrieNode curr = root;
			for(int i=0; i<word.length(); i++){
				char ch = word.charAt(i);
				TrieNode node = curr.children.get(ch);
				if(node == null){
					return false;
				}
				curr = node;
			}
			return curr.endOfWord;
		}
		
		public void delete(String word){
			delete(root,word,0);
			
		}
		
		public boolean delete(TrieNode curr,String word, int index){
			if( index == word.length()){
				if(!curr.endOfWord){
					return false;
				}
				curr.endOfWord = false;
				return curr.children.size() ==0;
			}
			char ch = word.charAt(index);
			TrieNode node = curr.children.get(ch);
			if(node == null){ // word does not exist in trie
				return false;
			}
			boolean shouldDeleteCurrNode = delete(curr, word, index+1);
			
			if(shouldDeleteCurrNode){
				curr.children.remove(ch);
				return curr.children.size() ==0;
			}
			return false;
		}
		
		public String findPrefix(String word){
			TrieNode curr = root;
			StringBuilder prefix = new StringBuilder();
			String pref ="";
			for(int i =0; i<word.length(); i++){
				char ch = word.charAt(i);
				try{
					TrieNode node = curr.children.get(ch);
					if(node!=null){
						prefix.append(ch);
						System.out.println(ch);

					}
					curr = node;
				}
				catch(NullPointerException e){
					
				}
				finally{
					pref = prefix.toString();
				}
			
			}
		
			return pref;
		}
		public boolean bothPossible(String word){
			String pref1 = findPrefix(word);
			boolean exists = search(pref1);
			if(!exists){
				return false;
			}
			StringBuilder pref2 = new StringBuilder();
			for(int i =pref1.length(); i<word.length(); i++){
				pref2.append(word.charAt(i));
			}
			String prefix2 = pref2.toString();
			String prefix2Searched = findPrefix(prefix2);
			boolean exists2 = search(prefix2Searched);
			return exists && exists2;		
		}
	}

