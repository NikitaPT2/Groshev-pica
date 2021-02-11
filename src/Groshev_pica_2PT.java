import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Groshev_pica_2PT {
	
	public static void pizza_izv(double price) {
	    Object reply1 = JOptionPane.showInputDialog(null, "Izvēlaties picu (30cm/50cm):", "Izvēlaties picu!",
	    JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Desu Pica (6€/11€)","Siera Pica (6€/11€)",
	    		"Veģetārā Pica (5€/10€)","BBQ Pica (7.50€/12.50€)","Havaju Pica (7.50€/12.50€)"}, "Pica");
	    
		UIManager.put("OptionPane.yesButtonText", "30 cm");
		UIManager.put("OptionPane.noButtonText", "50 cm");
		
		int reply = JOptionPane.showConfirmDialog(null, "Kads izmers?", "Izmers!", JOptionPane.YES_NO_OPTION);
	    if (reply1=="Desu Pica (6€/11€)" && reply==JOptionPane.YES_OPTION) {
			price=price+6;
	    }else if (reply1=="Desu Pica (6€/11€)" && reply==JOptionPane.NO_OPTION) {
			price=price+11;
	    }else if (reply1=="Siera Pica (6€/11€)" && reply==JOptionPane.YES_OPTION) {
			price=price+6;
	    }else if (reply1=="Siera Pica (6€/11€)" && reply==JOptionPane.NO_OPTION) {
			price=price+11;
	    }else if (reply1=="Veģetārā Pica (5€/10€)" && reply==JOptionPane.YES_OPTION) {
			price=price+5;
	    }else if (reply1=="Veģetārā Pica (5€/10€)" && reply==JOptionPane.NO_OPTION) {
			price=price+10;
	    }else if (reply1=="BBQ Pica (7.50€/12.50€)" && reply==JOptionPane.YES_OPTION) {
			price=price+7.50;
	    }else if (reply1=="BBQ Pica (7.50€/12.50€)" && reply==JOptionPane.NO_OPTION) {
			price=price+12.50;
	    }else if (reply1=="Havaju Pica (7.50€/12.50€)" && reply==JOptionPane.YES_OPTION) {
			price=price+12.50;
	    }else if (reply1=="Havaju Pica (7.50€/12.50€)" && reply==JOptionPane.NO_OPTION) {
			price=price+12.50;
	    }
    
	UIManager.put("OptionPane.cancelButtonText", "Nevajag");
    Object reply2 = JOptionPane.showInputDialog(null, "Izvēlaties dzeriens: ", "Dzeriens!",
    JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Cola 1,5l (1.95€)","Fanta 1,5l (1.95€)",
    		"Sprite 1,5l (1.95€)","Cola zero 1,5l (1.95€)","Ūdens 0,5l (0.70€)"}, "Dzerieni!");
    if (reply2=="Cola 1,5l (1.95€)") {
		price=price+1.95;
    }else if (reply2=="Fanta 1,5l (1.95€)") {
		price=price+1.95;
    }else if (reply2=="Sprite 1,5l (1.95€)") {
		price=price+1.95;
    }else if (reply2=="Cola zero 1,5l (1.95€)") {
		price=price+1.95;
    }else if (reply2=="Ūdens 0,5l (0.70€)") {
		price=price+0.70;
    }
    
    UIManager.put("OptionPane.cancelButtonText", "Nevajag");
    Object reply3 = JOptionPane.showInputDialog(null, "Izvēlaties mērces: ", "Mērces!",
    JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Tomātu mērce (0.25€)","BBQ mērce (0.25€)",
    		"Ķiploku mērce (0.25€)","Sinepju mērce (0.25€)"}, "Mērces!");
    if (reply3=="Tomātu mērce (0.25€)"||reply3=="BBQ mērce (0.25€)"||reply3=="Ķiploku mērce (0.25€)"||reply3=="Sinepju mērce (0.25€)") {
		price=price+0.25;
    }
    
JOptionPane.showMessageDialog(null, "Tagad jums vajag samaksat "+price+"€", "Cena!", JOptionPane.INFORMATION_MESSAGE);
	}
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
				pizza_izv(0);
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

