package com.example.arrayadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lv = (ListView) findViewById(R.id.lv);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item, new String[]{"hello","chenhai","wangcheng","cityking"});
		lv.setAdapter(adapter);
	}


}
