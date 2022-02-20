public class File {
	public static void readFile() {
		File file = new File ("/*YOUR FILE PATH GOES HERE*/");
		try 
		{
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine())
			{
				String text = sc.nextLine();
				System.out.println(text);
			}
			sc.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
