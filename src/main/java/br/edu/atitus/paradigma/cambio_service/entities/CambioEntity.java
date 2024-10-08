package br.edu.atitus.paradigma.cambio_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name =  "cambio")
public class CambioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String origem;
	private String destino;
	private double fator;
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getFator() {
		return fator;
	}
	public void setFator(double fator) {
		this.fator = fator;
	}
	
	@Transient
	private String ambiente;
	

	public void setAmbiente(String string) {
		// TODO Auto-generated method stub
		
	}
	@Transient 
	private double valorConvertido;
	
	public void setValorConvertido(Double valorConvertido) {
        this.valorConvertido = valorConvertido;
		// TODO Auto-generated method stub
		
	}
    public Double getValorConvertido() {
        return valorConvertido;
    }
}
