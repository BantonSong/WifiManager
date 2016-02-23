package com.example.wifitest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button openButton = (Button) findViewById(R.id.button1);
		Button closeButton = (Button) findViewById(R.id.button2);

		final WifiAdmin wifiAdmin = new WifiAdmin(this);

		openButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				wifiAdmin.openWifi();
			}
		});
		closeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				wifiAdmin.closeWifi();
			}
		});
	}
}
