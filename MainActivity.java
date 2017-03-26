package com.alientrunkcall.sms;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText mn,mess;
	Button sms;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mn=(EditText)findViewById(R.id.e1);
        mess=(EditText)findViewById(R.id.e2);
        sms=(Button)findViewById(R.id.b1);
        
        sms.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String no=mn.getText().toString();
        		String tex=mess.getText().toString();
        		
        		Intent in=new Intent(getApplicationContext(),MainActivity.class);
        		PendingIntent pi=PendingIntent.getActivity(getApplicationContext(),0, in,0);
        		
        		SmsManager sms=SmsManager.getDefault();
        		sms.sendTextMessage(no,null,tex,pi,null);
        		Toast.makeText(getApplicationContext(),"Message Sent Succesfully !!",Toast.LENGTH_LONG).show();	
        	}
        });
			}
        		
        
    }
