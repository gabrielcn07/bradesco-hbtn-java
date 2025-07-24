public class GestaoAlunos {
    private ArrayList<Aluno> alunos;

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    
    public void excluirAluno(String nome) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : alunos) {
            ParaRemover = aluno;
            break;
        }

        if (alunoParaRemover != null) {
            alunos.remove(alunoParaRemover);
        }
    }


    public void buscarAluno(String nome){
         for(Aluno aluno : alunos){
            if(aluno.getNome().equalsIgnoreCase(nome)){
                System.out.println(aluno.toString());
            }
        }
    }

    public void listarAlunos(){
        for(Aluno aluno : alunos){
            System.out.println(aluno.toString());
        }
    }
}
