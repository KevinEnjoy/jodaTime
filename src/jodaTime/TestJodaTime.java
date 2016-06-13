package jodaTime;


import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.LocalDate;


/***
 * https://github.com/JodaOrg/joda-time
 * http://www.ibm.com/developerworks/cn/java/j-jodatime.html
 * http://www.joda.org/joda-time/
 * 
 */
public class TestJodaTime {

	public static long time = Long.valueOf("1465798229208");

	public static void main(String[] args) {
		
		//System.out.println(System.currentTimeMillis());
		initDataTime();
		//currentTime();
		//formatTimeMillis();
		//afterDay();
	}
	
	/**
	 * ��ʼ��һ��ʱ��
	 */
	public static void initDataTime(){
		DateTime dateTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
		System.out.println(dateTime.toString());
		//2000-01-01T00:00:00.000+08:00
	}
	
	/**
	 * ���� ʱ��� 45 ��֮���ĳ������һ���µĵ�ǰ�ܵ����һ�������
	 */
	public static void afterDay(){
		
		DateTime dateTime = new DateTime(time);
		System.out.println(dateTime.plusDays(45).plusMonths(1).dayOfWeek()
				  .withMaximumValue().toString("E MM/dd/yyyy HH:mm:ss.SSS"));
		
		System.out.println(dateTime.plusDays(5)
				  .toString("E MM/dd/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	 * ��һ�������ʱ���ת��Ϊ����
	 */
	public static void formatTimeMillis(){
		
		//����ĳ�������ʱ�̵Ķ���
		DateTime dateTime = new DateTime(time);
		System.out.println(dateTime.toString("yyyy-MM-dd HH:mm:ss"));
	}
	
	public static void currentTime(){
		
		System.out.println("ʱ�����"+DateTimeUtils.currentTimeMillis());
		
		DateTime dateTime = new DateTime();
        System.out.println("����ʱ����"+dateTime.toString());
        
        LocalDate localDate = new LocalDate();
        System.out.println("������ʱ����"+localDate.toString());
        
	}
}
