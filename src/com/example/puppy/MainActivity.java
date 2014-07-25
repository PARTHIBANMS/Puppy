package com.example.puppy;



import java.util.HashMap;



import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	// Alert Dialog Manager
		AlertDialogManager alert = new AlertDialogManager();
		
		// Session Manager Class
		SessionManager session;
		Button start;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 // Session class instance
        session = new SessionManager(getApplicationContext());
        
        TextView lblName = (TextView) findViewById(R.id.tvname);
       
        
        // Button logout
        start = (Button) findViewById(R.id.btnstart);
        
        Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();
        
        
        /**
         * Call this function whenever you want to check user login
         * This will redirect user to LoginActivity is he is not
         * logged in
         * */
        session.checkLogin();
        
        // get user data from session
        HashMap<String, String> user = session.getUserDetails();
        
        // name
        String name = user.get(SessionManager.KEY_NAME);
        
        // email
       
        
        // displaying user data
        lblName.setText(Html.fromHtml("Name: <b>" + name + "</b>"));
        
        
        
        /**
         * Logout button click event
         * */
        start.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// Clear the session data
				// This will clear all session data and 
				// redirect user to LoginActivity
//				session.logoutUser();
				Intent move = new Intent(MainActivity.this,PlayScreen.class);
				startActivity(move);
			}
		});

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
