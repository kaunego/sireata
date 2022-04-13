package br.edu.utfpr.dv.sireata.model;

import java.util.ArrayList;
import java.util.List;

public class AtaReport {
	
	public String departamento;
	public String orgao;
	public String numero;
	public String dataHora;
	public String local;
	public List<ParticipanteReport> participantesMembros;
	public List<ParticipanteReport> demaisParticipantes;
	public String presidente;
	public String secretario;
	public String texto;
	
	public AtaReport(){
		this.setDepartamento("");
		this.setOrgao("");
		this.setNumero("");
		this.setDataHora("");
		this.setLocal("");
		this.setParticipantesMembros(new ArrayList<ParticipanteReport>());
		this.setDemaisParticipantes(new ArrayList<ParticipanteReport>());
		this.setPresidente("");
		this.setSecretario("");
		this.setTexto("");
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public List<ParticipanteReport> getParticipantesMembros() {
		return participantesMembros;
	}
        
        
        
        //Os metodos foram separados e a variavel local substituida pelo novo método.
        
	public String getStringParticipantesMembros(){
		if((this.getParticipantesMembros() != null) && (this.getParticipantesMembros().size() > 0)){
		
			return getmembros(this.getParticipantesMembros());
		}else{
			return "";
		}
	}
        
        //Os metodos foram separados e a variavel local substituida pelo novo método.
        private  String getmembros(List<ParticipanteReport> participantes){
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < participantes.size(); i++) {
        sb = sb.append(", ");
        sb = sb.append(participantes.get(i).getNome());
    }
 
    sb = sb.append(".");
    
    return sb.toString();
}
        
        //Os metodos foram separados e a variavel local substituida pelo novo método.
	public void setParticipantesMembros(List<ParticipanteReport> participantesMembros) {
		this.participantesMembros = participantesMembros;
	}
	public String getStringDemaisParticipantes(){
		if((this.getDemaisParticipantes() != null) && (this.getDemaisParticipantes().size() > 0)){
			return getmembros(this.getDemaisParticipantes());
		}else{
			return "";
		}
	}
        
        
        
	public List<ParticipanteReport> getDemaisParticipantes() {
		return demaisParticipantes;
	}
	public void setDemaisParticipantes(List<ParticipanteReport> demaisParticipantes) {
		this.demaisParticipantes = demaisParticipantes;
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	public String getSecretario() {
		return secretario;
	}
	public void setSecretario(String secretario) {
		this.secretario = secretario;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

}
