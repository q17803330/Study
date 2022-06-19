import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int [] x = {2, 6, 4, 8, 10, 9, 15};
        int[] clone = x.clone();  //克隆数组
        Arrays.sort(clone);  //对克隆的数组进行排序
        int start = x.length;
        int end = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] != clone[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);      //返回end和i中较大的数
            }
        }

        System.out.println(end - start > 0 ? end - start + 1 : 0);
    }
}


