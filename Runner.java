
public class Runner {

public static void main(String[] args) {

		Directions[] array = Directions.values();

		for (Directions handle : array) {
			System.out.println(handle);
			System.out.println(handle.getMotion());
			handle.printInfo();
		}
    

}
