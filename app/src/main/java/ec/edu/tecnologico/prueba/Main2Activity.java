package ec.edu.tecnologico.prueba;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import ec.edu.tecnologicoloja.prueba.MainActivity;
import ec.edu.tecnologicoloja.prueba.R;

public class Main2Activity extends AppCompatActivity {
    private TextView label;
    //private int numero;
    private Button a;
    private final String extra="Extracheck";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        label=(TextView)findViewById(R.id.textView2);
        a=findViewById(R.id.button2);

       a.setOnClickListener(iniciar);

    }
    private View.OnClickListener iniciar= new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent= new Intent(Main2Activity.this, MainActivity.class);
            startActivity(intent);
        }

    };


}
