package com.example.greatealarm;

import android.app.AlarmManager;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	private AlarmManager alarm=null;
	private Button set;
	private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarm=(AlarmManager)getSystemService(Context.ALARM_SERVICE);
        set=(Button)findViewById(R.id.button1);
        text=(TextView)findViewById(R.id.textView1);
    }
    @Override
   protected void onResume()
   {

   }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_exit) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    
}
