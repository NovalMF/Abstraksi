public class TurunanHewan extends Hewan{
	protected void printNama(){
		System.out.println("Nama Hewan = "+super.getNama());
	}
	protected void printSuara(){
		System.out.println("Suara Hewan = "+super.getSuara());
	}
	
}