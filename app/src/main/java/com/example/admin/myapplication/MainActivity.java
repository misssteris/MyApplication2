package lt.vtvpmc.ems.zwaclaw.activitystate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView priminimaiView;
    private TextView textView;
    private String text = "vienas";
    private ArrayList<String> priminimai = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        priminimaiView = (ListView) findViewById(R.id.sarasas);
        text += "onCreate()\n";
        priminimai.add("1");
        priminimai.add("2");
        priminimai.add("3");
        priminimai.add("4");
        priminimai.add("5");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, priminimai);
        priminimaiView.setAdapter(adapter);
        onState();
        Log.d("log", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        text += "onStart()\n";
        onState();
        Log.d("log", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        text += "onResume()\n";
        onState();
        Log.d("log", "onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        text += "onStop()\n";
        onState();
        Log.d("log", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        text += "onDestroy()\n";
        onState();
        Log.d("log", "onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        text += "onRestart()\n";
        onState();
        Log.d("log", "onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        text += "onPause()\n";
        onState();
        Log.d("log", "onPause()");
    }

    private void onState() {
        textView.setText(text);
    }

    public void onButtonClick(View view) {
        Intent intent = new
