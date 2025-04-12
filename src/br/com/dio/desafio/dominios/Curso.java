package br.com.dio.desafio.dominios;

public class Curso extends Conteudo{

    //encapsulamento de atributos

    private int cargaHoraria;

    @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    //construtor

    public Curso() {
    }

    //guetter e setter

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
