public class Programa {
    public static void main(String[] args){

        /**PROGRAMAÇÃO ESTRUTURADA**/
        // String modelo1 = "Mille";
        // String modelo2 = "California";
        String[] modelos = {"Mille", "California"};
        int[] velocidades = {80, 300};
        String[] nomes = {"Pedro", "James", "Rafael"};
        int[] alturas = {175, 175, 180}; 
        
        /**PROGRAMAÇÃO ORIENTADA A OBJETOS**/
        Carro uno = new Carro();
        uno.modelo = "Mille";
        uno.velocidade = 80;

        Carro ferrari = new Carro();
        ferrari.modelo = "California";
        ferrari.velocidade = 300;


        Pessoa pedro = new Pessoa();
        pedro.nome = "Pedro";
        pedro.altura = 175;

        Pessoa james = new Pessoa();
        james.nome = "James";
        james.altura = 175;

        Pessoa rafael = new Pessoa();
        rafael.nome = "Rafael";
        rafael.altura = 180;
    }
}
