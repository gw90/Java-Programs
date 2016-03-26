import java.util.Random;
import javax.swing.JOptionPane;


public class battle {

	public static void main(String[] args) {
		int pEnergy = 0;
		int eEnergy = 0;
		int pHP = 50;
		int eHP = 80;
		Random generator = new Random();
		
		while(pHP>0){
			pEnergy++;
			JOptionPane.showMessageDialog(null,  "Name: Pikachu \nHP: "+pHP+" \nAttack: 40 \nEnergy: "+pEnergy+"\n1 energy: Do 50 damge to defending pokemon\n2 energy: Volt Tackle- You may discard 1 energy from Pikachu. If you do not, Pikachu does 10 damage to itself.",  "Your Pokemon", JOptionPane.DEFAULT_OPTION);
			String power = JOptionPane.showInputDialog(null, "TW=thunderbolt\nAT=Normal attack", "Power triggers", JOptionPane.INFORMATION_MESSAGE);
			if(power.equalsIgnoreCase("tw")){
				if(pEnergy >= 1){
					pEnergy--;
					eHP = eHP-50;
				}
				else{
					power = "at";
				}
			}
			if(power.equalsIgnoreCase("at")){
				eHP = eHP-40;
			}
			if(eHP<=0){
				JOptionPane.showMessageDialog(null, "You win!", "Win!", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			JOptionPane.showMessageDialog(null,  "Name: Electrode \nHP: "+eHP+" \nAttack: 10 \nEnergy: "+eEnergy+"\n1 Energy: Rollout- do 20 damage to defending pokemon.\n3 Energy: Lightning Strike do 30 damge to defending pokemon",  "Defending Pokemon", JOptionPane.INFORMATION_MESSAGE);
			eEnergy++;
			int random = generator.nextInt(3);
			String ePower = "Normal Attack";
			if(random==0){
				ePower = "Normal Attack";
				pHP=pHP-10;
			}
			if(random==1){
				if(1 <= eEnergy){
					ePower = "Rollout";
					pHP=pHP-20;
				}
				else{
					ePower = "Normal Attack";
					pHP=pHP-10;
				}
			}
			if(random==2){
				if(3 <= eEnergy){
					ePower = "Normal Attack";
					pHP=pHP-30;
				}
				else{
					ePower = "Normal Attack";
					pHP=pHP-10;
				}
			}

		
			JOptionPane.showMessageDialog(null, "Electrode did a "+ePower+".", "", JOptionPane.INFORMATION_MESSAGE);
			if(pHP<=0){
				JOptionPane.showMessageDialog(null, "You lose.", "Lose", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}
		}
	}

//}
