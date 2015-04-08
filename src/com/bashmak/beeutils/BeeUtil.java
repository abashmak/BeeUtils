package com.bashmak.beeutils;

import java.lang.reflect.Method;

import android.content.Context;

public class BeeUtil
{
	/**
	 * Get the sysprop value for the given key, returned as a non-negative interger value.
	 * Enable property on a per-device basis by running: "adb shell setprop <key> <true/false>"
	 * 
	 * @param key
	 *            the key to lookup
	 * @param def
	 *            a default value to return
	 * @return the key parsed as a non-negative integer, or def if the key isn't found or is not able to be parsed as integer
	 */
	public static Integer getIntSysProp(Context context, String key, int def)
	{
		Integer ret;

		try
		{
			ClassLoader cl = context.getClassLoader();
			@SuppressWarnings("rawtypes")
			Class SystemProperties = cl.loadClass("android.os.SystemProperties");

			// Parameters Types
			@SuppressWarnings("rawtypes")
			Class[] paramTypes = new Class[2];
			paramTypes[0] = String.class;
			paramTypes[1] = int.class;

			@SuppressWarnings("unchecked")
			Method getInt = SystemProperties.getMethod("getInt", paramTypes);

			// Parameters
			Object[] params = new Object[2];
			params[0] = key;
			params[1] = Integer.valueOf(def);

			ret = (Integer) getInt.invoke(SystemProperties, params);
			if (ret == null || ret < 0)
			{
				ret = def;
			}
		}
		catch (Exception e)
		{
			ret = def;
		}

		return ret;
	}


	/**
	 * Get the sysprop value for the given key, returned as a boolean. Values 'n', 'no',
	 * '0', 'false' or 'off' are considered false. Values 'y', 'yes', '1',
	 * 'true' or 'on' are considered true. (case insensitive). If the key does
	 * not exist, or has any other value, then the default result is returned.
	 * Enable property on a per-device basis by running: "adb shell setprop <key> <true/false>"
	 * 
	 * @param key
	 *            the key to lookup
	 * @param def
	 *            a default value to return
	 * @return the key parsed as a boolean, or def if the key isn't found or is
	 *         not able to be parsed as a boolean.
	 */
	public static Boolean getBooleanSysProp(Context context, String key, boolean def)
	{
		Boolean ret;

		try
		{
			ClassLoader cl = context.getClassLoader();
			@SuppressWarnings("rawtypes")
			Class SystemProperties = cl.loadClass("android.os.SystemProperties");

			// Parameters Types
			@SuppressWarnings("rawtypes")
			Class[] paramTypes = new Class[2];
			paramTypes[0] = String.class;
			paramTypes[1] = boolean.class;

			@SuppressWarnings("unchecked")
			Method getBoolean = SystemProperties.getMethod("getBoolean", paramTypes);

			// Parameters
			Object[] params = new Object[2];
			params[0] = key;
			params[1] = Boolean.valueOf(def);

			ret = (Boolean) getBoolean.invoke(SystemProperties, params);
		}
		catch (Exception e)
		{
			ret = def;
		}

		return ret;
	}
}
