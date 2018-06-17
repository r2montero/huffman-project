package dataStructures;

/**
 *
 * @author Ricardo Rojas Montero. A24418
 */
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(char character) {
        root = new Node(character);
    }

    public BinarySearchTree() {
    }

    public void add(Character character) {
        root = add(root, character);
    }

    private Node add(Node r, Character character) {
        if(r==null) {
            r = new Node(character);
        }
        else if(character < r.character) {
            r.left = add(r.left, character);
        }
        else if(character > r.character) {
            r.right = add(r.right, character);
        }
        else {
            r.increaseWeight();
        }
        return r;
    }
}
