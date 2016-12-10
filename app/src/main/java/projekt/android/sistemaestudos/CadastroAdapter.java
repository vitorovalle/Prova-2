package projekt.android.sistemaestudos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;

/**
 * Created by Principal on 10/12/2016.
 */

public class CadastroAdapter extends BaseAdapter {

    private List<Cadastro> cadastro;
    private Context contexto;
    private InstanciaVisao instanciaVisao;

    public CadastroAdapter (Context contextoParam, List<Cadastro> arrayCadastro) {
        contexto = contextoParam;
        cadastro = arrayCadastro;
    }

    @Override
    public int getCount() {
        return cadastro.size();
    }

    @Override
    public Object getItem(int i) {
        return cadastro.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    if(view == null){
        LayoutInflater inflador = (LayoutInflater)
                contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflador.inflate(R.layout.activity_cadastro_tela, null);
        instanciaVisao = new InstanciaVisao();
        instanciaVisao.setMatriculaCampo((EditText)
                view.findViewById(R.id.MatriculaCampo)
    view.setTag(instanciaVisao);}

    }
