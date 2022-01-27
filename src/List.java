import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione 7 notas: ");

        java.util.List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.1);
        notas.add(6.4);
        notas.add(5.0);
        notas.add(9.1);
        notas.add(10.0);
        notas.add(3.6d);

        System.out.println(notas.toString());

        System.out.println("Apresentação da primeira nota da lista sem removê-la: " + notas.get(0));

        System.out.println("Apresentação da primeira nota da lista removendo-a :" + notas.remove(0));

        System.out.println(notas.toString());
    }

}
