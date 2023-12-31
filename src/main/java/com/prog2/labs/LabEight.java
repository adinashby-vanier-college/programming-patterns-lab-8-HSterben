package com.prog2.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adinashby
 *
 */
public class LabEight {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

    }

    /**
     * Please refer to the README file for question(s) description
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightBranch = new ArrayList<>();

        if (root == null) {
            return rightBranch;
        }

        while (root != null) {
            rightBranch.add(root.val);
            root = root.right;

        }
        
        return rightBranch;
    }
}
