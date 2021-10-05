

class JavaAccessModifier2
{
	public int x = 2;
	int y = 4;
	protected int w = 6;
	private int z = 8;
}

public class JavaAccessModifier
{
	
	public static void main(String[] args)
	{
		JavaAccessModifier2 obj = new JavaAccessModifier2();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.w);
		//System.out.println(obj.z);
	}
}

