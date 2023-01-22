public class SumOfArray {
    public static void main(String args[]){
        double[] arr;
        arr = new double[5];
        arr[0] = 10.5;
        arr[1] = 20.2;
        arr[2] = 30.6;
        arr[3] = 40.1;
        double sum = 0.0;
        for(double ele : arr){
            sum = sum + ele;
        }
        System.out.println("Sum = " + sum);
    }
}
