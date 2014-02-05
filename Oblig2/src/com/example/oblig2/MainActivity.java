package com.example.oblig2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
		
	}

	private void init() {
		// TODO Auto-generated method stub
		b = (Button) findViewById(R.id.BnextActivty);
		b.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//Intent i = new Intent("com.example.oblig2.SecondActivity");
		//startActivity(i);
		
		Intent startOtherActivity = new Intent(this, SecondActivity.class);
		startActivity(startOtherActivity);
	}
	
	

}
