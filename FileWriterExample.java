import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("C:\\Users\\Ranjeet\\Desktop\\secret_message.txt");
			writer.write("Roses are red \n Violets are blue \n Smelly cattt");
			writer.append("HEyyy how u doinnn!");
			writer.close();
					
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
