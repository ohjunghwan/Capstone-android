package com.example.jh.proto;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    // Message types about Handler
    static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_RECEIVE = 2;
    public static final int MESSAGE_DEVICE_NAME = 3;
    public static final int MESSAGE_TOAST = 4;
    public static final int MESSAGE_DATE_TIME_CHANGE = 5;

    // Key names received from the BluetoothService Handler
    public static final String DEVICE_NAME = "device_name";
    public static final String TOAST = "toast";

    // Intent request codes
    public static final int REQUEST_CONNECT_DEVICE_SECURE = 1;
    public static final int REQUEST_ENABLE_BT = 2;

    // Local Bluetooth adapter
    private BluetoothAdapter mBluetoothAdapter = null;
    // Member object for the Bluetoothservice
    private BluetoothService mService = null;


    private Button mBTButton;
    private Button mSendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 블루투스 아답터 객체 생성
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        // 블루투스 아답터 객체가 없으면 블루투스 사용 불가
        if (mBluetoothAdapter == null) {
            Toast.makeText(this, "블루투스를 사용할 수 없습니다.", Toast.LENGTH_LONG).show();
            finish();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "++ ON START ++");

        // 블루투스를 켜는 권한 요청
        if (!mBluetoothAdapter.isEnabled()) {
            Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableIntent, REQUEST_ENABLE_BT);
        } else {
            // 권한 요청 승인 시 setup()
            if (mService == null) setup();
        }
    }

    private void setup() {
        Log.d(TAG, "Set up buttons and timer");

        // 블루투스 연결 버튼
        mBTButton = (Button) findViewById(R.id.bt_btn);
        mBTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serverIntent =
                        new Intent(getApplicationContext(), DeviceListActivity.class);
                startActivityForResult(serverIntent, REQUEST_CONNECT_DEVICE_SECURE);
            }
        });

        mSendButton = (Button) findViewById(R.id.send_btn);
        mSendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendMessage(1);

            }
        });

        // BluetoothService 객체 생성
        mService = new BluetoothService(this, mHandler);


    }

    private final Handler mHandler = new Handler();

    // 아두이노로 메시지를 보냄
    private void sendMessage(int value) {
        if (mService.getState() != BluetoothService.STATE_CONNECTED) {
            Toast.makeText(this, R.string.not_connected, Toast.LENGTH_SHORT).show();
            return;
        }
        String message = Integer.toString(value) + "\n";
        if (message.length() > 0) {
            byte[] send = message.getBytes();
            mService.write(send);
        }
    }
}
