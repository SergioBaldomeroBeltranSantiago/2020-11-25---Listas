package Listas;

public class Tarea20201130 {

    public static void main(String[] args) {
        Lista<String> list = new ListaEnlazada<>();
        list.add("uno");
        list.add("dos");
        list.add("tres");
        Iterador<String> iterator = list.iter();
        int i = 1;
        while (iterator.hasNext()) {
            System.out.println("Elemento: " + i + " " + iterator.next());
            i++;
        }
        System.out.println("----");
        try {
            // se adiciona un elemento, ahora en una posición intermedia
            list.add(3, "a");
            // se vuelve a imprimir
            iterator = list.iter();
            i = 1;
            while (iterator.hasNext()) {
                System.out.println("Elemento: " + i + "  " + iterator.next());
                i++;
            }
            System.out.println("-----");
            // uso de varios métodos.
            System.out.println("¿Esta el dos? : " + list.contains("dos"));
            System.out.println("¿Quien esta en la posicion 3? : " + list.get(3));
            System.out.println("Eliminar el elemento a");
            list.remove(list.getIndex("a"));
            // volver a imprimir
            iterator = list.iter();
            i = 1;
            while (iterator.hasNext()) {
                System.out.println("Elemento: " + i + "  " + iterator.next());
                i++;
            }
            System.out.println("-----");
            // eliminar un elemento de la lista
            System.out.println("Eliminar el segundo elemento");
            list.remove(2);
            // iterar para imprimir
            iterator = list.iter();
            i = 1;
            while (iterator.hasNext()) {
                System.out.println("Elemento: " + i + "  " + iterator.next());
                i++;
            }
            System.out.println("\n¿Esta vacia? " + list.isEmpty());
        } catch (PosicIncE e) {
            System.out.println("La posicion es incorrecta");
        } catch (ElemNoEncE e) {
            System.out.println("Elemento no encontrado");
        }

    }

}
