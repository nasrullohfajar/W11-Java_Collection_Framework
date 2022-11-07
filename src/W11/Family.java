package W11;
import java.util.*;

public class Family {

	private Set<Uncle> uncles;
	private Set<Niece> nieces;
	
	//Family() -> create an empty family with no uncles, nieces or presents	
	Family() {
		uncles = new HashSet<Uncle>();
		nieces = new HashSet<Niece>();
	}
	
	
	//addNiece(java.lang.String name, int day, int month) -> add new niece. If there is already an niece of this name,
	//false is returned and nothing is added 
	public boolean addNiece(String name, int day, int month) {		
		if(this.findNiece(name) == null) {
			Niece niece = new Niece();
			niece.setNieceData(name, day, month);
			nieces.add(niece);
			return true;
		}
		
		System.out.println("Data sudah tersedia");
		return false;
	}
	
	
	//addUncle(java.lang.String name) -> add new uncle. If there is already an uncle of this name,
	//false is returned and nothing is added 
	public boolean addUncle(String name) {
		if(this.findUncle(name) == null) {
			Uncle uncle = new Uncle();
			uncle.setDataUncle(name);
			uncles.add(uncle);
			return true;
		}
		System.out.println("Data sudah tersedia");
		return false;
	}
	
	
	//findNiece(java.lang.String name) ->lookup a niece by name; return null if not found
	public Niece findNiece(String name) {
		if(!nieces.isEmpty()) {
			Iterator<Niece> iterator = nieces.iterator();
			while(iterator.hasNext()) {
				Niece niece = iterator.next();
				if(niece.getName().equals(name)) {
					return niece;
				}
			}
		}
		return null;
	}
	
	
	//findUncle(java.lang.String name) ->lookup a uncle by name; return null if not found
	public Uncle findUncle(String name) {
		if(!uncles.isEmpty()) {
			Iterator<Uncle> iterator = uncles.iterator();
			while(iterator.hasNext()) {
				Uncle uncle = iterator.next();
				if(uncle.getName().equals(name)) {
					return uncle;
				}
			}
		}
		return null;
	}
	
	
	//listNieces() -> list (to the console) the niece recorded
	public void listNieces() {
		TreeSet<Niece> sortedNieces = new TreeSet<Niece>(nieces);
		if(sortedNieces.isEmpty()) {
			System.out.println("Data Niece Kosong");
		}
		else {
			System.out.println(sortedNieces);
		}
	}
	
	
	//listNieces() -> list (to the console) the niece recorded
	public void listUncles() {
		TreeSet<Uncle> sortedUncles = new TreeSet<Uncle>(uncles);
		if(sortedUncles.isEmpty()) {
			System.out.println("Data Uncle Kosong");
		}
		else {
			System.out.println(sortedUncles);
		}
	}
}

