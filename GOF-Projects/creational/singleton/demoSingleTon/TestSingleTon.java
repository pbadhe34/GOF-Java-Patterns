class  TestSingleTon
{
	public static void main(String[] args) 
	{
		//SingletonClass s1 = new SingletonClass();

		SingletonClass  s = SingletonClass.getObject();
		String result = "" + s.getValue();
		System.out.println("SingleTon result value for first object  is "+result);
		
		SingletonClass s2 = SingletonClass.getObject();

		System.out.println("\n Are these two SingletonClass objects equal ?");
		System.out.println(s.equals(s2));

		s2.setValue(9);

		result = "" + s.getValue();
		System.out.println("Now SingleTon result value for first object after modification by second reference is "+result);
		 
     
	}
}
