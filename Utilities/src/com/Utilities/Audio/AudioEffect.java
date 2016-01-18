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

    /**
     * Play function
     *
     * @param filename
     * @return integer value 0 for success else -1
     */
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
            /**
             * Describe a desired line
             */
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            try {
                auline = (SourceDataLine) AudioSystem.getLine(info);
                /* 
                 * Opens the line with the specified format,  
                 * causing the line to acquire any required  
                 * system resources and become operational.  
                 */
                if (format != null) {
                    auline.open(format);
                } else {
                    return -1;
                }
            } catch (Exception e) {

            }
            /**
             * Allows a line to engage in data I/O
             */
            if (auline != null) {
                auline.start();
                int nBytesRead = 0;
                byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
                try {
                    while (nBytesRead != -1) {
                        nBytesRead = audioInputStream.read(abData, 0, abData.length);
                        if (nBytesRead >= 0) {
                            /**
                             * Writes audio data to the mixer via this source
                             * data line NOTE : A mixer is an audio device with
                             * one or more lines
                             */
                            auline.write(abData, 0, nBytesRead);
                        }
                    }
                } catch (Exception e) {

                } finally {
                    /**
                     * Drains queued data from the line by continuing data I/O
                     * until the data line's internal buffer has been emptied
                     */
                    auline.drain();
                    /**
                     * Closes the line, indicating that any system resources in
                     * use by the line can be released
                     */
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
