public class UsaTrianguloData {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo1 = new Triangulo(2.5f,3f); // usando o construtor com pârametros
        float area = (triangulo1.base * triangulo1.altura)/2;
        System.out.println("Área: "+ area);

        Data data1 = new Data(10,02,2024);
        Data data2 = new Data();

        System.err.println("Dia: "+ data1.dia);
        System.err.println("Mês: "+ data1.mes);
        System.err.println("ano: "+ data1.ano);

        System.err.println("Dia: "+ data2.dia);
        System.err.println("Mês: "+ data2.mes);
        System.err.println("ano: "+ data2.ano);

    }
}
