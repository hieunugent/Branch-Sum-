import java.util.*;

class BranchSum{
  public static class BinaryTree{
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
  public static List<Integer> branchSums(BinaryTree root) {
  		List<Integer> sums = new ArrayList<Integer>();
  		CalculateBranchSums(root, 0, sums);
      return sums;
    }
  	public static void CalculateBranchSums(BinaryTree root, int sum, List<Integer> sums ){
  		if (root == null){
  			 return;
  		}
  		int tempSum = sum + root.value;
  		if ( root.left == null && root.right == null){
  			sums.add(tempSum);
  			return;
  		}
  		CalculateBranchSums(root.left, tempSum, sums);
  		CalculateBranchSums(root.right, tempSum, sums);
  	}

}
