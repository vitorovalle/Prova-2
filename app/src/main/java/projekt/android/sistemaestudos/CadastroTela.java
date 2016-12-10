package projekt.android.sistemaestudos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class CadastroTela extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_tela);

        Spinner spinner = (Spinner) findViewById(R.id.Cursoseletor2);

        ArrayList<String> cursolista2 = new ArrayList<String>();

        cursolista2.add("Linguagem de Programação 1");
        cursolista2.add("Banco de Dados");
        cursolista2.add("Algoritmos");
        cursolista2.add("Estrutura de Dados");
        cursolista2.add("Projeto Integrador I");

        ArrayAdapter<String > ac=new ArrayAdapter<String> (CadastroTela.this,
                android.R.layout.simple_spinner_dropdown_item, cursolista2);

        spinner.setAdapter(ac);
    }
}
