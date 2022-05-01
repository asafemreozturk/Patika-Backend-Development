

public class Main
{
	public static void main(String[] args) {
	double[] arr={1,4,6,7,5,3,9};
        double harmonicArr=0.0;
        double average=0.0;
        for (double i:arr) {
            harmonicArr+=(1.0/i);
        }
        average=arr.length/harmonicArr;
        System.out.println("Harmonic Mean= "+average);
    }
	
}
