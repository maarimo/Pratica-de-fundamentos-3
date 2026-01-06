package model;

public class Professor extends Pessoa {

    private Double salario;

    public Professor(String name, Long id, int age, Double salario) {
        super(name, id, age);
        if(salario == null || salario <= 0){
            throw new IllegalArgumentException("Salario invalido");
        }
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if(salario == null || salario <= 0){
            throw new IllegalArgumentException("Salario invalido");
        }
        this.salario = salario;
    }

    @Override
    public String descricao() {
        return "Professor{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salário=" + salario +
                '}';
    }
}
