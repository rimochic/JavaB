package helloworld;

public class practice {

	public static void main(String[] args) {
		int speed = 50;
		int speedlimit = 40;
		int point = 0;
		int diff = speed - speedlimit;
		if (diff <=0 && diff >= 5) {
			System.out.println("Godd driving ! No points will taken from your driving score");
		}
		else if (diff >5 && diff <= 10) {
			point=+2;
			System.out.println("You are exced the speed limit with " + diff + "\nThe total of points taken is :" + point );
			}

	}

}
