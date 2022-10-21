package function_array;

//7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)

public class Random_Num_07 {
    public static void main(String[] args) {
        double[] val = new double[20];
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i<val.length; i++){
            val[i] = Math.random();
            val[i] =  ((int)Math.round(val[i]*100));
            System.out.println((int) val[i]);
            if (val[i] > max){
                max = val[i];
            }
            if (val[i] < min){
                min = val[i];
            }
        }
        System.out.println("Max number "+(int)max);
        System.out.println("Min value " +(int)min);
        for (int i = 0; i<val.length;i++){
            for (int j=i+1; j<val.length; j++){

                if (val[i] == val[j]){
                    System.out.println("Duplicate value "+(int)val[i]);
                }
            }

        }

    }
}
