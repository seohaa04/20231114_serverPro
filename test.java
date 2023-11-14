package day20231114;


import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
	public static void main(String[] args) {
		 
		Date today = new Date();
		System.out.println( new SimpleDateFormat("yyyyMMdd").format(today) + "_서버프로그램 구현: 박서하");
	}
}

