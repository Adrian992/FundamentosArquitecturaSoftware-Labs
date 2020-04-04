package usuario;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.Date;

public class LeeObjeto {
	public static void main(String[] args) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.out"));
			System.out.println("Recupero el objetivo " + new Date());
			Usuario miusuario = (Usuario) in.readObject();
			System.out.println(miusuario);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
