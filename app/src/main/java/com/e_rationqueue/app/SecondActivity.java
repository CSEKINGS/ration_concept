package com.e_rationqueue.app;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SecondActivity extends AppCompatActivity {
    EditText quantity;
    Button submit;
    Spinner dropdown;
    DatabaseReference databaseProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        databaseProducts = FirebaseDatabase.getInstance().getReference("product");

        quantity = findViewById(R.id.quanttext);
        submit = findViewById(R.id.btnSubmit);
        dropdown = findViewById(R.id.spinner);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("message");
                myRef.setValue("Hello, World!");
                addProduct();
            }
        });
    }

    private void addProduct() {
        String product = quantity.getText().toString().trim();
        String quantity = dropdown.getSelectedItem().toString();
        if (!TextUtils.isEmpty(product)) {
            String id = databaseProducts.push().getKey();
            product product1 = new product(id, product, quantity);
            assert id != null;
            databaseProducts.child(id).setValue(product1);
            Toast.makeText(this, "Product added", Toast.LENGTH_LONG).show();
            databaseProducts.child("item").setValue(new product("1", "rice", "100"));
        } else {
            Toast.makeText(this, "You should enter the quantity", Toast.LENGTH_LONG).show();
        }
    }
}




