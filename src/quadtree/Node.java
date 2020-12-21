package quadtree;

public class Node {
	private Node[] children; // stores the four children of the node
	private Color color; // the mean color of all pixels stored in the node
	private int height; // the height of the node
	private int width; // the width of the node
	
	/**
	 * Constructor for Node class. Stores 
	 * the height and the width of each node.
	 * @param height
	 * @param width
	 */
	public Node(int height, int width) {
		this.height = height;
		this.width = width;
		children = new Node[4];
	}
	
	/**
	 * Determines whether a given node is a leaf.
	 * @return true if the node is a leaf, false, otherwise.
	 */
	private boolean isLeaf() {
		return children[0] == null && 
				children[1] == null &&
				children[2] == null &&
				children[3] == null;
	}

}
