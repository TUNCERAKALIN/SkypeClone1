package com.example.skypeclone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;
import java.net.URISyntaxException;

public class DashBoardActivity extends AppCompatActivity {
    private EditText editTextCodeInput;
    private Button buttonJoin;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        editTextCodeInput = findViewById(R.id.edt_code);
        buttonJoin = findViewById(R.id.btn_join);

        URI serverUrl;
        //

        try {
            serverUrl = new URI("https://meet.jit.si");
//            JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder()
//                    .setServerUrl(serverUrl)
//                    .setWelcomePageEnabled(false)
//                    .build();
//            JitsiMeet.setDefaultConferenceOptions(options);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        buttonJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                JitsiMeetConferenceOptions m_options = new JitsiMeetConferenceOptions.Builder()
//                        .setRoom(editTextCodeInput.getText().toString())
//                        .setWelcomePageEnabled(false)
//                        .build();
//                JitsiMeetActivity.launch(DashBoardActivity.this, m_options);
            }
        });
    }
}