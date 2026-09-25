package caraoucoroa;

public enum Lado {
    CARA("cara"),
    COROA("coroa");
    private final String descricao;
    Lado(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public static Lado deTexto(String texto){
        for (Lado lado : Lado.values()){
            if (lado.descricao.equalsIgnoreCase(texto.trim())){
                return  lado;
            }
        }
        throw new IllegalArgumentException("Lado inválido: " + texto);
    }
    
}