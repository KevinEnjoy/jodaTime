

[JodaOrg/joda-time](https://github.com/JodaOrg/joda-time)һ������ Java ƽ̨������ʹ�õĿ�Դʱ��/���ڿ�,��ʱ�������ֵ������ڹ������������.

���Գ��Լ�ִ��һ�´���

``
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
``

����������

[http://www.joda.org/joda-time](http://www.joda.org/joda-time/ )

[http://www.ibm.com/developerworks/cn/java/j-jodatime.html](http://www.ibm.com/developerworks/cn/java/j-jodatime.html)

