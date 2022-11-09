public class JamSibuk {
    public static void main(String[] args) {
      //polymorphism
        Elemen b = new Asdos("Fairuzikun", 24, 1);
        Elemen e = new Dosen("Raja OP Damanik", 5);
        Elemen l = new Asdos("Angel - Chan", 20, 4);
        Elemen a = new Mahasiswa("Firman", 20);//upcasting
        Elemen j = new Mahasiswa("Nid to pass this sem", 23);
        Elemen r = new Dosen("Nivotko", 3);   

        b.cekJamSibuk();
        e.cekJamSibuk();
        l.cekJamSibuk();
        a.cekJamSibuk();
        j.cekJamSibuk();
        r.cekJamSibuk();

        int totalJamSibuk = b.getJamSibuk()+e.getJamSibuk()+l.getJamSibuk()+a.getJamSibuk()+j.getJamSibuk()+r.getJamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah "+totalJamSibuk);
        
      }
}
