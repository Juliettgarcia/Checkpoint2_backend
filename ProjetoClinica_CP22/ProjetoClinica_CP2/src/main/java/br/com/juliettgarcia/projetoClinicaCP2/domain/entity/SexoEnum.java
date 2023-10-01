package br.com.juliettgarcia.projetoClinicaCP2.domain.entity;

public enum SexoEnum {
    M ("Masculino"), F ("Feminino");
    private String generoNome;

    SexoEnum(String generoNome) {
        this.generoNome = generoNome;
    }

    public String getGeneroNome() {
        return generoNome;
    }
}
