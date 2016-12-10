package projekt.android.sistemaestudos;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;

public class DataModel {

    public static long criarRegistro(DataAtributos dataAtributos, Context contexto) {

        DataVault openHelper = new DataVault(contexto);
        SQLiteDatabase bancoDados = openHelper.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("matricula", dataAtributos.getMatricula());
        valores.put("nome", dataAtributos.getNome());
        valores.put("email", dataAtributos.getEmail());
        valores.put("gitconta", dataAtributos.getGitconta());
        valores.put("curso", dataAtributos.getCurso());
        valores.put("aula", dataAtributos.getAula());
        valores.put("lab", dataAtributos.isLab());
        valores.put("exercicio", dataAtributos.isExercicio());
        long id = bancoDados.insert("tabela_mestra", null, valores);

        bancoDados.close();

        return id;
    }

    public static DataAtributos buscarRegistro(long id, Context contexto) {
        DataVault openHelper = new DataVault(contexto);
        SQLiteDatabase bancoDados = openHelper.getReadableDatabase();

        Cursor c = bancoDados.query("tabela_mestra", new String[]{"matricula", "nome", "email", "gitconta", "curso", "aula", "lab", "exercicio"},
                "matricula =" + id, null, null, null, null);


        }

    DataAtributos t = null;
    c.moveToFirst();
    while(!c.isAfterLast())

    {
        t = new DataAtributos();
        t.setMatricula(c.getInt(0));
        t.setNome(c.getString(1));
        t.setEmail(c.getString(2));
        t.setGitconta(c.getString(3));
        t.setCurso(c.getString(4));
        t.setAula(c.getString(5));
        t.setLab(Boolean.getBoolean(c.getString(6)));
        t.setExercicio(Boolean.getBoolean(c.getString(7)));

        c.moveToNext();
    }

    {
        c.close();
        bancoDados.close();
        return t;
    }

    public static int removerRegistro(long idParam, Context contexto) {
        DataVault openHelper = new DataVault(contexto);
        SQLiteDatabase bancoDados = openHelper.getReadableDatabase();

        int linhas = bancoDados.delete("tabela_mestra", "matricula=" + idParam, null);
        bancoDados.close();
        return linhas;

    }
}