package main.ejercicio2;

import java.util.HashSet;

public class RespuestasOptimizadas {

    // 1. Buscar duplicados en un arreglo
    public static String tieneDuplicadosComplejidad = "O(n)";

    public static boolean tieneDuplicadosOpt(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true; // Duplicado encontrado
            }
            set.add(num);
        }
        return false; // No hay duplicados
    }

    // 2. Contar elementos mayores que X
    public static String contarMayoresComplejidad = "O(n)";

    public static int contarMayoresOpt(int[] arr, int x) {
        int contador = 0;
        for (int num : arr) {
            if (num > x) { 
                contador++;
            }
        }
        return contador;
    }

    // 3. Encontrar el valor máximo en un arreglo
    public static String encontrarMaximoComplejidad = "O(n)";

    public static int encontrarMaximoOpt(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}


