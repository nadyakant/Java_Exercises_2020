import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String[] phrases= {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
		String[] events={"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
		String [] authors={"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
		String[] cities={"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
		Random random=new Random();
		int counter=Integer.parseInt(scanner.nextLine());
		for(int i=1;i<=counter;i++) {
			String text1=phrases[random.nextInt(phrases.length-1)];
			String text2=events[random.nextInt(events.length-1)];
			String text3=authors[random.nextInt(authors.length-1)];
			String text4=cities[random.nextInt(cities.length-1)];
		System.out.println(text1+" "+text2+" "+text3+" - "+text4);
		}
	}

}
