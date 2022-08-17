package DataStructure.ArraysAndMatrices;

/**   
 * @ClassName:  ReshapeMatrix
 * @Description:TODO(改变矩阵维度)
 * @author:afujian
 * @date:2022年8月9日 下午3:45:17
 */  
/*
 * Input: nums = [[1,2], [3,4]] r = 1, c = 4
 * 
 * Output: [[1,2,3,4]]
 * 
 * Explanation: The row-traversing of nums is [1,2,3,4]. The new reshaped matrix
 * is a 1 * 4 matrix, fill it row by row by using the previous list.
 */
public class ReshapeMatrix {

	public int[][] matrixReshape(int [][] nums , int r , int x){
		int hight = nums.length;
		int wide = nums[0].length;
		if(hight * wide != r * x)
			return nums;
		int [][] new_nums = new int[r][x];
		int index = 0;
		for(int i = 0;i < nums.length;i++) {
			for(int j = 0;j < nums[i].length;j++) {
				new_nums[index / r][index % r] = nums[i][j];
				index++;
			}
		}
		return new_nums;
	}

}
