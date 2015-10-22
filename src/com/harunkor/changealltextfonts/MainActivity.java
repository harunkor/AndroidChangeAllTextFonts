package com.harunkor.changealltextfonts;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		View view = getWindow().getDecorView().getRootView();
		
		 FontHelper.applyFont(this, view, "font.otf");
		
		
	}

	
}
