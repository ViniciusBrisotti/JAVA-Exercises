
package bytebankherdado;

public class TesteFuncionario {
    public static void main(String[] args) {
        
    
    Funcionario employee1 = new Funcionario();
    
    employee1.setNome("Vinícius Brisotti");
    employee1.setCpf("01010101010-01");
    employee1.setSalario(3000);
    
        System.out.println(employee1.getNome());
        System.out.println(employee1.getBonificacao());
    }
}
