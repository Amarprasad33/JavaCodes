package dailyMarChallenge;


// For ref watch video
// https://www.youtube.com/watch?v=6O73KA53ayY
class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean isEnd = false;
}

class WordDictionary {
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(node.children[c-'a'] ==  null){
                node.children[c-'a'] = new TrieNode();
            }
            node = node.children[c-'a'];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode temp = root;
        return helper(word, 0, temp);
    }

    private boolean helper(String word, int i, TrieNode node){
        if(node == null) return false;
        if(i == word.length()) return node.isEnd;
        char c = word.charAt(i);

        if(c == '.'){
            for(int k = 0; k < 26; k++){
                if(helper(word, i+1, node.children[k])) return true;
            }
        } else{
            if(helper(word, i+1, node.children[c-'a'])) return true;
        }
        return false;
    }
}



public class qs_211 {
  // Refer the solution above:
}
