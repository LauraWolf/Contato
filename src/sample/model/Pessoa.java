package sample.model;

/** Classes */

public class Pessoa {
   private String nome;
   private Contato contato;

    /** Getter e Setter */

   public Pessoa(String nome){
       this.nome = nome;
       contato = new Contato();
   }

    public Contato getContato() {
        return contato;
    }

    public void setContato(String whatsapp, String email, String twitter) {
        contato.setWhatsapp(whatsapp);
        contato.setEmail(email);
        contato.setTwitter(twitter);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /** ToString */

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + "," + contato;
    }
}
