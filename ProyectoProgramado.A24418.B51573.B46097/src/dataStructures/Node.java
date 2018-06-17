package dataStructures;

class Node implements Comparable<Node> {

    int weight;
    Character character;
    Node left;
    Node right;

    /**
     *
     * @param character
     */
    public Node(Character character) {
        this.character = character;
        this.weight = 1;
    }

    /**
     *
      * @param weight
     */
    public Node(int weight) {
        this.weight = weight;
        this.character = null;
    }

    /**
     *
     */
    public void increaseWeight() {
        weight++;
    }

    /**
     *
     * @param n
     * @return
     */
    @Override
    public int compareTo(Node n) {
        return n.weight - this.weight;
    }
}
