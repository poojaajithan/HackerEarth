import java.util.LinkedList;
import java.util.Queue;

class Node{
	int key;
	Node left,right;
	static final int COUNT = 10;
	
	public Node(int key) {
		this.key = key;
		left=null;
		right=null;
	}	
}
public class BinaryTreeImpl {
    static Node root;
	public static void main(String[] args) {
		BinaryTreeImpl impl = new BinaryTreeImpl();
		//Add nodes to BST
		impl.addNodes(10);
		impl.addNodes(5);
		impl.addNodes(16);
		impl.addNodes(8);
		impl.addNodes(3);
		impl.addNodes(4);
		impl.addNodes(20);
		impl.addNodes(15);
		impl.addNodes(9);
		
		//Search for a given key
		impl.searchKey(16);
		impl.searchKey(7);
		
		//Print BST
		print2DUtil(root,0);
		
		/*
		 * Binary tree traversals
		 * 1. Breadth First (Level order)
		 * 2. Depth First (Preorder, Inorder (freefall), Postorder (leaf break)
		 */
		System.out.println("Preorder :");
		preorderRecursive(root);
		System.out.println();
		System.out.println("Inorder :");
		inorderRecursive(root);
		System.out.println();
		System.out.println("Postorder :");
		postorderRecursive(root);
		System.out.println();
		
		//BFS implementation
		System.out.println("BFS Implemenation");
		Queue<Node> bfsQueue = new LinkedList<>();
		bfsQueue.offer(root);
		while(!bfsQueue.isEmpty()) {
			Node n = bfsQueue.poll();
			System.out.print(n.key+"\t");
			if(n.left != null) {
				bfsQueue.offer(n.left);
			}
			if(n.right != null) {
				bfsQueue.offer(n.right);
			}
		}
		System.out.println();
		
		// Find the Height of a tree without Recursion --> use null as marker
		findHeightIterartive();
		
		// Find the Height of a tree using Recursion 
		int height = findHeightRecursion(root);
		System.out.println("Height of tree using recursion :" +height + "\n");
		
		//Delete node with no child
		impl.deleteNode(4);
		System.out.println("After deletion of 4:");
		print2DUtil(root,0);
		
		//Delete node with one child node
		impl.deleteNode(8);
		System.out.println("After deletion of 8:");
		print2DUtil(root,0);
		
		//Delete node with 2 child nodes
		impl.deleteNode(10);
		System.out.println("After deletion of 10:");
		print2DUtil(root,0);	

	}

	private static int findHeightRecursion(Node node) {
		if(node == null) {
			return 0;
		}
		return (1+Math.max(findHeightRecursion(node.left), findHeightRecursion(node.right)));
	}

	private static void findHeightIterartive() {
		Queue<Node> heightQueue = new LinkedList<>();
		int height = 0;
		heightQueue.add(root);
		heightQueue.add(null);
		
		while(!heightQueue.isEmpty()) {
			Node n = heightQueue.remove();
			if(n==null) {
				if(!heightQueue.isEmpty()) {
					heightQueue.add(null);
				}
				height++;
			}else {
				if(n.left != null) {
					heightQueue.add(n.left);
				}
				if(n.right != null) {
					heightQueue.add(n.right);
				}
			}
		}
		
		System.out.println("\nHeight of tree using iteration : "+height + "\n");
	}

	private static void preorderRecursive(Node root) {

		/* <root> <left> <right> */
		if(root==null) 
			return;
		System.out.print(root.key + "\t");
		preorderRecursive(root.left);
		preorderRecursive(root.right);	
	}
	
	private static void inorderRecursive(Node root) {

		/* <left> <root> <right> */
		if(root==null) 
			return;
		inorderRecursive(root.left);
		System.out.print(root.key + "\t");
		inorderRecursive(root.right);	
	}
	
	private static void postorderRecursive(Node root) {

		/* <left> <right> <root>*/
		if(root==null) 
			return;
		postorderRecursive(root.left);
		postorderRecursive(root.right);	
		System.out.print(root.key + "\t");
	}

	private void deleteNode(int keyToDelete) {
		Node current = root;
		Node parent =null;
		while(current != null) {
			if(keyToDelete < current.key) {
				parent=current;
				current=current.left;
			}else if(keyToDelete > current.key){
				parent=current;
				current=current.right;
			}else {
				//node with no children
				if(current.left==null && current.right==null) {
					if((parent.left!=null)&&(parent.left.key == current.key)) {
						parent.left=null;
					}else if((parent.right!=null)&&(parent.right.key == current.key)) {
						parent.right=null;
					}
				}
				//node with 1 child
				else if(current.left==null) {
					if((parent.left!=null)&&(parent.left.key == current.key)) {
						parent.left=current.right;
					}else if((parent.right!=null)&&(parent.right.key == current.key)) {
						parent.right=current.right;
					}
				}else if(current.right==null) {
					if((parent.left!=null)&&(parent.left.key == current.key)) {
						parent.left=current.left;
					}else if((parent.right!=null)&&(parent.right.key == current.key)) {
						parent.right=current.left;
					}
				}
				//node with 2 children
				else {
					if(root.key==keyToDelete) {
						Node maximumNode = findMaximumBST(current.left);
						deleteNode(maximumNode.key);
						current.key = maximumNode.key;
					}else {
						Node minimumNode = findMinimumBST(current.left);
						deleteNode(minimumNode.key);
						current.key = minimumNode.key;
					}
				}
				break;
			}
		}
		
	}
	
	private Node findMaximumBST(Node current) {
		while(current.right != null) {
			current = current.right;
		}
		return current;
	}

	/**
	 * Just traverse the node from root to left recursively until left is NULL. 
	 * The node whose left is NULL is the node with minimum value.
	 */
	private Node findMinimumBST(Node current) {
		while(current.left != null) {
			current = current.left;
		}
		return current;
	}

	private void searchKey(int key) {
		Boolean found = false;
		Node current = root;
		while(current != null) {
			if(current.key == key) {
				found = true;
				break;
			}else if(key < current.key){
				current = current.left;
			}else {
				current = current.right;
			}
		}
		if(found) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
		
	}

	void addNodes(int key) {
		if(root==null) {
			root = new Node(key);	
		}
		else {
			Node current = root;
			Node parent=null;
			while(current!=null) {
				parent=current;
				if(key < current.key) {
					current=current.left;
				}else {
					current=current.right;
				}
			}
			if(key<parent.key) {
				parent.left=new Node(key);
			}else {
				parent.right=new Node(key);
			}		
		}
	}
	static void print2DUtil(Node root,int space) 
	{ 
	    // Base case 
	    if (root == null) 
	        return; 
	  
	    // Increase distance between levels 
	    space += Node.COUNT; 
	  
	    // Process right child first 
	    print2DUtil(root.right, space); 
	  
	    // Print current node after space 
	    // count 
	    System.out.println();
	    for (int i = Node.COUNT; i < space; i++) 
	        System.out.print(" "); 
	    System.out.println(root.key); 
	  
	    // Process left child 
	    print2DUtil(root.left, space); 
	} 

}
