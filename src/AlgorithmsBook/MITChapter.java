package AlgorithmsBook;
import java.lang.Math;

public class MITChapter {
	public static void main(String[] args){
		int help = 1000000;
		long[] n = {help, 60*help, 3600*help, 24*3600*help, 720*3600*help, 365*720*3600*help, 36500*720*3600*help};
		print(n);
	}
	
	public static void print (long[] array){
		for(int i = 0; i < array.length; ++i)System.out.println(array[i]);
	}
}
