import java.util.Arrays;

public class TargetTwoSum {
   public TargetTwoSum() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{2, 7, 11, 13};
      byte var2 = 9;
      int[] var3 = TargetTwoSum(var1, var2);
      System.out.println(Arrays.toString(var3));
   }

   public static int[] TargetTwoSum(int[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         for(int var3 = var2 + 1; var3 < var0.length; ++var3) {
            if (var0[var2] + var0[var3] == var1) {
               return new int[]{var2, var3};
            }
         }
      }

      return new int[]{-1, -1};
   }
}
