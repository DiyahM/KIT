package com.playpenlabs.kit;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.parse.Parse;
import com.parse.ParseObject;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Parse.initialize(this, "22DcKkWatn1Dz6bWQZHKZixGHJ0YTjNzLtWF1oDC", "w5tzJYX5hhSqZ6sF83TVdVNsA1G3Yma5iK3v4wv1");
		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "bar");
		testObject.saveInBackground();
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
