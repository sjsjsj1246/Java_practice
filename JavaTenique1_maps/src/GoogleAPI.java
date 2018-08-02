import java.net.URL;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import javax.swing.ImageIcon;

public class GoogleAPI {
	public void downloadMap(String location) {
		try {
			String imageURL = "";
			URL url = new URL(imageURL);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream(location);
			byte[] b = new byte[2018];
			int length;
			while((length = is.read(b))!=-1) {
				os.write(b, 0, length);
			}
			is.close();
			os.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ImageIcon getMap(String location) {
		return new ImageIcon((new ImageIcon(location)).getImage().getScaledInstance(612, 612, java.awt.Image.SCALE_SMOOTH));
	}
	
	public void fileDelete(String fileName) {
		File f = new File(fileName);
		f.delete();
	}
}
