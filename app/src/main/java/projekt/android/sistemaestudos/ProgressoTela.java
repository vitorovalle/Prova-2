package projekt.android.sistemaestudos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressoTela extends Activity {

    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresso_tela);

        botaoVoltar = (Button) findViewById(R.id.BotaoVoltarT4);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent trocaTela = new Intent(ProgressoTela.this, SegundaTela.class);
                startActivity(trocaTela);
            }
        });
    }
}
