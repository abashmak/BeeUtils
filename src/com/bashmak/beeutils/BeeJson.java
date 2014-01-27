package com.bashmak.beeutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
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

	public static ArrayList<NameValuePair> getUnnamedStringArray(String json) throws JSONException
	{
		ArrayList<NameValuePair> result = new ArrayList<NameValuePair>();
		JSONObject jo = new JSONObject(json);
		@SuppressWarnings("unchecked")
		Iterator<String> keys = jo.keys();
		while (keys.hasNext())
		{
			String key = keys.next();
			String value = jo.getString(key);
			result.add(new BasicNameValuePair(key, value));
		}
		Comparator<NameValuePair> comp = new Comparator<NameValuePair>()
		{
		    @Override public int compare(NameValuePair p1, NameValuePair p2)
		    {
		      return p1.getValue().compareTo(p2.getValue());
		    }
		};
		Collections.sort(result, comp);
		return result;
	}
}
