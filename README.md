# 🃏 Sistema de Cartas de Poker en Java

Un sistema completo de manejo de cartas de poker implementado en Java utilizando programación orientada a objetos y el Collection Framework.

## 📋 Descripción del Proyecto

Este proyecto implementa un sistema digital de baraja de poker que simula el comportamiento de un deck de cartas real. Permite mezclar cartas, extraer cartas individuales, seleccionar cartas al azar y formar manos de 5 cartas.

**Desarrollado como parte de:** Actividad 3 - Tema 10  
**Lenguaje:** Java  
**Conceptos aplicados:** POO, Collection Framework, Manejo de listas

## 🚀 Características Principales

- ✅ **52 cartas completas** - Baraja estándar de poker
- ✅ **4 palos** - Tréboles, Corazones, Picas, Diamantes  
- ✅ **2 colores** - Rojo y Negro
- ✅ **13 valores** - 2-10, A, J, Q, K
- ✅ **Mezcla aleatoria** - Shuffle del deck
- ✅ **Extracción de cartas** - Head, Pick, Hand
- ✅ **Conteo automático** - Cartas restantes en tiempo real

## 🎯 Funcionalidades

### Métodos Implementados:

| Método | Descripción | Salida |
|--------|-------------|---------|
| `shuffle()` | Mezcla todas las cartas del deck | "Se mezcló el Deck." |
| `head()` | Extrae la primera carta | "Palo,Color,Valor Quedan X" |
| `pick()` | Extrae una carta al azar | "Palo,Color,Valor Quedan X" |
| `hand()` | Extrae 5 cartas para una mano | "Carta1 Carta2 ... Carta5 Quedan X" |

## 🛠️ Tecnologías Utilizadas

- **Java** - Lenguaje de programación principal
- **Collection Framework** - List<Card> para manejo de datos
- **ArrayList** - Implementación de lista dinámica
- **Random** - Generación de números aleatorios
- **StringBuilder** - Construcción eficiente de strings

## 📁 Estructura del Proyecto

```
src/
└── PokerDeckSystem.java    # Archivo principal con todas las clases
    ├── Card                # Clase que representa una carta
    ├── Deck                # Clase que maneja el conjunto de cartas
    └── PokerDeckSystem     # Clase principal con método main
```

## 🚀 Cómo Ejecutar

### Prerequisitos
- Java 8 o superior
- IDE (NetBeans, IntelliJ, Eclipse) o línea de comandos

### Pasos para ejecutar:

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/[tu-usuario]/poker-deck-system.git
   ```

2. **Compilar:**
   ```bash
   javac PokerDeckSystem.java
   ```

3. **Ejecutar:**
   ```bash
   java PokerDeckSystem
   ```

### En NetBeans:
1. Abrir NetBeans
2. File → Open Project
3. Seleccionar la carpeta del proyecto
4. Presionar F6 para ejecutar

## 📊 Ejemplo de Salida

```
=== SISTEMA DE CARTAS DE POKER ===
Creado por: Jose Manuel Ceballos Lazaro
=======================================

✓ Deck creado con 52 cartas.

Cartas restantes en el deck: 52

1. MEZCLANDO EL DECK:
Se mezcló el Deck.

2. TOMANDO LA PRIMERA CARTA (HEAD):
Diamantes,Rojo,K Quedan 51

3. TOMANDO CARTA ALEATORIA (PICK):
Tréboles,Negro,7 Quedan 50
Picas,Negro,A Quedan 49

4. TOMANDO UNA MANO DE 5 CARTAS (HAND):
Corazones,Rojo,3 Diamantes,Rojo,9 Picas,Negro,J Tréboles,Negro,2 Corazones,Rojo,Q Quedan 44
```

## 🎮 Características del Sistema

### Clase Card
- **Atributos:** Palo, Color, Valor
- **Métodos:** Getters, toString()
- **Formato:** "Palo,Color,Valor"

### Clase Deck  
- **Capacidad:** 52 cartas únicas
- **Almacenamiento:** List<Card> (Collection Framework)
- **Operaciones:** Shuffle, Head, Pick, Hand
- **Validaciones:** Manejo de deck vacío

## 📈 Casos de Uso

- 🎯 **Juegos de cartas** - Base para implementar poker, blackjack, etc.
- 🎲 **Simulaciones** - Análisis probabilístico de manos
- 📚 **Educativo** - Aprendizaje de POO y Collections
- 🔄 **Testing** - Pruebas de algoritmos de cartas

## 🧪 Pruebas Incluidas

El programa incluye una demostración completa que prueba:
- ✅ Creación del deck completo
- ✅ Funcionalidad de mezcla
- ✅ Extracción de cartas individuales  
- ✅ Formación de manos
- ✅ Conteo correcto de cartas restantes
- ✅ Manejo de casos límite

## 👨‍💻 Autor

**Jose Manuel Ceballos Lazaro**
- 📧 Email: al02998119@tecmilenio.mx
- 🎓 Estudiante de Universidad Tecmilenio/Ing. en computacion administrativa

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Para contribuir:

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## ⭐ Agradecimientos

- Silvia Tello Zúñiga
- Computacion en java
- Actividad 4

---

⭐ **Si este proyecto te fue útil, no olvides darle una estrella!** ⭐
