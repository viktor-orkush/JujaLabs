package week10.laba45;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFilter {
    public static void filter(InputStream src, OutputStream dst, int bufferSize, byte filterCriteria) throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[bufferSize];
        int length;
        while((length = src.read(buffer)) != -1){
            int writerLength = 0;
            int fromIndex = 0;
            for(int index = 0; index<length; index++){
                if (buffer[index] == filterCriteria){
                    writerLength = index-fromIndex;
                    if(fromIndex<index) dst.write(buffer, fromIndex, writerLength);
                    fromIndex = index+1;
                }
                else if(index == length-1){
                    writerLength = index-fromIndex +1;
                    dst.write(buffer, fromIndex, writerLength);
                }
            }
        }
    }
}