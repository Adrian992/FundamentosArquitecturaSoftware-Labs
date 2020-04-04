package lab12;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class CodeBase64 {
	
	public static void main(String[] arg) {
		Path originalPath = Paths.get("c:/data/bin/lab12", "test.pdf");
		Path targetPath = Paths.get("c:/data/bin/lab12", "encoded.txt");
		Base64.Encoder mimeEncoder = Base64.getMimeEncoder();
		
		try (OutputStream output = Files.newOutputStream(targetPath)){
			Files.copy(originalPath, mimeEncoder.wrap(output));
			OutputStream encodedStream = mimeEncoder.wrap(output);
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
				
				
	}
}
