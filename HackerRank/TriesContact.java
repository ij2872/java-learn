package HackerRank;

/**
 * Created by Ivan on 10/4/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
    char c;
    HashMap<Character, Node> children = new HashMap<Character, Node>();
    public boolean isLeaf;

    public Node(){};

    public Node(char c){
        this.c = c;
    }
}

class Trie{
    private Node root;

    public Trie(){
        root = new Node();
    }

    //Insert Word
    public void insert(String word){
        HashMap<Character, Node> children = root.children;

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            Node t;

            if(children.containsKey(c)){
                t = children.get(c);
            } else {
                t = new Node(c);
                children.put(c, t);
            }

            children = t.children;

            //set leaf node for last char
            if(i == word.length() - 1){
                t.isLeaf = true;
            }

        }
    }

    public boolean prefix(String prefix){
        if(searchNode(prefix) == null){
            return false;
        } else{
            return true;
        }

    }

    public int prefixCount(String prefix){
        int result = 0;

        //No prefix found
        if(prefix(prefix) == false){
            System.out.println("PREFIX IS FALSE");
            return 0;
        }

        HashMap<Character, Node> children = root.children;
        Node t = null;
        for(char c : prefix.toCharArray()){

            if(children.containsKey(c)){
                t = children.get(c);
                children = t.children;
            }
        }

        return count(t);
    }
    public int count(Node root){
        int result = 0;
        if(root.isLeaf){
            result++;
        }

        //Go through all Keys
        for(Map.Entry<Character, Node> entry : root.children.entrySet()){
            if(entry.getValue() != null){
                result += count(entry.getValue());
            }
        }
        return result;
    }

    public Node searchNode(String word){
        HashMap<Character, Node> children = root.children;
        Node t = null;
        for(char c : word.toCharArray()){
//            System.out.println(c);

            if(children.containsKey(c)){
                t = children.get(c);
                children = t.children;
            } else{
                // Char not in Trie
                return null;
            }
        }
        return t;
    }
}

public class TriesContact {

    public static void trie(String op, String contact){
        Trie t = new Trie();

        if(op == "add"){
            System.out.println("Inserting");
            t.insert(contact);
        } if(op == "find"){
            System.out.println("TRIE OUT: " + t.searchNode(contact));
        }

    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for(int a0 = 0; a0 < n; a0++){
//            String op = in.next();
//            String contact = in.next();
//            trie(op, contact);
//        }

//        trie("add", "hacker");
//        trie("add", "hackerrank");
//        trie("find", "hac");
//        trie("find", "hak");

        Trie t = new Trie();
        t.insert("hacker");
        t.insert("hackerrank");
        t.insert("hackerranks");
        System.out.println(t.prefixCount("hac"));
        System.out.println(t.prefix("hak"));

    }
}
