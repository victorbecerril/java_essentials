package src1;

public class Cough4 {

	public static void main(String args[])
	{
		cough(5);
		sneeze(3);
	}

	public static void cough(int n)
	{
		say("cough", n);

	}

	public static void say(String word, int n)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.print(word + "\n");
		}

	}

	public static void sneeze(int n)
	{
		say("achoo!", n);

	}
}

