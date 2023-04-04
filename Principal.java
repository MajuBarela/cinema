public class Principal {
    
    public static void main(String[] args) {
        Filme f = new Filme(); 

        f.setCodigo(13);

        f.setValor(25);

        f.setNome("Velozes e furiosos 10");


        f.setDisponivel(true);
        if(f.isDisponivel()){
            System.out.println(" " + f.getCodigo());
        } else {
            System.out.println("Filme não disponível!");
        }
    }
}
