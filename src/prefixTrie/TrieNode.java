package prefixTrie;

import java.util.HashMap;

public class TrieNode {
	public char character;
	public boolean isWord = false;
	public HashMap<Character, TrieNode> characters = new HashMap<Character, TrieNode>();
	
	public TrieNode(char c) {
		this.character = c;
	}
}
