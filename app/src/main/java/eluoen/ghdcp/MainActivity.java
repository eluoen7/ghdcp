package eluoen.ghdcp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import junit.framework.Test;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_test = (Button) findViewById(R.id.btn_test);
        btn_test.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_test:

                Toast.makeText(this,"第六次github测试",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                startActivity(intent);


            break;

        }
    }
}
