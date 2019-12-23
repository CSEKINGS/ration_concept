package com.e_rationqueue.app;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.EditText;
        import android.widget.Spinner;

        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.auth.FirebaseUser;

        import java.util.concurrent.atomic.AtomicMarkableReference;


public class SecondActivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    private EditText quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        quantity = (EditText) findViewById(R.id.quanttext);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Products, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        firebaseAuth = FirebaseAuth.getInstance();


        FirebaseUser user = firebaseAuth.getCurrentUser();

        String text = spinner.getSelectedItem().toString().trim();
        String amount = quantity.getText().toString().trim();


    }
}




