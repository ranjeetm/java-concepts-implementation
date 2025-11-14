import java.io.File;


public class FileClass {

	public static void main(String[] args) {
		// file = An abstract representation of file and directory pathnames
		File file = new File("C:\\Users\\Ranjeet\\Desktop\\secret_message.txt");
		
		if(file.exists()) {
			System.out.println("That file exsists :o !");
			System.out.println(file.getAbsolutePath() );
			//file.delete();
			System.out.println(file.isFile());
		}
		else {
			System.out.println("That file does not exsist :(");
		}
		 

	}

}
