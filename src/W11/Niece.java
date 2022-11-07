package W11;

import java.util.*;

public class Niece implements Comparable<Niece> {
	private String name;
	private int birthDay;
	private int birthMonth;
	Map<Uncle, String> presents = new HashMap<Uncle, String>();
	
	public void setNieceData(String name, int day, int month) {
		this.name = name;
		this.birthDay = day;
		this.birthMonth = month;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	//menghapus semua hadiah yang dipilih oleh niece ini. return nomor penghapusan
	public int clearPresents() {
		presents.clear();
		System.out.println("List "  + name + " berhasil di hapus");
		return presents.size();
	}
	
	//menampilkan hadiah yang siberikan melalui akun ini dan penerimanya
		// niece yang tidak memberi hadiah juga dimasukkan pada list
	public void listPresents() {
		System.out.println("Hadiah untuk " + this.name + ": ");
		for(Map.Entry<Uncle, String> entry : presents.entrySet()) {
			System.out.print("- Dari paman " + entry.getKey().getName());
			System.out.println((entry.getValue()==null? " Tidak menerima hadiah": " menerima " + entry.getValue()));
		}
	}
	
	public Map<Uncle, String> getPresents() {
		return this.presents;
	}
	
	@Override
	public String toString() {
		return "Nama: " + name + "(birth: " + birthDay + "/" + birthMonth;
	}
	
	@Override
	public int compareTo(Niece another) {
		if(this.birthMonth > another.birthMonth) {
			return 1;
		}
		else if(this.birthMonth == another.birthMonth) {
			return (this.birthDay > another.birthDay? 1: -1);
		}
		return -1;
	}
}
