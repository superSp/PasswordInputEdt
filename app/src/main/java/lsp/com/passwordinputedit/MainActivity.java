package lsp.com.passwordinputedit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import lsp.com.lib.PasswordInputEdt;

public class MainActivity extends AppCompatActivity {

    private PasswordInputEdt edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = (PasswordInputEdt) findViewById(R.id.edt);

        edt.setOnInputOverListener(new PasswordInputEdt.onInputOverListener() {
            @Override
            public void onInputOver(String text) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
