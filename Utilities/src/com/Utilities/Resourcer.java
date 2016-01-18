package com.Utilities;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 * Generating list of images from resource
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Resourcer {

    /**
     *
     * @param images
     * @param AppClass
     * @return
     */
    public static BufferedImage[] loadresources(ArrayList<String> images, Object AppClass) {
        BufferedImage[] resource_images = new BufferedImage[images.size()];    
        for (int i = 0; i < images.size(); i++) {
            String img = images.get(i);
            BufferedImage bufferedImg = null;
            try {
                bufferedImg = ImageIO.read(AppClass.getClass().getResource(img));
                resource_images[i] = bufferedImg;
            } catch (IOException ex) {
            }
        }
        return resource_images;
    }
}
