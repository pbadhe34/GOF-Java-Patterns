class  TestSingleTon
{
	public static void main(String[] args) 
	{
		SingletonClass s1 = new SingletonClass();

		SingletonClass  s = SingletonClass.getObject();
		String result = "" + s.getValue();
		System.out.println(result);
		
		SingletonClass s2 = SingletonClass.getObject();
		s2.setValue(9);

		result = "" + s.getValue();
		System.out.println(result);
     
	}
}
