class Tilang{
	public static void main(String[] args) {	

	boolean Pelanggaran = true;
	boolean STNK = true;
	boolean SIM = false;

	//cek apakah dia akan ditilang atau tidak
	if (SIM == true && STNK == true && Pelanggaran == true){
		System.out.println("Tidak Ditilang.");
	}
	else {
		System.out.println("Anda Ditilang.");
	}
}
}