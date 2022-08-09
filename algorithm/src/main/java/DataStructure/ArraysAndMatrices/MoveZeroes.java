package DataStructure.ArraysAndMatrices;

/**   
 * @ClassName:  MoveZeroes
 * @Description:TODO(把数组中的 0 移到末尾)
 * @author:afujian
 * @date:2022年8月9日 下午3:26:50
 * For example, given nums = [0, 1, 0, 3, 12],
 * after calling your function, nums should be [1, 3, 12, 0, 0].
 */  
public class MoveZeroes {
	public static void main(String[] args) {
		int[] arrays = new int[] {0, 1, 0, 3, 12};
		int num = 0;
		for(int i = 0;i < arrays.length; i++) {
			if(arrays[i] != 0) {
				arrays[num++] = arrays[i];
			}
		}
		for(;num < arrays.length;) {
			arrays[num++] = 0;
		}
		
		for(int j = 0;j < arrays.length ;j++) {
			System.out.println(arrays[j]);
		}
	}
}
