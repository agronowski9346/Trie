package prefixTrie;

import java.util.Map.Entry;

public class Trie {
	public TrieNode root;
	
	public void addString(String s) {
		TrieNode current = root;
		
		for(int i = 0; i<s.length(); i++) {
			if(!current.characters.containsKey(s.charAt(i))) {
				TrieNode newNode = new TrieNode(s.charAt(i));
				current.characters.put(s.charAt(i), newNode);
				current = current.characters.get(s.charAt(i));
			}
			else {
				current = current.characters.get(s.charAt(i));
			}
		}
	current.isWord = true;
	}
	
	
	public void print(TrieNode currentNode) {
		for(Entry<Character, TrieNode> entry: currentNode.characters.entrySet()) {
			System.out.print(entry.getKey() + " ");
			print(entry.getValue());
		}
		
	}
	
	public boolean isValidWord(String s, TrieNode root, int index, String current) {
		if(root.isWord && current.equals(s)) return true;
		if(index>=s.length()) return false;
		if(!root.characters.containsKey(s.charAt(index))) return false;
		else {
			return isValidWord(s,root.characters.get(s.charAt(index)), index+1, current+s.charAt(index)) || (root.isWord && current.equals(s));
		}
			
		
	}
	
	
}
