// Importaciones necesarias
import java.util.*;

// Clase Card - Representa una carta de poker
class Card {
    private String palo;    // tréboles, corazones, picas, diamantes
    private String color;   // rojo, negro
    private String valor;   // 2-10, A, J, Q, K
    
    // Constructor
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
    
    // Getters
    public String getPalo() {
        return palo;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getValor() {
        return valor;
    }
    
    // Método toString para mostrar la carta en formato requerido
    @Override
    public String toString() {
        return palo + "," + color + "," + valor;
    }
}

// Clase Deck - Representa el conjunto de 52 cartas de poker
class Deck {
    private List<Card> cartas;      // Lista para almacenar las cartas
    private Random random;          // Para operaciones aleatorias
    
    // Constructor - Inicializa el deck con 52 cartas
    public Deck() {
        cartas = new ArrayList<>();
        random = new Random();
        inicializarDeck();
    }
    
    // Método privado para inicializar las 52 cartas
    private void inicializarDeck() {
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        
        for (String palo : palos) {
            // Determinar el color según el palo
            String color = (palo.equals("Corazones") || palo.equals("Diamantes")) ? "Rojo" : "Negro";
            
            // Crear las 13 cartas de cada palo
            for (String valor : valores) {
                cartas.add(new Card(palo, color, valor));
            }
        }
    }
    
    // Método shuffle - Mezclar el deck
    public void shuffle() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }
    
    // Método head - Mostrar la primera carta del deck y removerla
    public Card head() {
        if (cartas.isEmpty()) {
            System.out.println("El deck está vacío.");
            return null;
        }
        
        Card carta = cartas.remove(0);  // Remover la primera carta
        System.out.println(carta + " Quedan " + cartas.size());
        return carta;
    }
    
    // Método pick - Seleccionar una carta al azar y removerla
    public Card pick() {
        if (cartas.isEmpty()) {
            System.out.println("El deck está vacío.");
            return null;
        }
        
        int indiceAleatorio = random.nextInt(cartas.size());
        Card carta = cartas.remove(indiceAleatorio);
        System.out.println(carta + " Quedan " + cartas.size());
        return carta;
    }
    
    // Método hand - Regresar un arreglo de 5 cartas y removerlas del deck
    public Card[] hand() {
        if (cartas.size() < 5) {
            System.out.println("No hay suficientes cartas para formar una mano.");
            return null;
        }
        
        Card[] mano = new Card[5];
        StringBuilder resultado = new StringBuilder();
        
        // Tomar 5 cartas del inicio del deck
        for (int i = 0; i < 5; i++) {
            mano[i] = cartas.remove(0);
            resultado.append(mano[i].toString());
            if (i < 4) {
                resultado.append(" ");
            }
        }
        
        resultado.append(" Quedan ").append(cartas.size());
        System.out.println(resultado.toString());
        return mano;
    }
    
    // Método auxiliar para mostrar el estado actual del deck
    public void mostrarEstado() {
        System.out.println("Cartas restantes en el deck: " + cartas.size());
    }
    
    // Método para verificar si el deck está vacío
    public boolean estaVacio() {
        return cartas.isEmpty();
    }
    
    // Método para obtener el número de cartas restantes
    public int getCartasRestantes() {
        return cartas.size();
    }
}

// Clase principal para probar el funcionamiento - NOMBRE EXACTO: PokerDeckSystem
public class PokerDeckSystem {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CARTAS DE POKER ===");
        System.out.println("Creado por: Jose Manuel Ceballos Lazaro");
        System.out.println("=======================================\n");
        
        // Crear un nuevo deck
        Deck deck = new Deck();
        System.out.println("✓ Deck creado con 52 cartas.\n");
        
        // Mostrar estado inicial
        deck.mostrarEstado();
        System.out.println();
        
        // Probar el método shuffle
        System.out.println("1. MEZCLANDO EL DECK:");
        deck.shuffle();
        System.out.println();
        
        // Probar el método head (primera carta)
        System.out.println("2. TOMANDO LA PRIMERA CARTA (HEAD):");
        Card primeraCartaA = deck.head();
        System.out.println();
        
        // Probar el método pick (carta aleatoria)
        System.out.println("3. TOMANDO CARTA ALEATORIA (PICK):");
        Card cartaAleatoria1 = deck.pick();
        Card cartaAleatoria2 = deck.pick();
        System.out.println();
        
        // Probar el método hand (5 cartas)
        System.out.println("4. TOMANDO UNA MANO DE 5 CARTAS (HAND):");
        Card[] mano1 = deck.hand();
        System.out.println();
        
        System.out.println("5. TOMANDO OTRA MANO DE 5 CARTAS:");
        Card[] mano2 = deck.hand();
        System.out.println();
        
        // Mostrar estado final
        System.out.println("6. ESTADO FINAL DEL DECK:");
        deck.mostrarEstado();
        System.out.println();
        
        // Demostración adicional - mezclar de nuevo y tomar más cartas
        System.out.println("7. PRUEBAS ADICIONALES:");
        deck.shuffle();
        System.out.println("Tomando 3 cartas individuales:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Carta " + (i+1) + ": ");
            deck.head();
        }
        System.out.println();
        
        System.out.println("Estado final:");
        deck.mostrarEstado();
        
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}