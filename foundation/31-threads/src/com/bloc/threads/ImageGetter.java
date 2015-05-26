package com.bloc.threads;

import java.net.URL;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;

public class ImageGetter extends Thread {

	/*
	 * ImageGetter
	 *
	 * Initialize the ImageGetter class.
	 *
	 * @param url The URL of the image this ImageGetter should
	 *		  download (String)
	 * @param openWhenCompleted if `true`, the image will be opened
	 *		  as soon it is downloaded, `false` otherwise
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Implement this constructor for ImageGetter.
 	 *	The variables passed into it must impact the `run()` method's
 	 *	behavior as described above.
	/************************************************/

	String webOrigin = "";
	boolean shouldOpen = false;
	ImageGetter(String url, boolean validity){
		webOrigin = url;
		shouldOpen = validity;
	}

	@Override
	public void run() {
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Perform the work found in `Main.java` in this
 		 *	Thread instead.
		/************************************************/
		new Thread(){
			public void run(){
			try {
				File existingImage = new File("google_logo.png");
				if (existingImage.exists()) {
					existingImage.delete();
				}
				URL url = new URL(webOrigin);
				BufferedImage bufferedImage = ImageIO.read(url);
				File outputfile = new File("google_logo.png");
				ImageIO.write(bufferedImage, "png", outputfile);
				if (shouldOpen){
					if ("/".equals(System.getProperties().getProperty("file.separator"))) {
						Runtime.getRuntime().exec("open google_logo.png");
					} else {
						Runtime.getRuntime().exec("google_logo.png");
					}
					}
			} catch (IOException e) {
						e.printStackTrace();
					System.exit(1);
			} catch (Exception e) {
					e.printStackTrace();
					System.exit(1);
			}
		}
		};
	}
}