package com.example.ivants.cmdperdidadatos;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static  final String TAG = "DATO";
    TextView tv;
    EditText ed;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");

        tv = (TextView)findViewById(R.id.textView);
        ed = (EditText)findViewById(R.id.editText);
        btnEnviar = (Button)findViewById(R.id.enviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(ed.getText().toString());
            }
        });

        /**
         * Segunda forma para salvar datos
        if (savedInstanceState != null){
            tv.setText("hola de nuevo");
        }else{
            tv.setText("Hola uno");
        }*/
    }

    /**
     * Primera forma para guardaar los datos y no perderlos
    @Override
     */
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("guardado",tv.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        tv.setText(savedInstanceState.getString("guardado"));
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}
