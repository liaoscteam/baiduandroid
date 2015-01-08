package com.example.greatealarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Receiver extends BroadcastReceiver{
	  @Override
	public void onReceive(Context context, Intent intent) {
		   Intent in=new Intent(context,AlarmOn.class);
		   in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		   context.startActivity(in);
	}
}
