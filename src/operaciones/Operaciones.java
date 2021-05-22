package operaciones;

public class Operaciones {

    /**
     * El método rango recibe 2 numeros enteros y devuelve un array los valores
     * enteros comprendidos entre los dos parámetros (ambos incluidos) en orden
     * de menor a mayor, si el primero es mayor que el segundo, debe calcularlo
     * igualmente de menor a mayor.
     *
     * @param a int
     * @param b int
     * @return int [] nums
     */
    public int[] rango(int a, int b) {
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }
        int[] nums = new int[(b - a)+1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a + i;
        }
        return nums;
    }

    /**
     * Recibe 2 numeros enteros y devulve la suma de los valores comprendidos
     * entre los dos parámetros (ambos incluidos), si el primero es mayor que el
     * segundo devuelve el mismo resultado.
     *
     * @param a int
     * @param b int
     * @return sum int
     */
    public int sumRango(int a, int b) {
        int sum = 0;
        if (a>b) {
           int aux = a;
            a = b;
            b = aux; 
        }
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Recibe un número entero y devuelve un boolean, true si es par, false si
     * es impar y IllegalArgumentException si es negativo o 0.
     *
     * @param a int
     * @return boolean
     */
    public boolean isPar(int a) {
        if (a<=0) {
            throw new IllegalArgumentException();
        } else if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     * Recibe un array de numeros enteros y devuelve otro array con los numeros
     * positivos, si esta vacio devuelve un array vacio y si es null devuelve
     * IllegalArgumentException.
     *
     * @param nums
     * @return int [] positivos
     */
    public int[] extraerPositivos(int[] nums) {

        if (nums == null) {
         throw new IllegalArgumentException();   
        }
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
