package ec.edu.tecnologicoloja.prueba;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import ec.edu.tecnologico.prueba.Main2Activity;

public class MainActivity extends AppCompatActivity {
    private Button mButtonSend;
    private EditText mEditTextDate;
    private Spinner spinner;
    private Button a;
    private EditText b;
    private TextView c;
    private final String extra="Extracheck";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        a =(Button) findViewById(R.id.button);
        b=(EditText)findViewById(R.id.editText);
        c=(TextView) findViewById(R.id.textView);
        a.setOnClickListener(iniciar);

    }
    private View.OnClickListener iniciar= new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String str = b.getText().toString();
            if (str.isEmpty()){
                b.setError("El campo es obligatorio");
            }else{
                int numero;
                numero = Integer.parseInt(str);
                Intent intent= new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra(extra,numero);
                startActivity(intent);
            }

        }

    };
    private void setViews() {
        // Button
        mButtonSend = (Button) findViewById(R.id.button);

        // EditText
        mEditTextDate = (EditText) findViewById(R.id.editText);
        spinner = (Spinner) findViewById(R.id.spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_data, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

    }



}
