package uts.if2.pkg10119065.fachriansyahmuhnuri.no3;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program genre musik
 */
public class UTSIF210119065FACHRIANSYAHMUHNURINo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rnb mg1 = new Rnb();
        mg1.setArtisName("Jimmy Hendrik");
        mg1.genreBlues(mg1.getArtisName());
        
        Rnb mg2 = new Rnb();
        mg2.setArtisName("Chad Baker");
        mg2.genreJazz(mg1.getArtisName());
        
        Folk folk = new Folk();
        folk.setArtisName("Bob Dylan");
        folk.genreFolk(folk.getArtisName());
        
        Rockability rockability = new Rockability();
        rockability.setArtisName("Elvis Presley");
        rockability.genreRockability(rockability.getArtisName());
        
       HardRock progresiveRock = new HardRock();
       progresiveRock.setArtisName("DreamTheater");
       progresiveRock.genreProgressiveRock(progresiveRock.getArtisName());
       
       HardRock psychedelicRock = new HardRock();
       psychedelicRock.setArtisName("The doors");
       psychedelicRock.genrePsychedelicRock(psychedelicRock.getArtisName());
       
       HardRock popRock = new HardRock();
       popRock.setArtisName("The doors");
       popRock.genrePopRock(popRock.getArtisName());
       
       
    }
    
}
