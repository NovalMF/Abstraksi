public class MahasiswaTurunan extends Mahasiswa{
	
	protected void printNama(){
		System.out.println(super.getNama());
	}
	
	public static void main(String []args){
	MahasiswaTurunan a = new MahasiswaTurunan();
	a.printNama();
	}
}