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

        // Explicit intent: Calling another intent in application
        // state intent to call another activity
        Intent intent = new Intent(this, ReceiveMessageActivity.class);

        // add message text to intent to pass on further
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);

        // start another activity
        startActivity(intent);
    }

    public void onSendMessageImplicit(View view){
        // get EditText control
        EditText editText = (EditText) findViewById(R.id.message);

        // get value from EditText control
        String messageText = editText.getText().toString();

        // Implicit intent: calling actions via intent on android platform
        // Below will provide list of all activities present on device capable of handling send message e.g. gmail, messenger etc.
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);

        // start another activity
        startActivity(intent);
    }
}
