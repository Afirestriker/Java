
//importing java package sample program

import mypack.MyPackage;
import mypack.subpack.MyPackSubPack;

public class ImportPack
{
	public static void main(String args[])
	{
		MyPackage obj = new MyPackage();
		MyPackSubPack obj1 = new MyPackSubPack();

		obj.msg();
		obj1.msg();
	}
}