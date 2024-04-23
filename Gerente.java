
package va2;


public class Gerente {
    private int id;
    private String nome;
    private String cpf;

    public Gerente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    Gerente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gerente other = (Gerente) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Gerente{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
    
    
    
    
   
}
