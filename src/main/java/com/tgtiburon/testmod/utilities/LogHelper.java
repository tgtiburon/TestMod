package com.tgtiburon.testmod.utilities;

import com.tgtiburon.testmod.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;


/**
 * Created by Tony on 7/12/2014.
 */
public class LogHelper
{

    //takes in the log level you want, and the object
    //object can be text or a java object.  if object it sends the value of the object

    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));


    }//end public static voidLog()

    //FML Sets the level to show INFO and below only
    // All/Debug/Trace will not show in the log

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }//end  void all

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }//end void debug

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }//end void error

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }//end void fatal

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }//end void info

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }//end void off

    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }//end void trace

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }//end void warn


}//end pubic class LogHelper()

