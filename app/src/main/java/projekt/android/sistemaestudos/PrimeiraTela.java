package projekt.android.sistemaestudos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrimeiraTela extends Activity {

    private Button botaoAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);

        botaoAcessar = (Button) findViewById(R.id.BotaoAcessarT1);

        botaoAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent trocaTela = new Intent(PrimeiraTela.this, SegundaTela.class);
                startActivity(trocaTela);

            }
        });
    }
}