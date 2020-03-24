import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestBranchSum{
  public class MoreBinaryTree extends BranchSum.BinaryTree{
    MoreBinaryTree(int value){
      super(value);
    }
    MoreBinaryTree insert(List<Integer> values){
      return insert(values, 0);
    }
    MoreBinaryTree insert(List<Integer> values, int i){
      if(i >= values.size()) return null;

      List<MoreBinaryTree> queue = new ArrayList<MoreBinaryTree>();
      queue.add(this);
      while(queue.size() > 0){
          MoreBinaryTree current = queue.get(0);
          queue.remove(0);
          if(current.left == null){
            current.left = new MoreBinaryTree(values.get(i));
            break;
          }
          queue.add((MoreBinaryTree)current.left);
          if(current.right == null){
            current.right = new MoreBinaryTree(values.get(i));
            break;
          }
          queue.add((MoreBinaryTree)current.right);
      }
      insert(values, i+1);
      return this;
    }
  }
@Test
public void Testcase1(){
  MoreBinaryTree tree = new MoreBinaryTree(1);
  List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1));
  assertTrue(BranchSum.branchSums(tree).equals(expected));
}




}
