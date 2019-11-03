
public class LotteryTicket {
	public static void main(String[]args){
		
		System.out.println("Powerball Numbers: ");
		
		for(int x=0; x<5;x++){
			
		int randomNum = 1 + (int)(Math.random() * ((69 - 1) + 1));
			
			System.out.println(randomNum);
			
			
		}
		int powerBall = 1 + (int)(Math.random() * ((26 - 1) + 1));
		System.out.println("Powerball: " + powerBall + "\n");
		
		
		
		System.out.println("Mega millions: ");

		for(int j=0; j<5;j++){
			
		int randomNum2 = 1 + (int)(Math.random() * ((70 - 1) + 1));
			
			System.out.println(randomNum2);
			
			
		}
		int powerBall2 = 1 + (int)(Math.random() * ((25 - 1) + 1));
		System.out.println("Megaball: " + powerBall2 + "\n");
		
		int power1 = 1 + (int)(Math.random() * ((69 - 1) + 1));
		int power2 = 1 + (int)(Math.random() * ((69 - 1) + 1));
		int power3 = 1 + (int)(Math.random() * ((69 - 1) + 1));
		int power4 = 1 + (int)(Math.random() * ((69 - 1) + 1));
		int power5 = 1 + (int)(Math.random() * ((69 - 1) + 1));
		int powerNum = 1 + (int)(Math.random() * ((26 - 1) + 1));
		
		System.out.println("PowerBall numbers: ");
		
		if(power1==power2){
			power1 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power1);
		}
		else if(power1==power3){
			power1 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power1);
		}
		else if(power1==power4){
			power1 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power1);
		}
		else if(power1==power5){
			power1 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power1);
		}
		else{System.out.println(power1);
		}
		
		
		if(power2==power1){
			power2 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power2);
		}
		else if(power2==power3){
			power2 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power2);
		}
		else if(power2==power4){
			power2 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power2);
		}
		else if(power2==power5){
			power2 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power2);
		}
		else{System.out.println(power2);
		}
		
		
		if(power3==power1){
			power3 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power3);
		}
		else if(power3==power2){
			power3 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power3);
		}
		else if(power3==power4){
			power3 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power3);
		}
		else if(power3==power5){
			power3 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power3);
		}
		else{System.out.println(power3);
		}
		
		if(power4==power1){
			power1 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power4);
		}
		else if(power4==power2){
			power1 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power4);
		}
		else if(power4==power3){
			power1 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power4);
		}
		else if(power4==power5){
			power1 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power4);
		}
		else{System.out.println(power4);
		}
		
		if(power5==power1){
			power5 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power5);
		}
		else if(power5==power2){
			power5 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power5);
		}
		else if(power5==power3){
			power5 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power5);
		}
		else if(power5==power4){
			power5 = 1 + (int)(Math.random() * ((69 - 1) + 1));
			System.out.println(power5);
		}
		else{System.out.println(power5);
		}
		System.out.println("Powerball: " + powerNum);
		}
		
	}
	
	
	




