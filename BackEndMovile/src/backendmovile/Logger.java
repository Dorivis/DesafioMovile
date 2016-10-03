package backendmovile;

import java.io.*;

public class Logger 
{
    private static BufferedWriter br;
    
    public static void write(File f, String text) throws IOException
    {
        br = new BufferedWriter(new FileWriter(f));
        
    }
    
}
