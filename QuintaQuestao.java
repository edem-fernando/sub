package prova;

import java.util.Date;

// Quinta Questao
public class QuintaQuestao {

    // Crie uma empresa
    public Empresa criarEmpresa(String nome, String cnpj) {
        return new Empresa(nome, cnpj);
    }

    // Adicione aos departamentos alguns funcionários;
    public Departamento adicionarFuncionarios(String depName) {
        Date current = new Date();

        Funcionario edem = new Funcionario("Edem", 2400, current);
        Funcionario joao = new Funcionario("Joao", 6500, current);

        Departamento tecnologia = new Departamento();
        tecnologia.nome = depName;

        tecnologia.funcionarios.add(edem);
        tecnologia.funcionarios.add(joao);

        // exibe o nome dos funcionarios
        for (int i = 0; i < tecnologia.funcionarios.size(); i++) {
            Funcionario funcionarioTec = (Funcionario) tecnologia.funcionarios.get(i);
            System.out.println(funcionarioTec.nome);
        }

        return tecnologia;
    }

    // Adicione a esta empresa alguns departamentos
    public void adicionarDepartamentos() {
        Empresa empresa = this.criarEmpresa("Umbrela", "61.161.779/0001-11");

        Departamento tec = this.adicionarFuncionarios("Tecnologia");
        empresa.departamentos.add(tec);

        // exibe o nome dos departamentos da empresa
        for (int i = 0; i < empresa.departamentos.size(); i++) {
            Departamento dep = (Departamento) empresa.departamentos.get(i);
            System.out.println(dep.nome);
        }
    }
}
