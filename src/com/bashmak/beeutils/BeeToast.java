package com.bashmak.beeutils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class BeeToast
{
	public static void showCenteredToast(Context context, String msg, int length)
    {
		Toast toast = Toast.makeText(context, msg, length);
		toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }

	public static void showCenteredToastLong(Context context, String msg)
    {
		showCenteredToast(context, msg, Toast.LENGTH_LONG);
    }

	public static void showCenteredToastShort(Context context, String msg)
    {
		showCenteredToast(context, msg, Toast.LENGTH_SHORT);
    }
	
	public static void showTopToast(Context context, String msg, int length)
    {
		Toast toast = Toast.makeText(context, msg, length);
		toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }

	public static void showTopToastLong(Context context, String msg)
    {
		showTopToast(context, msg, Toast.LENGTH_LONG);
    }

	public static void showTopToastShort(Context context, String msg)
    {
		showTopToast(context, msg, Toast.LENGTH_SHORT);
    }
	
	public static void showBottomToast(Context context, String msg, int length)
    {
		Toast toast = Toast.makeText(context, msg, length);
		toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }

	public static void showBottomToastLong(Context context, String msg)
    {
		showBottomToast(context, msg, Toast.LENGTH_LONG);
    }

	public static void showBottomToastShort(Context context, String msg)
    {
		showBottomToast(context, msg, Toast.LENGTH_SHORT);
    }
}
