package com.example.linkpage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void buttonClicked(View v){
		Toast.makeText(getApplicationContext(), "submitted", Toast.LENGTH_SHORT).show();
		startActivity( new Intent(this,SecondMainActivity.class));
	}
	public void cancelClicked(View v){
		Toast.makeText(getApplicationContext(), "Not submitted", Toast.LENGTH_SHORT).show();
		startActivity( new Intent(this,ThirdMainActivity.class));
	}


}
