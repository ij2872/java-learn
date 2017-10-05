package HackerRank;

/**
 * Created by Ivan on 10/4/17.
 */



public class TruesContact2 {
    public static class node {
        private static int NUM_OF_CHAR = 26;
        node[] children = new node[NUM_OF_CHAR];
        int size = 0;

        private static int getCharIndex(char c){
            return c - 'a';
        }

        private node getNode(char c){
            return children[getCharIndex(c)];
        }

        private void setNode(char c, node node){
            children[getCharIndex(c)] = node;
        }

        public void add(String s){
            add(s, 0);
        }

        private void add(String s, int index){
            size++;
            if(index == s.length()) return;
            char current = s.charAt(index);
//            int charCode = getCharIndex(current);

            //exists
            node child = getNode(current);
            if(child == null){
                child = new node();
                setNode(current, child);
            }

            child.add(s, index + 1);
        }

        // Walk through nodes,
        public int findCount(String s, int index){
            if(index == s.length()) return size;

            node child = getNode(s.charAt(index));
            if(child == null) return 0;

            return child.findCount(s, index + 1);

        }
    }
    public static void main(String[] args){
        node t = new node();
        t.add("hack");
        t.add("hackerrank");
        System.out.println(t.findCount("hac", 0));
        System.out.println(t.findCount("hak", 0));
    }

}
