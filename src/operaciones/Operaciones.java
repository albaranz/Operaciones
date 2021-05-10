package operaciones;

/**
 * (descripcion)
 *
 * @author alba
 * 
 */
public class Operaciones {

    /**
     *
     * @param a
     *      El valor a 
     * @param b
     *      
     * @return devuelve un array con los valores a y b
     */
    public int[] rango(int a, int b) {
        int[] nums = new int[b - a];
        for (int i = a; i < b; i++) {
            nums[i] = i;
        }
        return nums;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int sumRango(int a, int b) {
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     *
     * @param a
     * @return
     */
    public boolean isPar(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param nums
     * @return
     */
    public int[] extraerPositivos(int[] nums) {

        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                n++;
            }
        }

        int[] positivos = new int[n];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positivos[j] = nums[i];
                j++;
            }
        }
        return positivos;
    }

}
