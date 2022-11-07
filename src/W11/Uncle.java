package W11;
import java.util.*;

public class Uncle implements Comparable<Uncle>{

	private String name;
	private Map<Niece, String> presents = new HashMap<Niece, String>();
	
	public void setDataUncle(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	//addPresent() -> menambah hadiah yang diberikan oleh uncle,
	//return true jika hadiah diterima
	public boolean addPresent(Niece recipient, String description) {
		System.out.print("Pemberian Hadiah " + description + " ke " + recipient.getName() + ": ");
		if(!presents.containsValue(description) && !recipient.getPresents().containsValue(description) || description == null) {
			presents.put(recipient, description);
			recipient.getPresents().put(this, description);
			System.out.println("Berhasil");
			return true;
		}
		System.out.println("Gagal");
		return false;
	}
	
	
	//menampilkan hadiah yang siberikan melalui akun ini dan penerimanya
	// niece yang tidak memberi hadiah juga dimasukkan pada list
	public void listPresents() {
		System.out.println("Hadiah uncle " + this.name + " ");
		for(Map.Entry<Niece, String> entry : presents.entrySet()) {
			System.out.print((entry.getValue()==null? "- Tidak ada hadiah untuk ": "- " + entry.getValue() + " untuk "));
			System.out.println(entry.getKey().getName());
		}
	}
	
	@Override
	public String toString() {
		return "nama: " + name;
	}
	
	@Override
	public int compareTo(Uncle another) {
		return name.compareTo(another.name);
	}
}
