class Solution {
    //The general approach is explained in the video: https://www.youtube.com/watch?v=5wSXA6qn4BI
    //Though ahead I will try my best to explain the approach to you.

    //The general approach is to first construct a tree, the find the answer.
	class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private long score = 0L;
		private int nodeCount = 0;

	}

	private int countNodes (TreeNode root) {
		if (root == null) {
			return 0;
		}
		root.nodeCount = countNodes(root.left) + countNodes(root.right) + 1;

		return root.nodeCount;
	}


	public int countHighestScoreNodes(int[] parents) {
		long max = 0l;
        int n = parents.length;
		int ans = 0;
		
        //Below we are creating a tree.
        TreeNode[] tree = new TreeNode[n];
        for (int i = 0; i < parents.length; i++) {
			tree[i] = new TreeNode();
		}
        //Here we are declaring the childs of each parent.
		for (int i = 1; i < parents.length; i++) {
			int parentId = parents[i];
			if (tree[parentId].left == null) {
				tree[parentId].left = tree[i];
			} else {
				tree[parentId].right = tree[i];
			}
		}
        //Here we are performing node count.
		countNodes(tree[0]);

        //Here we will solve for the anwer
		for (int i = 0; i < parents.length; i++) {
			long product = 1;
			int leftCnt = tree[i].left == null ? 0 : tree[i].left.nodeCount;
			int rightCnt = tree[i].right == null ? 0 : tree[i].right.nodeCount;
			int parentCnt = n - 1 - leftCnt - rightCnt;

			if (leftCnt > 0) {
				product *= leftCnt;
			}
			if (rightCnt > 0) {
				product *= rightCnt;
			}
			if (parentCnt > 0) {
				product *= parentCnt;
			}
			tree[i].score = product;
			max = Math.max(max, product);
		}

		//count nodes
		for (int i = 0; i < parents.length; i++) {
			if (tree[i].score == max) {
				ans++;
			}
		}
		return ans;
	}


}