package BancoExemplo;

public class Pessoa {

    private static final int tamanhoCpf = 11;
    private static final int tamanhoCnpj = 14;
    public enum tipoPessoa{
        FISICA, JURIDICA
    }
    public Integer codigo;
    public String nome;
    private String documento;
    public tipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()){
            throw new RuntimeException("documento nao pode ser nulo ou vazio");
        }
        if (documento.length() == tamanhoCpf){
            setdocumento(documento, tipoPessoa.FISICA);
        }else if(documento.length() == tamanhoCnpj){
            setdocumento(documento, tipoPessoa.JURIDICA);
        } else {
            throw new RuntimeException("Tamanho invalido para pessoa fisica ou juridica");
        }
    }

    private void setdocumento(String documento, tipoPessoa tipo) {
        this.documento = documento;
        this.tipo = tipo;
    }

    public tipoPessoa getTipo(){
        return tipo;
    }

}
