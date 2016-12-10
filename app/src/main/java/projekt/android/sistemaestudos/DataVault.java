package projekt.android.sistemaestudos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataVault extends SQLiteOpenHelper {

    private static final String Nome_banco = "ElBanco";
    private static final int Versao_banco = 1;

    private Context contexto;

    public DataVault(Context context) {
        super(context, Nome_banco, null, Versao_banco);
        this.contexto = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE tabela_mestra" +
                     "(matricula integer PRIMARY KEY " +
                     " nome text" +
                     " email text" +
                     " gitconta text" +
                     " curso text" +
                     " aula text" +
                     " lab boolean" +
                     " exercicio boolean)";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
