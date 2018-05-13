package com.sujk2k.hello.mymessenger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        // get EditText control
        EditText editText = (EditText) findViewById(R.id.message);

        // get value from EditText control
        String messageText = editText.getText().toString();

        // state intent to call another activity
        Intent intent = new Intent(this, ReceiveMessageActivity.class);

        // add message text to intent to pass on further
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);

        // start another activity
        startActivity(intent);
    }
}
