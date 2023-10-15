package org.utz.offer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Pb044LargestValuesTest {

    @Test
    void largestValues() {
        Pb044LargestValues.TreeNode root = new Pb044LargestValues.TreeNode(1);
        Pb044LargestValues.TreeNode l11 = new Pb044LargestValues.TreeNode(3);
        Pb044LargestValues.TreeNode l12 = new Pb044LargestValues.TreeNode(2);
        Pb044LargestValues.TreeNode l21 = new Pb044LargestValues.TreeNode(5);
        Pb044LargestValues.TreeNode l22 = new Pb044LargestValues.TreeNode(3);
        Pb044LargestValues.TreeNode l24 = new Pb044LargestValues.TreeNode(9);
        root.left = l11;
        root.right = l12;
//        l11.left = l21;
//        l11.right = l22;
//        l12.right = l24;
        Pb044LargestValues pb = new Pb044LargestValues();
        List<Integer> integers = pb.largestValues(null);
        System.out.println(integers);
    }
}