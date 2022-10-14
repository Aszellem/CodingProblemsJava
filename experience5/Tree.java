package experience5;

public class Tree {
    int data;
    Tree left;
    Tree right;

    Tree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Tree(int data, Tree left, Tree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    /**
     * name: dfsPreorder
     * 
     * @param root
     * 
     *             Inside: print the root value, then print the left subtree, then
     *             print the right subtree.
     */
    public void dfsPreorder(Tree root) {
        if (root == null)
            return;
        System.out.println(root.data);
        dfsPreorder(root.left);
        dfsPreorder(root.right);
    }

    /**
     * name: dfsInorder
     * 
     * @param root
     * 
     *             Inside: print the left subtree, then print the root value, then
     *             print the right subtree.
     */
    public void dfsInorder(Tree root) {
        if (root == null)
            return;
        dfsInorder(root.left);
        System.out.println(root.data);
        dfsInorder(root.right);
    }

    /**
     * name: dfsPostorder
     * 
     * @param root
     * 
     *             Inside: print the left subtree, then print the right subtree,
     *             then print the root value.
     */
    public void dfsPostorder(Tree root) {
        if (root == null)
            return;
        dfsPostorder(root.left);
        dfsPostorder(root.right);
        System.out.println(root.data);
    }
}