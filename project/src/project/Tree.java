package project;

public class Tree {
	TreeNode rootNode;
	
	public Tree() {
		TreeNode a = new TreeNode();
		a.key = "A";
		TreeNode b = new TreeNode();
		b.key = "B";
		TreeNode c = new TreeNode();
		c.key = "C";
		TreeNode d = new TreeNode();
		d.key = "D";
		TreeNode e = new TreeNode();
		e.key = "E";
		TreeNode f = new TreeNode();
		f.key = "F";
		TreeNode g = new TreeNode();
		g.key = "G";
		TreeNode h = new TreeNode();
		h.key = "H";
		TreeNode i = new TreeNode();
		i.key = "I";
		rootNode = a; //a TreeNode를 받아옴
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		d.left = h;
		d.right = i;
	}
	
	void printNode(TreeNode N) {
		if(N != null) { // N 값이 비어있지 않으면
			System.out.print("(");
			printNode(N.left);
			System.out.print(N.key);
			printNode(N.right);
			System.out.print(")");
		}//else
			//System.out.println("제대로 실행되지 않음.");
	} // end printNode()
	
//	void printBST() {
//		printNode(rootNode);
//		System.out.println();
//	} // end printBST()
	
	void preordertraversal() { // rootNode 가 private 기 때문에
		preorder(rootNode);
	}
	
	void preorder(TreeNode T) {
		if(T != null) {
			System.out.print("->" + T.key);
			preorder(T.left);
			preorder(T.right);
		}
	}
	
	void inordertraversal() { // 동일
		inorder(rootNode);
	}
	
	void inorder(TreeNode T) {
		if(T != null) {
			inorder(T.left);
			System.out.print("->" + T.key);
			inorder(T.right);
		}
	}
	
	void postordertraversal() {
		postorder(rootNode);
	}
	
	void postorder(TreeNode T) {
		if(T != null) {
			postorder(T.left);
			postorder(T.right);
			System.out.print("->" + T.key);
		}
	}
	
	// 비순환 알고리즘
	void iter_inorder(TreeNode T) {
	    ArrayStack stk = new ArrayStack();
	    TreeNode node = T;
	    for ( ; ; ) {
	        for ( ; node!=null; node = node.left)
	            stk.push(node);  /* 스택에 삽입 */
	        node = (TreeNode)stk.pop(); /* 스택에서 삭제 */
	        if (node == null) break;        /* 공백 스택 */
	        System.out.print(node.key + " -> ");
	        node = node.right;
	    }
	}
	
	//need more
}
