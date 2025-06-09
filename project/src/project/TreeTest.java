package project;

public class TreeTest {
	static void p() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		Tree t = new Tree();
		//t.printBST();
		t.printNode(t.rootNode); //rootNode private 삭제.
		
		p();
		t.preordertraversal();
		p();
		t.inordertraversal();
		p();
		t.postordertraversal();
		
	} // end main()
} // end TreeTest
