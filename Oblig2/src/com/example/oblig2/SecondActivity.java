package com.example.oblig2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity implements View.OnClickListener{

	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.second_activity);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		b = (Button)findViewById(R.id.Bsecond);
		b.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//Intent i = new Intent("com.example.oblig2.MainActivity");
		//startActivity(i);		
		
		Intent startFirstActivity = new Intent(this, MainActivity.class);
		startActivity(startFirstActivity);		
		
	}
	
	

}
