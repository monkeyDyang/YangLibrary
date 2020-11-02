package yy;

/* 快速排序 */
public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {4,2,1,5,7,8,9,3,4,6};
        for (int i:arr){
            System.out.print(i);
        }
        System.out.println("\n--------------------------------");
        quickSort(arr,0,arr.length-1);

        for (int i:arr){
            System.out.print(i);
        }
    }

    public static void quickSort(int[] arr, int left, int right){

        int i,j,temp,flag;

        // 相遇时当前排序结束
        if (left > right)
            return;

        i = left;
        j = right;
        // 左边第一个作为基准
        flag = arr[left];

        // 左右两个标志向中间移动
        while (i<j){
            // 先找右边
            while (arr[j] >= flag && i<j)
                j--;
            // 再找左边
            while (arr[i] <= flag && i<j)
                i++;
            // 交换满足条件的两个数
            if (i<j){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // 交换基准数与i，j相等的位置的数
        arr[left] = arr[i];
        arr[i] = flag;

        // 递归左半数组
        quickSort(arr,left,i-1);
        // 递归右半数组
        quickSort(arr,i+1,right);

    }
}
