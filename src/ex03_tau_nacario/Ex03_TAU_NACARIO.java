//Ex03_TAU_NACARIO
package ex03_tau_nacario;

/**
 *
 * @author Matias
 */
public class Ex03_TAU_NACARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song o=new Song("Red Hot Chili Pepper", "Dani California");
        Song d=new Song("Red Hot Chili Pepper", "Dosed");
        Song z=new Song("Red Hot Chili Pepper", "The Zephyr Song");
        JapaneseNumbers j=new JapaneseNumbers(1);
        JapaneseNumbers k=new JapaneseNumbers(2);
        JapaneseNumbers l=new JapaneseNumbers(3);
        Singer s=new Singer(o, "Anthony Kiedis");
        Singer s2=new Singer(o, "Chris Warren");
        System.out.println(j.getNumber());
        System.out.println(k.getNumber());
        System.out.println(l.getNumber()+"\n");
        
        System.out.println("Earnings: "+s.getEarnings());
        System.out.println("Singer: "+s.getName());
        s.performForAudience(12);
        System.out.println("Song: "+s.getFavoriteSong().getTitle());
        System.out.println("Number of performances: "+s.getNoOfPerformances());
        System.out.println("Total number of performances: "+s.getTotalPerformances());
        s.changeFavSong(d);
        System.out.println("Song: "+s.getFavoriteSong().getTitle());
        System.out.println("Earnings: "+s.getEarnings()+"\n");
        s.changeFavSong(z);
        System.out.println("Singer: "+s.getName()+", "+s2.getName());
        s.performForAudience(12, s2);
        System.out.println("Number of performances: "+s.getNoOfPerformances());
        System.out.println("Total number of performances: "+s.getTotalPerformances());
        System.out.println("Song: "+s.getFavoriteSong().getTitle());
        System.out.println("Earnings: "+s.getEarnings());
    }
    
}
