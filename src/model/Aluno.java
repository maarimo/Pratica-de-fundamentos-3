package model;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(Long id, String name, int age, int matricula) {
        super(name, id, age);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String descricao() {
        return "Aluno{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", matricula=" + matricula +
                '}';
    }
}
