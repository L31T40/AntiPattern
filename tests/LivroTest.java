import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void testgetTitulo() {
        Livro livro = new Livro("Palavra do Senhor","Viseu Editora");

        String teste = livro.getTitulo().toString();

        String test1 = teste.substring(0,2);
        String test2 = teste.substring(2,teste.length());

        teste = test1 + test2;

        assertEquals(teste,"Palavra do Senhor");
    }

    @Test
    void testsetEditora() {
        Livro livro = new Livro("Pessoas que nao sabem estar","Porto Editora");

        livro.setEditora("Lisboa Editora");

        assertEquals(livro.getEditora(),"Lisboa Editora");
    }


    @Test
    void testsetDataRequisicao()  {
        Livro livro = new Livro("Biblia","Cotovia");

        try {
            Date dats = new Date(2018,04,12);

            livro.setDataRequisicao(dats);
        } catch (ExcepcaoDataIncorrecta excepcaoDataIncorrecta) {
            throw new Error("Nao devia dar excepçao, mas deu");
        };

        assertEquals(livro.getDataRequisicao(),new Date(2018,04,12));


    }
}