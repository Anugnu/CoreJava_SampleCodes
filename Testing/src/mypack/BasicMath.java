package mypack;
import java.util.Arrays;

public class BasicMath {
	int numb[] = {3,10,5,90,25,32,12,24,10,4};
	int avg;
	int i;
	
	public static void main(String[] args) {
		BasicMath bm = new BasicMath();
		
		System.out.println("Avg = " + bm.average());
		bm.sortNumb();
		System.out.println("The smallest value is: " + bm.findSmallest());
	}
	
	public int average(){
		int num = 0;
		for(i = 0; i < numb.length; i++) {
			num = num + numb[i];
			avg = (num/numb.length);
		}
		return avg;
	}
	
	public void sortNumb() {
		/*int nx, ny;
		for(nx = 0; nx < numb.length; nx++) {
			for(ny = 0; ny < numb.length - 1; ny++) {
				if(numb[nx] > numb[ny])
				numb[nx] = numb[ny];
			}
		}*/
		Arrays.sort(numb);
		System.out.println("Array in Ascend: " + Arrays.toString(numb));
		System.out.println("Smallest number is " + numb[0]);
	}
	
	public int findSmallest() {
		int x = 99;
		
		for(int nx = 0; nx < numb.length; nx++) {
			if(x > numb[nx]) {
				x = numb[nx];
			}
		}
		
		return x;
	}
}