package projekt.android.sistemaestudos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class SegundaTela extends Activity {

    private Button botaoProgresso;
    private Button botaoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        botaoProgresso = (Button) findViewById(R.id.BotaoProgressoT2);

        botaoProgresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent trocaTela = new Intent(SegundaTela.this, ProgressoTela.class);
                startActivity(trocaTela);
            }
        });

        botaoCadastro = (Button) findViewById(R.id.BotaoCadastroT2);

        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {

                Intent telaTroca = new Intent(SegundaTela.this, CadastroTela.class);
                startActivity(telaTroca);
            }
        });


        Spinner spinner = (Spinner) findViewById(R.id.Cursoseletor);

        ArrayList<String> cursolista = new ArrayList<String>();

        cursolista.add("Linguagem de Programação 1");
        cursolista.add("Banco de Dados");
        cursolista.add("Algoritmos");
        cursolista.add("Estrutura de Dados");
        cursolista.add("Projeto Integrador I");

        ArrayAdapter<String > aa=new ArrayAdapter<String> (SegundaTela.this,
                android.R.layout.simple_spinner_dropdown_item, cursolista);

        spinner.setAdapter(aa);

        Spinner spinner2 = (Spinner) findViewById(R.id.Aulaseletor);

        ArrayList<String> aulalista = new ArrayList<String>();

        aulalista.add("Aula 1");
        aulalista.add("Aula 2");
        aulalista.add("Aula 3");
        aulalista.add("Aula 4");
        aulalista.add("Aula 5");

        ArrayAdapter<String > ab=new ArrayAdapter<String> (SegundaTela.this,
                android.R.layout.simple_spinner_dropdown_item, aulalista);

        spinner2.setAdapter(ab);
    }
}