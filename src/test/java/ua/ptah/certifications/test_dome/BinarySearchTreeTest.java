package ua.ptah.certifications.test_dome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTreeTest {

  @Test
  void containsTest() {
    Node n1 = new Node(1, null, null);
    Node n3 = new Node(3, null, null);
    Node n2 = new Node(2, n1, n3);

    assertTrue(BinarySearchTree.contains(n1, 1));
    assertTrue(BinarySearchTree.contains(n2, 3));
    assertTrue(BinarySearchTree.contains(n2, 2));
    assertFalse(BinarySearchTree.contains(n3, 0));
    assertFalse(BinarySearchTree.contains(n1, 4));
    assertFalse(BinarySearchTree.contains(n2, -1));
  }
}