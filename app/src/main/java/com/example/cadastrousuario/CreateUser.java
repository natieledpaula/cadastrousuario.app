package com.example.cadastrousuario;

//Bloco de importaçoes
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

// Teste
public class CreateUser extends AppCompatActivity {
    TextInputEditText editNome, editEmail;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        btnSalvar = findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener(v -> {
            String nome = editNome.getText().toString();
            String email = editEmail.getText().toString();

            if(!nome.isEmpty()) {
                MainActivity.listaNomes.add(nome + "("+email+")");
                finish();
            }
        });
    }
}