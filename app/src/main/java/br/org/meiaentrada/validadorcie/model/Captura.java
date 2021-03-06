package br.org.meiaentrada.validadorcie.model;

import br.org.meiaentrada.validadorcie.util.HashUtil;


public class Captura {

    private String id;
    private String certificado;
    private String resultado;
    private String horario;
    private String evento;
    private String latitude;
    private String longitude;
    private String idDispositivo;

    public Captura() {
    }

    public Captura(String certificado, String resultado, String horario, String evento,
                   String latitude, String longitude, String idDispositivo) {

        this.certificado = certificado;
        this.resultado = resultado;
        this.horario = horario;
        this.evento = evento;
        this.latitude = latitude;
        this.longitude = longitude;
        this.idDispositivo = idDispositivo;

    }

    public Captura(String id, String certificado, String resultado, String horario, String evento,
                   String latitude, String longitude, String idDispositivo) {

        this.id = id;
        this.certificado = certificado;
        this.resultado = resultado;
        this.horario = horario;
        this.evento = evento;
        this.latitude = latitude;
        this.longitude = longitude;
        this.idDispositivo = idDispositivo;

    }

    public String getHashCertificado() {
        return certificado != null ? HashUtil.getMD5(certificado) : null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

}