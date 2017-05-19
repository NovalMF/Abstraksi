public abstract class Hewan {
    protected String nama  = "Kucing";
    protected String suara = "Meong";

    protected String getNama(){
        return nama;
    }
    protected String getSuara(){
        return suara;
    }    
    protected abstract void printNama();
	
    protected abstract void printSuara();
}