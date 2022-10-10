package connect;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution2 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect1(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-->0) {
                Node node = queue.remove();
                if (size >= 1) {
                    node.next = queue.peek();
                    if(node.left!=null) queue.add(node.left);
                    if(node.right!=null) queue.add(node.right);
                }
            }
        }
        return root;
    }


    public Node connect(Node root) {
        if(root == null){
            return root;
        }

        Node L = root.left;
        Node R = root.right;
        if(L != null){
            if(R != null){
                L.next = R;
            }else{
                L.next = find(root);
            }
        }
        if(R != null){
            R.next = find(root);
        }

        connect(root.right);
        connect(root.left);
        return root;
    }

    Node find(Node root){
        while(root.next != null){
            root = root.next;
            if(root.left != null) return root.left;
            if(root.right != null) return root.right;
        }

        return null;
    }
}
