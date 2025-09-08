package exercise;

public class num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { 
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int allLength = 0;
		
		for(int i=0; i<array.length; i++) {
			allLength += array[i].length;
			for(int k=0; k<array[i].length; k++) {
				sum += array[i][k];
				
			}
		}
		double avg = (double)sum / allLength;
		System.out.println(avg);
		System.out.println(sum);
	}
}
