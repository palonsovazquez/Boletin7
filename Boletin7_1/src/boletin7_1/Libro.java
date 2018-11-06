/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

/**
 *
 * @author palonsovazquez
 */
public class Libro {

    private static Integer idUltimo = 0;
    private Integer id;
    private String titulo;
    private String autor;
    private Integer numeroExemplares;
    private Integer numeroExemplaresPrestados;

    public Libro() {
        id = idUltimo++;
    }

    public Libro(String titulo, String autor, Integer numeroExemplares, Integer numeroExemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroExemplares = numeroExemplares;
        this.numeroExemplaresPrestados = numeroExemplaresPrestados;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroExemplares() {
        return numeroExemplares;
    }

    public void setNumeroExemplares(Integer numeroExemplares) {
        this.numeroExemplares = numeroExemplares;
    }

    public Integer getNumeroExemplaresPrestados() {
        return numeroExemplaresPrestados;
    }

    public void setNumeroExemplaresPrestados(Integer numeroExemplaresPrestados) {
        this.numeroExemplaresPrestados = numeroExemplaresPrestados;
    }

    public Boolean Prestamo() {
        Boolean dev = false;
        if (numeroExemplares > numeroExemplaresPrestados) {
            numeroExemplaresPrestados++;
            dev = true;
        }
        return dev;

    }
public Boolean Devolucion(){
Boolean dev = false;
if(numeroExemplaresPrestados > 0){
numeroExemplaresPrestados--;
dev = true;
}



return dev;
}

    @Override
    public String toString() {
        return "****************************************************" + "\n*    titulo=" + titulo + ",\n*    autor=" + autor + ",\n*    numero Exemplares=" + numeroExemplares + ",\n*    numero Exemplares Prestados=" + numeroExemplaresPrestados + "\n****************************************************\n";
    }

}
