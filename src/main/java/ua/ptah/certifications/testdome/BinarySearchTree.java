package ua.ptah.certifications.testdome;

class Node {
  int value;
  Node left, right;

  Node(int value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
}

/*
 * Implement the contains(Node root, int value) method in a time efficient manner
 */

class BinarySearchTree {
  static boolean contains(Node root, int value) {
    if (root == null) {
      return false;
    }
    else {
      if (root.value == value) {
        return true;
      }
      if ((root.value > value)) {
        return contains(root.left, value);
      }
      else {
        return contains(root.right, value);
      }
    }
  }
}