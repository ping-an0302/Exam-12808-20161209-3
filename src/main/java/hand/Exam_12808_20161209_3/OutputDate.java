package hand.Exam_12808_20161209_3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class OutputDate {

	@SuppressWarnings("deprecation")
	public static int test(String date){
		String[] split = date.split("-");
		int y = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		int d = Integer.parseInt(split[2]);
		System.out.println(m);
		
		//时间不够了 闰年的情况没考虑
		if(m==1){
			return d;
		}else if(m==2){
			return 31+d;
		}else if(m==3){
			return 31+29+d;
			
		}else if(m==4){
			return 31+29+31+d;
			
		}else if(m==5){
			return 31+29+31+30+d;
			
		}else if(m==6){
			return 31+29+31+30+31+d;
			
		}else if(m==7){
			return 31+29+31+30+31+30+d;
			
		}else if(m==8){
			return 31+29+31+30+31+30+31+d;
			
		}else if(m==9){
			return 31+29+31+30+31+30+31+31+d;
			
		}else if(m==10){
			return 31+29+31+30+31+30+31+31+30+d;
			
		}else if(m==11){
			return 31+29+31+30+31+30+31+31+30+31+d;
			
		}else{
			return 31+29+31+30+31+30+31+31+30+31+30+d;
			
		}
	}
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入日期：");
		String date = scan.nextLine();
		int day = test(date);
		System.out.println("你输入的日期是当年的第"+day+"天");
	}
}
