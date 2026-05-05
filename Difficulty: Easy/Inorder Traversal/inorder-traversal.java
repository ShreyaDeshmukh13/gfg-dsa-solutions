class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    public void inOrder(Node node, List<Integer> result) {
        if (node == null) return;

        inOrder(node.left, result);
        result.add(node.data);
        inOrder(node.right, result);
    }
}