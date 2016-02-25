/**
 * AudioEffect.java
 * Created on Feb 25, 2016, 21:34:52 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities.Audio;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Application Audio Effects
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class AudioEffect {

    public static int EXTERNAL_BUFFER_SIZE = 524288;

    public static int play(String filename) {
        File soundFile = new File(filename);
        if (!soundFile.exists()) {
            return -1;
        }
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (UnsupportedAudioFileException | IOException e) {

        }
        if (audioInputStream != null) {
            AudioFormat format;
            format = audioInputStream.getFormat();
            SourceDataLine auline = null;
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            try {
                auline = (SourceDataLine) AudioSystem.getLine(info);
                if (format != null) {
                    auline.open(format);
                } else {
                    return -1;
                }
            } catch (Exception e) {

            }
            if (auline != null) {
                auline.start();
                int nBytesRead = 0;
                byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
                try {
                    while (nBytesRead != -1) {
                        nBytesRead = audioInputStream.read(abData, 0, abData.length);
                        if (nBytesRead >= 0) {
                            auline.write(abData, 0, nBytesRead);
                        }
                    }
                } catch (Exception e) {

                } finally {
                    auline.drain();
                    auline.close();
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
        return 0;
    }
}
