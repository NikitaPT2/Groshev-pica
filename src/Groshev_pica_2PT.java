import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Groshev_pica_2PT {

	public static void main(String[] args) {
		 UIManager.put("OptionPane.background",new ColorUIResource(255,191,0));
		 UIManager.put("Panel.background",new ColorUIResource(255,191,0));
		 int izvele, apturet = 0;
		do{
			UIManager.put("OptionPane.yesButtonText", "Jā");
			UIManager.put("OptionPane.noButtonText", "Nē, apturēt programmu");
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

