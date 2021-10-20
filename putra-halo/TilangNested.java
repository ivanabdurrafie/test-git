class TilangNested{
	public static void main(String[] args) {	

	boolean Pelanggaran = true;
	boolean STNK = true;
	boolean SIM = false;


	//cek apakah dia akan ditilang atau tidak
	if (SIM == true){
		if (STNK == true){
			if (Pelanggaran == true)
			  System.out.println("Tidak Ditilang.");
			else
			  System.out.println("Anda Ditilang.");
		}
		else
			  System.out.println("Anda Ditilang.");
	}
	else  System.out.println("Anda Ditilang.");
	
	}
}