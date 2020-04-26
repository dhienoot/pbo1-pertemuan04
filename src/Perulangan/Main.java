package Perulangan;

public class Main {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh : " + isiGelas + "ml");

        while(isiGelas != penuh){
            isiGelas++;
            System.out.println(" Sedang Mengisi gelas..");
            System.out.println("Isi Gelang Sekarang : " + isiGelas + "ml" );
        }

        System.out.println("Finale: Isi Gelas Sekarang : " + isiGelas + "ml");
        
    }
}
