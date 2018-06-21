package hangman;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
public class Project {
    public static void main(String[] args) throws Exception {
        Startpage sp = new Startpage();
        sp.setVisible(true);
        URL url;
        url = Startpage.class.getResource("start.wav");
        AudioClip clip = Applet.newAudioClip(url);
	clip.loop();
	//Thread.sleep(1000000);
        //clip.stop();
    }    
}
