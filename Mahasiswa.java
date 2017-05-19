public abstract class Mahasiswa{		//kelas abstract
		protected String nama = "Noval Muhamad";
		protected String nim = "14111069";
		
		protected String getNama(){
			return this.nama;
		}
		
		protected String getNim(){
			return nim;
		}
		
		protected abstract void printNama(); //method abstract
}