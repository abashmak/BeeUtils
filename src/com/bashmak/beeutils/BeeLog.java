package com.bashmak.beeutils;

import android.util.Log;

/**
 * Custom convenience wrapper for Android Log utility
 * Provides shortcut functions for calling andoroid.Log, ability to filter log output by level or disable it completely
 */
public class BeeLog
{
	private static int mLevel = 0;
	private static String mTag = "BeeLog";

	/**
	 * @param logTag - tag to print with the log messages. Must be a non-null and non-empty string object,
	 * <br>otherwise defaults to "BeeLog" value.
	 * @param logLevel - log verbosity level. Currently levels 1, 2, and 3 are supported, with 3 being the most verbose.
	 * <br>Setting logLevel to 0 disables logging completely. Must be an integer greater than or equal to 0. 
	 */
	public static void setPrefs(String logTag, int logLevel)
	{
		if (logTag != null && !logTag.equals(""))
			mTag = logTag;
		if (logLevel >= 0)
			mLevel = logLevel;
	}

	/*==========================================================================================
	 Verbose section 
	===========================================================================================*/
	
	private static void v_(int level, String tag, String msg, Throwable tr)
	{
		if (mLevel >= level)
			Log.v(tag, msg, tr);
	}

	/**
	 * Verbose log output at level 1
	 */
	public static void v1(String tag, String msg, Throwable tr)
	{
		v_(1, tag, msg, tr);
	}

	/**
	 * Verbose log output at level 1
	 */
	public static void v1(String tag, String msg)
	{
		v_(1, tag, msg, null);
	}

	/**
	 * Verbose log output at level 1, using default tag
	 */
	public static void v1(String msg, Throwable tr)
	{
		v_(1, mTag, msg, tr);
	}

	/**
	 * Verbose log output at level 1, using default tag
	 */
	public static void v1(String msg)
	{
		v_(1, mTag, msg, null);
	}

	/**
	 * Verbose log output at level 2
	 */
	public static void v2(String tag, String msg, Throwable tr)
	{
		v_(2, tag, msg, tr);
	}

	/**
	 * Verbose log output at level 2
	 */
	public static void v2(String tag, String msg)
	{
		v_(2, tag, msg, null);
	}

	/**
	 * Verbose log output at level 2, using default tag
	 */
	public static void v2(String msg, Throwable tr)
	{
		v_(2, mTag, msg, tr);
	}

	/**
	 * Verbose log output at level 2, using default tag
	 */
	public static void v2(String msg)
	{
		v_(2, mTag, msg, null);
	}

	/**
	 * Verbose log output at level 3
	 */
	public static void v3(String tag, String msg, Throwable tr)
	{
		v_(3, tag, msg, tr);
	}

	/**
	 * Verbose log output at level 3
	 */
	public static void v3(String tag, String msg)
	{
		v_(3, tag, msg, null);
	}

	/**
	 * Verbose log output at level 3, using default tag
	 */
	public static void v3(String msg, Throwable tr)
	{
		v_(3, mTag, msg, tr);
	}

	/**
	 * Verbose log output at level 3, using default tag
	 */
	public static void v3(String msg)
	{
		v_(3, mTag, msg, null);
	}

	/*==========================================================================================
	 Debug section 
	===========================================================================================*/
	
	private static void d_(int level, String tag, String msg, Throwable tr)
	{
		if (mLevel >= level)
			Log.d(tag, msg, tr);
	}

	/**
	 * Debug log output at level 1
	 */
	public static void d1(String tag, String msg, Throwable tr)
	{
		d_(1, tag, msg, tr);
	}

	/**
	 * Debug log output at level 1
	 */
	public static void d1(String tag, String msg)
	{
		d_(1, tag, msg, null);
	}

	/**
	 * Debug log output at level 1, using default tag
	 */
	public static void d1(String msg, Throwable tr)
	{
		d_(1, mTag, msg, tr);
	}

	/**
	 * Debug log output at level 1, using default tag
	 */
	public static void d1(String msg)
	{
		d_(1, mTag, msg, null);
	}

	/**
	 * Debug log output at level 2
	 */
	public static void d2(String tag, String msg, Throwable tr)
	{
		d_(2, tag, msg, tr);
	}

	/**
	 * Debug log output at level 2
	 */
	public static void d2(String tag, String msg)
	{
		d_(2, tag, msg, null);
	}

	/**
	 * Debug log output at level 2, using default tag
	 */
	public static void d2(String msg, Throwable tr)
	{
		d_(2, mTag, msg, tr);
	}

	/**
	 * Debug log output at level 2, using default tag
	 */
	public static void d2(String msg)
	{
		d_(2, mTag, msg, null);
	}

	/**
	 * Debug log output at level 3
	 */
	public static void d3(String tag, String msg, Throwable tr)
	{
		d_(3, tag, msg, tr);
	}

	/**
	 * Debug log output at level 3
	 */
	public static void d3(String tag, String msg)
	{
		d_(3, tag, msg, null);
	}

	/**
	 * Debug log output at level 3, using default tag
	 */
	public static void d3(String msg, Throwable tr)
	{
		d_(3, mTag, msg, tr);
	}

	/**
	 * Debug log output at level 3, using default tag
	 */
	public static void d3(String msg)
	{
		d_(3, mTag, msg, null);
	}

	/*==========================================================================================
	 Info section 
	===========================================================================================*/
	
	private static void i_(int level, String tag, String msg, Throwable tr)
	{
		if (mLevel >= level)
			Log.i(tag, msg, tr);
	}

	/**
	 * Info log output at level 1
	 */
	public static void i1(String tag, String msg, Throwable tr)
	{
		i_(1, tag, msg, tr);
	}

	/**
	 * Info log output at level 1
	 */
	public static void i1(String tag, String msg)
	{
		i_(1, tag, msg, null);
	}

	/**
	 * Info log output at level 1, using default tag
	 */
	public static void i1(String msg, Throwable tr)
	{
		i_(1, mTag, msg, tr);
	}

	/**
	 * Info log output at level 1, using default tag
	 */
	public static void i1(String msg)
	{
		i_(1, mTag, msg, null);
	}

	/**
	 * Info log output at level 2
	 */
	public static void i2(String tag, String msg, Throwable tr)
	{
		i_(2, tag, msg, tr);
	}

	/**
	 * Info log output at level 2
	 */
	public static void i2(String tag, String msg)
	{
		i_(2, tag, msg, null);
	}

	/**
	 * Info log output at level 2, using default tag
	 */
	public static void i2(String msg, Throwable tr)
	{
		i_(2, mTag, msg, tr);
	}

	/**
	 * Info log output at level 2, using default tag
	 */
	public static void i2(String msg)
	{
		i_(2, mTag, msg, null);
	}

	/**
	 * Info log output at level 3
	 */
	public static void i3(String tag, String msg, Throwable tr)
	{
		i_(3, tag, msg, tr);
	}

	/**
	 * Info log output at level 3
	 */
	public static void i3(String tag, String msg)
	{
		i_(3, tag, msg, null);
	}

	/**
	 * Info log output at level 3, using default tag
	 */
	public static void i3(String msg, Throwable tr)
	{
		i_(3, mTag, msg, tr);
	}

	/**
	 * Info log output at level 3, using default tag
	 */
	public static void i3(String msg)
	{
		i_(3, mTag, msg, null);
	}

	/*==========================================================================================
	 Warning section 
	===========================================================================================*/
	
	private static void w_(int level, String tag, String msg, Throwable tr)
	{
		if (mLevel >= level)
			Log.w(tag, msg, tr);
	}

	/**
	 * Warning log output at level 1
	 */
	public static void w1(String tag, String msg, Throwable tr)
	{
		w_(1, tag, msg, tr);
	}

	/**
	 * Warning log output at level 1
	 */
	public static void w1(String tag, String msg)
	{
		w_(1, tag, msg, null);
	}

	/**
	 * Warning log output at level 1, using default tag
	 */
	public static void w1(String msg, Throwable tr)
	{
		w_(1, mTag, msg, tr);
	}

	/**
	 * Warning log output at level 1, using default tag
	 */
	public static void w1(String msg)
	{
		w_(1, mTag, msg, null);
	}

	/**
	 * Warning log output at level 2
	 */
	public static void w2(String tag, String msg, Throwable tr)
	{
		w_(2, tag, msg, tr);
	}

	/**
	 * Warning log output at level 2
	 */
	public static void w2(String tag, String msg)
	{
		w_(2, tag, msg, null);
	}

	/**
	 * Warning log output at level 2, using default tag
	 */
	public static void w2(String msg, Throwable tr)
	{
		w_(2, mTag, msg, tr);
	}

	/**
	 * Warning log output at level 2, using default tag
	 */
	public static void w2(String msg)
	{
		w_(2, mTag, msg, null);
	}

	/**
	 * Warning log output at level 3
	 */
	public static void w3(String tag, String msg, Throwable tr)
	{
		w_(3, tag, msg, tr);
	}

	/**
	 * Warning log output at level 3
	 */
	public static void w3(String tag, String msg)
	{
		w_(3, tag, msg, null);
	}

	/**
	 * Warning log output at level 3, using default tag
	 */
	public static void w3(String msg, Throwable tr)
	{
		w_(3, mTag, msg, tr);
	}

	/**
	 * Warning log output at level 3, using default tag
	 */
	public static void w3(String msg)
	{
		w_(3, mTag, msg, null);
	}

	/*==========================================================================================
	 Error section 
	===========================================================================================*/
	
	private static void e_(int level, String tag, String msg, Throwable tr)
	{
		if (mLevel >= level)
			Log.e(tag, msg, tr);
	}

	/**
	 * Error log output at level 1
	 */
	public static void e1(String tag, String msg, Throwable tr)
	{
		e_(1, tag, msg, tr);
	}

	/**
	 * Error log output at level 1
	 */
	public static void e1(String tag, String msg)
	{
		e_(1, tag, msg, null);
	}

	/**
	 * Error log output at level 1, using default tag
	 */
	public static void e1(String msg, Throwable tr)
	{
		e_(1, mTag, msg, tr);
	}

	/**
	 * Error log output at level 1, using default tag
	 */
	public static void e1(String msg)
	{
		e_(1, mTag, msg, null);
	}

	/**
	 * Error log output at level 2
	 */
	public static void e2(String tag, String msg, Throwable tr)
	{
		e_(2, tag, msg, tr);
	}

	/**
	 * Error log output at level 2
	 */
	public static void e2(String tag, String msg)
	{
		e_(2, tag, msg, null);
	}

	/**
	 * Error log output at level 2, using default tag
	 */
	public static void e2(String msg, Throwable tr)
	{
		e_(2, mTag, msg, tr);
	}

	/**
	 * Error log output at level 2, using default tag
	 */
	public static void e2(String msg)
	{
		e_(2, mTag, msg, null);
	}

	/**
	 * Error log output at level 3
	 */
	public static void e3(String tag, String msg, Throwable tr)
	{
		e_(3, tag, msg, tr);
	}

	/**
	 * Error log output at level 3
	 */
	public static void e3(String tag, String msg)
	{
		e_(3, tag, msg, null);
	}

	/**
	 * Error log output at level 3, using default tag
	 */
	public static void e3(String msg, Throwable tr)
	{
		e_(3, mTag, msg, tr);
	}

	/**
	 * Error log output at level 3, using default tag
	 */
	public static void e3(String msg)
	{
		e_(3, mTag, msg, null);
	}
}
