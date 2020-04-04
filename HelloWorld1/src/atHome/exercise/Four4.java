package atHome.exercise;

public class Four4 {
	public static void main(String[] args) {
//		int dice1 = (int)(Math.random()*6)+1;
//		System.out.println(dice1);
		
		boolean run = true;
		while(run) {
			int dice1 = (int)(Math.random()*6)+1; //주사위 두개 던짐
			int dice2 = (int)(Math.random()*6)+1;
			
			if(dice1+dice2==5) {
				System.out.println("("+dice1+","+dice2+")");
				break; //주사위 두개의 눈의 합이 5이면 while문 종료
			} else {
				System.out.println("("+dice1+","+dice2+")");
			}
			
//			if(dice1==1 && dice2==4) {
//				System.out.println("("+dice1+","+dice2+")");
//				break;
//			} else if(dice1==4 && dice2==1) {
//				System.out.println("("+dice1+","+dice2+")");
//				break;
//			}else if(dice1==2 && dice2==3) {
//				System.out.println("("+dice1+","+dice2+")");
//				break;
//			}else if(dice1==3 && dice2==2) {
//				System.out.println("("+dice1+","+dice2+")");
//				break;
//			}else {
//				System.out.println("("+dice1+","+dice2+")");
//			}
		}
		
		

	}
}
