package projekt.android.sistemaestudos;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Principal on 10/12/2016.
 */

public class InstanciaVisao {

    private EditText NomeCampo;
    private EditText MatriculaCampo;
    private EditText EmailCampo;
    private EditText GitcontaCampo;

    public EditText getNomeCampo() {
        return NomeCampo;
    }

    public EditText getMatriculaCampo() {
        return MatriculaCampo;
    }

    public EditText getEmailCampo() {
        return EmailCampo;
    }

    public EditText getGitcontaCampo() {
        return GitcontaCampo;
    }

    public void setNomeCampo(EditText nomeCampo) {
        this.NomeCampo = nomeCampo;
    }

    public void setMatriculaCampo(EditText matriculaCampo) {
        this.MatriculaCampo = matriculaCampo;
    }

    public void setEmailCampo(EditText emailCampo) {
        this.EmailCampo = emailCampo;
    }

    public void setGitcontaCampo(EditText gitcontaCampo) {
        this.GitcontaCampo = gitcontaCampo;
    }
}