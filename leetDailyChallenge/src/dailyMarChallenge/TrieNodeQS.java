package dailyMarChallenge;

public class TrieNodeQS {
    public static void main(String[] args) {

    }

    // To understand better watch the video
    // https://www.youtube.com/watch?v=T1M52UqQq3c
    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    class Trie{
        TrieNode root;
        public Trie(){
            root = new TrieNode();
        }

        public void insert(String word){
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

        public boolean search(String word){
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(node.children[c-'a'] == null)
                    return false;
                node = node.children[c-'a'];
            }
            return node.isEnd;
        }

        public boolean startsWith(String prefix){
            TrieNode node = root;
            for (int i = 0; i < prefix.length(); i++){
                char c = prefix.charAt(i);
                if(node.children[c-'a'] == null)
                    return  false;
                node = node.children[c-'a'];
            }
            return true;
        }

    }

}
