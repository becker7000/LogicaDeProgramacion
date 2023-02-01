import javax.swing.JOptionPane;

public class MiniLogin {

	public static void main(String[] args) {
		
		String contrasena = "Java1234";
		String contra_usuario = JOptionPane.showInputDialog("Escribe la contraseña: ");
		
		if(contrasena.equals(contra_usuario)) {
			JOptionPane.showConfirmDialog(null,"Acceso permitido...");
		}else {
			JOptionPane.showConfirmDialog(null,"Acceso denegado...");
		}
		
	}

}
