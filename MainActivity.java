package com.example.leilane.trabalhodispmoveis;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btLogin = (Button) findViewById(R.id.btEntrar);
        btLogin.setOnClickListener(onClickLogin());
    }

    private View.OnClickListener onClickLogin() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.Login);
                TextView tSenha = (TextView) findViewById(R.id.Senha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if("usuario".equals(login)&&"senha".equals(senha)){
                    Intent intent = new Intent(getContext(),Cardapio.class);
                    Bundle params = new Bundle();
                    params.putString("nome", "usuario");
                    intent.putExtras(params);
                    startActivity(intent);

                }
                else{
                    alert("Login e senha incorretos!!");
                }
            }

        };

    }
    private Context getContext(){
        return this;
    }

    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }

}
