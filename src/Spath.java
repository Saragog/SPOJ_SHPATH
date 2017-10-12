import java.util.List;
import java.util.Scanner;

public class Spath {

	private static Scanner input;
	
	
	
	List<City> cities;
	
	private class City
	{
		String cityName;
		int cityIndex;
	}
	
	private void performOneTest()
	{
		
	}
	
	public static void main(String[] args)
	{
		int testNumber;
		input = new Scanner(System.in);
		Spath program = new Spath();
		testNumber = input.nextInt();
		while (testNumber-- > 0)
			program.performOneTest();
		return;
	}

}
