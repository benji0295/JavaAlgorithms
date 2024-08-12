
public class TreeConstruction {

    // DO NOT MODIFY BinaryNode CLASS.
    public class BinaryCharNode {

        public Character element;
        public BinaryCharNode left;
        public BinaryCharNode right;

        BinaryCharNode() {
            element = null;
        }

        BinaryCharNode(Character n) {
            element = n;
        }

        // Update the code here
        public static void postorder(BinaryCharNode root) {
            // WRITE CODE HERE
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.element);
        }
    }

    // Update the code here
    public BinaryCharNode reconstructTree(String inorder, String preorder) {
        if (inorder.isEmpty() || preorder.isEmpty()) {
            return null;
        }

        char rootChar = preorder.charAt(0);
        BinaryCharNode rootNode = new BinaryCharNode(rootChar);
        int rootIndex = inorder.indexOf(rootChar);

        String leftInorder = inorder.substring(0, rootIndex);
        String rightInorder = inorder.substring(rootIndex + 1);
        String leftPreorder = preorder.substring(1, 1 + leftInorder.length());
        String rightPreorder = preorder.substring(1 + leftInorder.length());

        rootNode.left = reconstructTree(leftInorder, leftPreorder);
        rootNode.right = reconstructTree(rightInorder, rightPreorder);

        return rootNode;
    }

    public static void main(String args[]) {
        String inorder = "DBAECF";
        String preorder = "ABDCEF";

        BinaryCharNode root = new TreeConstruction().reconstructTree(inorder, preorder);

        // The cost must print out
        // D
        // B
        // E
        // F
        // C
        // A
        BinaryCharNode.postorder(root);
    }
}
