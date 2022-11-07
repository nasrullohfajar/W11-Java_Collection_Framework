package W11;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Family fam = new Family();
		List<Niece> nieces = new ArrayList<Niece>();
		List<Uncle> uncles =  new ArrayList<Uncle>();
		
		System.out.println("[EMPTY FAMILY]");
		System.out.print("keponakan	: " ); fam.listNieces();
		System.out.print("paman		: " ); fam.listUncles();
		System.out.print("\n-------------------------------------------------------------\n\n");
		
		//menambah keponakan
		fam.addNiece("Arthur", 10, 3);
		fam.addNiece("Pendragon", 3, 10);
		fam.addUncle("Lancelot");
		fam.addUncle("Lucaz");		
		
		System.out.print("[LIST KEPONAKAN]\n" );
		fam.listNieces();
		System.out.print("\n-------------------------------------------------------------\n\n");
		
		
		System.out.print("[LIST PAMAN]\n");
		fam.listUncles();
		System.out.print("\n-------------------------------------------------------------\n\n");
		
		
		System.out.println("[LIST HADIAH AWAL DITERIMA KEPONAKAN]");
		Niece niece1 = fam.findNiece("Arthur");
		Niece niece2 = fam.findNiece("Pendragon");
		Uncle uncle1 = fam.findUncle("Lancelot");
		Uncle uncle2 = fam.findUncle("Lucaz");
		
		nieces.add(niece1);
		nieces.add(niece2);
		uncles.add(uncle1);
		uncles.add(uncle2);
	
		for(int i = 0; i <nieces.size(); i++) {
			nieces.get(i).listPresents();
		}
		System.out.print("\n-------------------------------------------------------------\n\n");
	
		System.out.println("[LIST HADIAH AWAL DIBERIKAN PAMAN]");
		for(int i = 0; i < uncles.size(); i++) {
			uncles.get(i).listPresents();
		}
		System.out.print("\n-------------------------------------------------------------\n\n");
		
		
		System.out.println("[LIST HADIAH DITERIMA KEPONAKAN (BERBAGAI KONDISI)]");
		System.out.println("1. ketika hadiah sama");
		uncle1.addPresent(niece1, "blade of chaos");
		uncle1.addPresent(niece2, "blade of chaos");
		System.out.print("\n");
		
		
		System.out.println("2. ketika hadiah sudah diberikan oleh paman lain");
		uncle2.addPresent(niece1, "blade of chaos");
		System.out.print("\n");
		
		
		System.out.println("3. ketika hadiah berbeda");
		uncle2.addPresent(niece1, "Excalibur");
		uncle2.addPresent(niece2, "Blade of Olympus");
		System.out.print("\n");
		
		
		System.out.println("4. ketikamengubah hadiah yang sudah diterima");
		uncle2.addPresent(niece1, "Battle Axe");
		System.out.print("\n");
		
		
		System.out.println("5. ketika tidak memberi hadiah");
		uncle2.addPresent(niece1, null);		
		uncle1.addPresent(niece2, null);
		System.out.print("\n-------------------------------------------------------------\n\n");
		
		
		System.out.println("[LIST HADIAH YANG DITERIMA KEPONAKAN]");
		for(int i = 0; i <nieces.size(); i++) {
			nieces.get(i).listPresents();
			System.out.print("\n");
		}
		System.out.print("-------------------------------------------------------------\n\n");
		
		
		System.out.println("[LIST HADIAH YANG DIBERIKAN PAMAN]");
		for(int i = 0; i < uncles.size(); i++) {
			uncles.get(i).listPresents();
			System.out.print("\n");
		}
		System.out.print("-------------------------------------------------------------\n\n");
		
		
		System.out.println("[MENGHAPUS LIST HADIAH (KEPONAKAN 2)]");
		niece2.clearPresents();
		System.out.print("\n-------------------------------------------------------------\n\n");
		
		
		System.out.println("[LIST HADIAH FINAL YANG DITERIMA KEPONAKAN]");
		for(int i = 0; i <nieces.size(); i++) {
			nieces.get(i).listPresents();
		}
		System.out.print("\n-------------------------------------------------------------\n\n");
		
		
		System.out.println("LIST HADIAH FINAL YANG DIBERIKAN PAMAN");
		for(int i = 0; i < uncles.size(); i++) {
			uncles.get(i).listPresents();
			System.out.print("\n");
		}
	}
}
