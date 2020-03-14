 class ProtoBase 
{

	public ProtoBase()throws Exception
	{         
		 System.out.println("ProtoBase constructor delayed work..\n");
		 Thread.sleep(2000);
	}
	public String display()
	{
       return toString();
    }
}
