package com.samuelortizs.th_m303remote;

import android.os.Bundle;
import android.view.*;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TCPClient mTCPClient;
    private EditText etIP;
    private EditText etPORT;
    private TextView tvLogs;
    private Button btnConnect;
    private Button btnQuit;
    private Button btnTVVideo;
    private Button btnPower;
    private Button btnDisc1;
    private Button btnDisc2;
    private Button btnDisc3;
    private Button btnDisc4;
    private Button btnDisc5;
    private Button btnMuting;
    private Button btnDVD;
    private Button btnFMAM;
    private Button btnVCR;
    private Button btnDBS;
    private Button btnVolDown;
    private Button btnVolUp;
    private Button btnPrevious;
    private Button btnPlay;
    private Button btnNext;
    private Button btnReverse;
    private Button btnStop;
    private Button btnPause;
    private Button btnForward;
    private Button btnMenuTop;
    private Button btnCursorUp;
    private Button btnMenuMain;
    private Button btnCursorLeft;
    private Button btnCursorEnter;
    private Button btnCursorRight;
    private Button btnRecord;
    private Button btnCursorDown;
    private Button btnOnScreen;
    private Button btnTitleGroup;
    private Button btnDigit1;
    private Button btnDigit2;
    private Button btnDigit3;
    private Button btnAudio;
    private Button btnDigit4;
    private Button btnDigit5;
    private Button btnDigit6;
    private Button btnSubtitle;
    private Button btnDigit7;
    private Button btnDigit8;
    private Button btnDigit9;
    private Button btnAngle;
    private Button btnDigit10;
    private Button btnDigit0;
    private Button btnDigit10Plus;
    private Button btnPage;
    private Button btnRepeat;
    private Button btnPlayMode;
    private Button btnCancel;
    private Button btnSetup;
    private Button btnSetting;
    private Button btnZoom;
    private Button btnScanMode;
    private Button btnDisplay;
    private Button btnDimmer;
    private Button btnSleep;
    private Button btnTrebleUp;
    private Button btnModeSurround;
    private Button btnSmartSetup;
    private Button btnReturn;
    private Button btnTrebleDown;
    private Button btnSubUp;
    private Button btnCenterUp;
    private Button btnLSurrUp;
    private Button btnRSurrUp;
    private Button btnSubDown;
    private Button btnCenterDown;
    private Button btnLSurrDown;
    private Button btnRSurrDown;
    private Button btnChannelDown;
    private Button btnChannelUp;
    private Button btnTunerDown;
    private Button btnTunerToggle;
    private Button btnTunerUp;
    private Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etIP = findViewById(R.id.et_IP);
        etPORT = findViewById(R.id.et_PORT);
        tvLogs = findViewById(R.id.tv_Logs);
        btnConnect = findViewById(R.id.btn_Connect);
        btnQuit = findViewById(R.id.btn_Quit);
        btnTVVideo = findViewById(R.id.btn_TVVideo);
        btnPower = findViewById(R.id.btn_Power);
        btnDisc1 = findViewById(R.id.btn_Disc1);
        btnDisc2 = findViewById(R.id.btn_Disc2);
        btnDisc3 = findViewById(R.id.btn_Disc3);
        btnDisc4 = findViewById(R.id.btn_Disc4);
        btnDisc5 = findViewById(R.id.btn_Disc5);
        btnMuting = findViewById(R.id.btn_Muting);
        btnDVD = findViewById(R.id.btn_DVD);
        btnFMAM = findViewById(R.id.btn_FMAM);
        btnVCR = findViewById(R.id.btn_VCR);
        btnDBS = findViewById(R.id.btn_DBS);
        btnVolDown = findViewById(R.id.btn_VolDown);
        btnVolUp = findViewById(R.id.btn_VolUp);
        btnPrevious = findViewById(R.id.btn_Previous);
        btnPlay = findViewById(R.id.btn_Play);
        btnNext = findViewById(R.id.btn_Next);
        btnReverse = findViewById(R.id.btn_Reverse);
        btnStop = findViewById(R.id.btn_Stop);
        btnPause = findViewById(R.id.btn_Pause);
        btnForward = findViewById(R.id.btn_Forward);
        btnMenuTop = findViewById(R.id.btn_MenuTop);
        btnCursorUp = findViewById(R.id.btn_CursorUp);
        btnMenuMain = findViewById(R.id.btn_MenuMain);
        btnCursorLeft = findViewById(R.id.btn_CursorLeft);
        btnCursorEnter = findViewById(R.id.btn_CursorEnter);
        btnCursorRight = findViewById(R.id.btn_CursorRight);
        btnRecord = findViewById(R.id.btn_Record);
        btnCursorDown = findViewById(R.id.btn_CursorDown);
        btnOnScreen = findViewById(R.id.btn_OnScreen);
        btnTitleGroup = findViewById(R.id.btn_TitleGroup);
        btnDigit1 = findViewById(R.id.btn_Digit1);
        btnDigit2 = findViewById(R.id.btn_Digit2);
        btnDigit3 = findViewById(R.id.btn_Digit3);
        btnAudio = findViewById(R.id.btn_Audio);
        btnDigit4 = findViewById(R.id.btn_Digit4);
        btnDigit5 = findViewById(R.id.btn_Digit5);
        btnDigit6 = findViewById(R.id.btn_Digit6);
        btnSubtitle = findViewById(R.id.btn_Subtitle);
        btnDigit7 = findViewById(R.id.btn_Digit7);
        btnDigit8 = findViewById(R.id.btn_Digit8);
        btnDigit9 = findViewById(R.id.btn_Digit9);
        btnAngle = findViewById(R.id.btn_Angle);
        btnDigit10 = findViewById(R.id.btn_Digit10);
        btnDigit0 = findViewById(R.id.btn_Digit0);
        btnDigit10Plus = findViewById(R.id.btn_Digit10Plus);
        btnPage = findViewById(R.id.btn_Page);
        btnRepeat = findViewById(R.id.btn_Repeat);
        btnPlayMode = findViewById(R.id.btn_PlayMode);
        btnCancel = findViewById(R.id.btn_Cancel);
        btnSetup = findViewById(R.id.btn_Setup);
        btnSetting = findViewById(R.id.btn_Setting);
        btnZoom = findViewById(R.id.btn_Zoom);
        btnScanMode = findViewById(R.id.btn_ScanMode);
        btnDisplay = findViewById(R.id.btn_Display);
        btnDimmer = findViewById(R.id.btn_Dimmer);
        btnSleep = findViewById(R.id.btn_Sleep);
        btnTrebleUp = findViewById(R.id.btn_TrebleUp);
        btnModeSurround = findViewById(R.id.btn_ModeSurround);
        btnSmartSetup = findViewById(R.id.btn_SmartSetup);
        btnReturn = findViewById(R.id.btn_Return);
        btnTrebleDown = findViewById(R.id.btn_TrebleDown);
        btnSubUp = findViewById(R.id.btn_SubUp);
        btnCenterUp = findViewById(R.id.btn_CenterUp);
        btnLSurrUp = findViewById(R.id.btn_LSurrUp);
        btnRSurrUp = findViewById(R.id.btn_RSurrUp);
        btnSubDown = findViewById(R.id.btn_SubDown);
        btnCenterDown = findViewById(R.id.btn_CenterDown);
        btnLSurrDown = findViewById(R.id.btn_LSurrDown);
        btnRSurrDown = findViewById(R.id.btn_RSurrDown);
        btnChannelDown = findViewById(R.id.btn_ChannelDown);
        btnChannelUp = findViewById(R.id.btn_ChannelUp);
        btnTunerDown = findViewById(R.id.btn_TunerDown);
        btnTunerToggle = findViewById(R.id.btn_TunerToggle);
        btnTunerUp = findViewById(R.id.btn_TunerUp);
        btnCheck = findViewById(R.id.btn_Check);

        btnQuit.setEnabled(false);
        btnCheck.setEnabled(false);

        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTCPClient = new TCPClient(etIP.getText().toString(), Integer.parseInt(etPORT.getText().toString()), new TCPClient.OnMessageReceived() {
                    @Override
                    public void messageReceived(String message) {
                        tvLogs.append("\n" + message);
                    }
                });
                new Thread(mTCPClient).start();
                btnConnect.setEnabled(false);
                btnQuit.setEnabled(true);
                btnCheck.setEnabled(true);
            }
        });
        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTCPClient.sendMessage("q\r");
                mTCPClient.stopClient();
                btnConnect.setEnabled(true);
                btnQuit.setEnabled(false);
            }
        });
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTCPClient.sendMessage("version \r");
                mTCPClient.sendMessage("modules \r");
            }
        });
        btnTVVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -23816 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 37900 36 34 0 +8388 -4207 +526 -1578 +526 -1578 +526 -526 +526 -526 +526 -526 +526 -1578 +526 -526 +526 -1578 +526 -1578 +526 -1578 +526 -1578 +526 -526 +526 -1578 +526 -526 +526 -526 +526 -526 +526 -23614 +526 -1578 +526 -1578 +526 -526 +526 -526 +526 -526 +526 -1578 +526 -526 +526 -1578 +526 -1578 +526 -1578 +526 -1578 +526 -526 +526 -1578 +526 -526 +526 -526 +526 -526 +526 -23614 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDisc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDisc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDisc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -15342 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDisc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDisc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8605 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -15342 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnMuting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -21711 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDVD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -21711 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnFMAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -21711 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnVCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -22763 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -20658 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnVolDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 36 34 0 +8395 -4211 +526 -1579 +526 -1579 +526 -526 +526 -526 +526 -526 +526 -1579 +526 -526 +526 -1579 +526 -1579 +526 -1579 +526 -1579 +526 -1579 +526 -1579 +526 -526 +526 -526 +526 -526 +526 -23632 +526 -1579 +526 -1579 +526 -526 +526 -526 +526 -526 +526 -1579 +526 -526 +526 -1579 +526 -1579 +526 -1579 +526 -1579 +526 -1579 +526 -1579 +526 -526 +526 -526 +526 -526 +526 -23632 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnVolUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 36 34 0 +8395 -4211 +526 -1579 +526 -1579 +526 -526 +526 -526 +526 -526 +526 -1579 +526 -526 +526 -1579 +526 -526 +526 -1579 +526 -1579 +526 -1579 +526 -1579 +526 -526 +526 -526 +526 -526 +526 -23632 +526 -1579 +526 -1579 +526 -526 +526 -526 +526 -526 +526 -1579 +526 -526 +526 -1579 +526 -526 +526 -1579 +526 -1579 +526 -1579 +526 -1579 +526 -526 +526 -526 +526 -526 +526 -23632 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -17474 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -17474 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnMenuTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnCursorUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnMenuMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnCursorLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -17474 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnCursorEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -17474 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnCursorRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8605 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnCursorDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -17474 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnOnScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -19579 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnTitleGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -15342 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -17474 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -17474 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -17474 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnSubtitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -17474 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnAngle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -19579 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDigit10Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -15342 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -15342 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnRepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnPlayMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnSetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -14289 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 98 0 +4026 -2000 +474 -1526 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -474 +474 -1526 +474 -474 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -1526 +474 -474 +474 -474 +474 -1526 +474 -1526 +474 -474 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -33421 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnScanMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -15342 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnDimmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 0 100 0 +3459 -1730 +432 -1297 +432 -1297 +432 -432 +432 -432 +432 -432 +432 -432 +432 -432 +432 -432 +432 -1297 +432 -432 +432 -432 +432 -432 +432 -432 +432 -432 +432 -432 +432 -432 +432 -432 +432 -1297 +432 -432 +432 -432 +432 -432 +432 -1297 +432 -432 +432 -432 +432 -432 +432 -432 +432 -1297 +432 -432 +432 -1297 +432 -432 +432 -1297 +432 -432 +432 -1297 +432 -432 +432 -432 +432 -432 +432 -1297 +432 -432 +432 -432 +432 -1297 +432 -1297 +432 -1297 +432 -1297 +432 -432 +432 -432 +432 -1297 +432 -1297 +432 -1297 +432 -74730 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -500 +500 -500 +500 -22763 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnTrebleUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -20658[ \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnModeSurround.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -21711 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnSmartSetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 98 0 +4026 -2000 +474 -1526 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -474 +474 -1526 +474 -474 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -474 +474 -474 +474 -474 +474 -1526 +474 -474 +474 -1526 +474 -1526 +474 -1526 +474 -1526 +474 -1526 +474 -1526 +474 -1526 +474 -29368 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnTrebleDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -19579 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnSubUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnCenterUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -20658 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnLSurrUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -20658 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnRSurrUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -20632 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnSubDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -18526 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnCenterDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -19579 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnLSurrDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -19579 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnRSurrDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -19579 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnChannelDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -16395 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnChannelUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -17474 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnTunerDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -19579 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnTunerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -500 +500 -21711 \r";
                mTCPClient.sendMessage(msg);
            }
        });
        btnTunerUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "send 3 38000 2 34 0 +8474 -4237 +500 -1605 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -500 +500 -1605 +500 -500 +500 -500 +500 -500 +500 -1605 +500 -1605 +500 -1605 +500 -1605 +500 -500 +500 -20632 \r";
                mTCPClient.sendMessage(msg);
            }
        });
    }
}