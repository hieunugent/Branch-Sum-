# Branch-Sum-
- write a function that take a binary tree and return an sum of each branch of the tree,
- a branch is the define as a root and end as a leaf. sum of all node in a branch will be a result for each branch
- the sum will start from left node leaf to the most right node leaf.
# Solution
- from the promtp I consider DFS for this solution since it will travel to the most left node to the right left node
- declare a new array to hold the result, add each  travel add sum up the value, when the travel to the leaf add the avalue to the array.
- time complexity: O(N)
- space: bounded of O(N)
# Pseudocode 
- Method BranchSums :
  - define a public function that call branchSums take parameter root as Type BinaryTree 
  - declare a List<Integer> where to hold the result
  - call a helper methods name CalculateBranchSums(root, sum, sums)
  - return the sums 
   
 - Helper Method CalculateBranchSums : 
    - Parameter:
       - root as current node type BinaryTree
       - sum is current sum of branch type int
       - sums is list result of sum branch.
    - if node is null return
    - declare a tempsum variable to hole the sum that will not lose when process to the right or the left of the current node
      - the value of the tempsum = sum + currentnode.value
    - if current node does not have any children node, the result of tempsum will add into the sums list.
    - else continue with the left node recursive.
    - and then the right node recursive with the CalculateBranchSums methods.
  
    

