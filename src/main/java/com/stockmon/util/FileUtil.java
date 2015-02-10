package com.stockmon.util;

//import org.apache.log4j.Logger;

import java.io.*;

/**
 *
 * @author Kory
 */
public class FileUtil {

    //private static Logger log = CustomLogger.getLogger(FileUtil.class);

    private FileUtil()
    {
    }

    // copy method from From E.R. Harold's book "Java I/O"
    public static void copy(InputStream in, OutputStream out)
        throws IOException
    {
        // do not allow other threads to read from the
        // input or write to the output while copying is
        // taking place
        synchronized (in)
        {
            synchronized (out)
            {
                byte[] buffer = new byte[256];
                while (true)
                {
                    int bytesRead = in.read(buffer);
                    if (bytesRead == -1) break;
                    out.write(buffer, 0, bytesRead);
                }
            }
        }
    }

    // Copy file (src) to File/directory dest.
    public static void copy(File src, File dest)
        throws IOException
    {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dest);

        copy(in, out);

        in.close();
        out.close();
    }
    
    // Copy file (src) to File/directory dest.
    public static void copy(String source, String dest)
        throws IOException
    {
        File existingFile = new File( source );
        if (existingFile.exists())
        {
            File archiveFile = new File( dest );
            copy(existingFile, archiveFile);
        }
    }

    // Archvies source to dest folder and erases files older than specified # of days.
    /* -- We don't use this. If you do, please pull in Time and FilenameFilterEndsWith classes
    public static void archive(String source, String dest, int days)
        throws IOException, ParseException
    {
        File archiveDir = new File(dest);
        File sourceFile = new File( source );
        File destFile;
        
        if (!archiveDir.isDirectory())
            throw new IOException("Archvie destination must be a valid folder.");
        
        if (!sourceFile.exists())
            throw new IOException("Archive \"source file\" not available.");
        
        StringBuffer archiveFilename = new StringBuffer( dest );
        archiveFilename.append( Time.toYYYYMMDD() )
                       .append( sourceFile.getName() );
        destFile = new File(archiveFilename.toString());
        copy(sourceFile, destFile);

        // clean up files older than 'days' - if a valid age has been passed.
        if (days > 0)
        {
            Calendar olderThanCal = GregorianCalendar.getInstance();
            olderThanCal.add(Calendar.DAY_OF_MONTH, 0-days);
            Date olderThan = olderThanCal.getTime();
            FilenameFilter endsWith = new FilenameFilterEndsWith( sourceFile.getName() );
            File[] archivedFiles = archiveDir.listFiles( endsWith );
            for (int i=0; i<archivedFiles.length; i++)
            {
                File archivedFile = archivedFiles[i];
                String fileNameDate = archivedFile.getName().substring(0,8);
                Date fileDate = Time.YYYYMMDD_FORMAT.parse( fileNameDate );
                if (fileDate.before(olderThan))
                {
                    log.debug(
                        Time.toYYYYMMDD(fileDate) + " is older than " +
                        Time.toYYYYMMDD(olderThan) +
                        "! Deleting '" + archivedFile.getName() + "'" );
                    archivedFile.delete();
                }
            }
        }            
    }
    */

    // append text data to end of specified file
    public static void append(String fn, String data)
        throws IOException
    {
        FileWriter fw = new FileWriter(fn, true);

        fw.write(data);
        fw.flush();
        fw.close();
    }

    // (over)write text data to file
    public static void write(String fn, String data)
        throws IOException
    {
        FileWriter fw = new FileWriter(fn, false);

        fw.write(data);
        fw.flush();
        fw.close();
    }

    // Verifies supplied path and returns string that file can be appended to.
    public static String getPath(String path)
        throws IOException
    {
        File aPath = new File(path);
        if (aPath.isDirectory())
            return aPath.getAbsolutePath() + File.separator;
        else
            throw new IOException("Path not found.");
    }

    public static boolean containsData(String fn, String data)
        throws IOException
    {
        FileReader fr = new FileReader(fn);
        BufferedReader br = new BufferedReader(fr);

        boolean hasData = false;

        String dataLine = null;
        while ( (dataLine = br.readLine()) != null )
        {
            if (dataLine.indexOf(data) > -1)
            {
                hasData = true;
                break;
            }
            
        }
        br.close();
        fr.close();

        return hasData;
    }

    // Archvies source to dest folder and erases files older than specified # of days.
    /* -- We don't use this yet, if you do, please pull in FilenamefilterEndsWith class, etc
    public static File[] dir(String path, String ext)
        throws IOException
    {
        File sourceDir = new File(path);

        if (!sourceDir.exists() || !sourceDir.isDirectory())
            throw new IOException("Directory does not exist.");
        
        if (ext != null & ext.length() > 0)
        {
            FilenameFilter endsWith = new FilenameFilterEndsWith( ext );
            return sourceDir.listFiles( endsWith );
        }
        else
        {
            return sourceDir.listFiles();
        }                
    }
    */

    public static String readTextFile(String fn)
        throws IOException
    {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream is = loader.getResourceAsStream(fn);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        // Copy the SOAP file to the open connection.
        FileUtil.copy(is,bout);
        is.close();

//        byte[] b = bout.toByteArray();

        String file = bout.toString("utf-8");
        bout.close();

        return file;
    }

}
