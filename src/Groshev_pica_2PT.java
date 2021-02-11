import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Groshev_pica_2PT {

	public static void main(String[] args) {
		 int izvele, apturet = 0;
		do{
			izvele = JOptionPane.showConfirmDialog(null, "Vai Jūs grībat nopirkt picu?", "Pica!", JOptionPane.YES_NO_OPTION);
			switch(izvele){
			
			case JOptionPane.YES_OPTION:

			break;
			
			case JOptionPane.NO_OPTION:

			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Darbība nepastāv!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
			break;
			}
			
		}while(apturet!=1);
	}
	}

