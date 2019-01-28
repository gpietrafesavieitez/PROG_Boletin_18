/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_18_1a;

import boletin_18_1b.Persoal;

/**
 *
 * @author Gabriel
 */
public class Academica {
    private static int numReferencia = 2017;
    private String nome;
    private int nota;
    private Persoal alum;
    
    public Academica(){
        numReferencia++;
    }

    public Academica(String nome, int nota, Persoal alum) {
        numReferencia++;
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(byte nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Academica{" + "numReferencia=" + numReferencia + ", nome=" + nome + ", nota=" + nota + ", alum=" + alum + '}';
    }
}
