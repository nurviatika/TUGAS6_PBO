
/**
 *
 * @author TIKA
 */
public class Toshiba implements Laptop {
    private int volume;
    private boolean is_power_on;
    
    public Toshiba() {
        this.volume = 50;
        this.is_power_on = false;
    }
    
    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop ON! ");
        
    }
    
    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Laptop Off! ");
         
    }
    
    
    @Override
    public void volumeUp() {
        if ( is_power_on) {
            if (this.volume==MAX_VOL) {
                System.out.println("Volume sudah mencapai level maksimum ");  
            }
            else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        }
        else {
            System.out.println("Laptop mati ");
        }
    }
    
    
    @Override
    public void volumeDown() {
        if ( is_power_on) {
            if (this.volume==MIN_VOL) {
                System.out.println("Volume sekarang ialah 0%");  
            }
            else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        }
        else {
            System.out.println("Laptop mati ");
        }
    }
    
    public int getVolume() {
        return this.volume;
    }
    
}
