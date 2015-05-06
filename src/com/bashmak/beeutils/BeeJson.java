package com.bashmak.beeutils;

import org.json.JSONException;
import org.json.JSONObject;

public class BeeJson
{
	public static Object getObject(String json, String name) throws JSONException
	{
		JSONObject obj = new JSONObject(json);
		if (obj.isNull(name))
			return null;
		else
			return obj.get(name);
	}

	public static Boolean getBoolean(String json, String name) throws JSONException
	{
		JSONObject obj = new JSONObject(json);
		if (obj.isNull(name))
			return null;
		else
			return obj.getBoolean(name);
	}

	public static String getString(String json, String name) throws JSONException
	{
		JSONObject obj = new JSONObject(json);
		if (obj.isNull(name))
			return null;
		else
			return obj.getString(name);
	}

	public static Integer getInteger(String json, String name) throws JSONException
	{
		JSONObject obj = new JSONObject(json);
		if (obj.isNull(name))
			return null;
		else
			return obj.getInt(name);
	}

	public static Long getLong(String json, String name) throws JSONException
	{
		JSONObject obj = new JSONObject(json);
		if (obj.isNull(name))
			return null;
		else
			return obj.getLong(name);
	}

	public static Double getDouble(String json, String name) throws JSONException
	{
		JSONObject obj = new JSONObject(json);
		if (obj.isNull(name))
			return null;
		else
			return obj.getDouble(name);
	}
}
