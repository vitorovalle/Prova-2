package projekt.android.sistemaestudos;

import java.io.Serializable;



public class DataAtributos implements Serializable {

    private int matricula;
    private String nome;
    private String email;
    private String gitconta;
    private String curso;
    private String aula;
    private boolean lab;
    private boolean exercicio;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGitconta() {
        return gitconta;
    }

    public void setGitconta(String gitconta) {
        this.gitconta = gitconta;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public boolean isLab() {
        return lab;
    }

    public void setLab(boolean lab) {
        this.lab = lab;
    }

    public boolean isExercicio() {
        return exercicio;
    }

    public void setExercicio(boolean exercicio) {
        this.exercicio = exercicio;
    }


}
