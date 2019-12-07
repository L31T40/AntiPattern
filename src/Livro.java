import java.util.Date;

public class Livro {

    String titulo;
    String editora;
    Date dataRequisicao;

    public Livro(String titulo, String editora) {
        this.titulo = titulo;
        this.editora = editora;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {

        return titulo;
    }

    public String getEditora() {

        return editora;
    }

    public void setDataRequisicao(Date dataRequisic) throws ExcepcaoDataIncorrecta {
        Date hoje = new Date();

        if(hoje.compareTo(dataRequisic) > 0)
        {
            throw new ExcepcaoDataIncorrecta();
        }else
        {
            this.dataRequisicao = dataRequisic;
        }
    }

    public Date getDataRequisicao() {
        return dataRequisicao;
    }
}
