package prefixTrie;

public class TrieTester {

	public static void main(String[] args) {
		TrieNode root = new TrieNode('h');
		Trie prefixTree = new Trie();
		prefixTree.root = root;
		
		prefixTree.addString("hello");
		prefixTree.addString("hey");
		prefixTree.addString("howdy");
		prefixTree.addString("heytherehowareyou");
		//prefixTree.print(prefixTree.root);
		//false
		System.out.println(prefixTree.isValidWord("heytherehowareyo", prefixTree.root, 0, ""));
		//true
		System.out.println(prefixTree.isValidWord("heytherehowareyou", prefixTree.root, 0, ""));
	}

}
