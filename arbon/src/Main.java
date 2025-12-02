import Node.Node;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(6);
        Node node1 = new Node(4);
        Node node2 = new Node(1);
        Node node3 = new Node(5);
        Node node4 = new Node(8);
        Node node5 = new Node(9);

        root.left = node1;
        root.right = node4;

        node1.left = node2;
        node1.right = node3;

        node4.right = node5;

        insert(root, 7);
        inorder(root);
    }

    public static void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }

    public static void preorder(Node node) {
        if(node == null) {
            return;
        }

        System.out.println(node.value);
        preorder(node.left);
        preorder(node.right);
    }

    public static void postorder(Node node) {
        if(node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value);
    }

    public static void insert(Node node, int value) {
        if(node == null) {
            return;
        }

        if(value >= node.value) {
            if(node.right == null) {
                Node newNode = new Node(value);
                node.right = newNode;
            } else {
                insert(node.right, value);
            }
        } else if (value <= node.value) {
            if(node.left == null) {
                Node newNode = new Node(value);
                node.left = newNode;
            } else {
                insert(node.left, value);
            }
        }
    }

    public static Node find(Node node, int value) {
        if(node == null) {
            return null;
        }

        if(node.value == value) {
            return node;
        }
        return node;
    }
}