package aed;

class Funciones {

    int cuadrado(int x) {
        int res = x*x;
        return res;
    }

    double distancia(double x, double y) {
        double res = Math.sqrt(x*x + y*y);
        return res;
    }

    boolean esPar(int n) {
        boolean res = false;
        int resto = Math.abs(n);
        while (resto>1) { 
            resto = resto - 2;
        }
        if (resto == 0) {
            res = true;
        }
        return res;
    }

    int mod (int m, int n){
        int res = m;
        while (res>=n){
            res = res - n;
        }
        return res;
    }

    boolean divideA(int m, int n) {
        boolean res;
        if (mod(n,m) == 0) {
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    boolean esBisiesto(int n) {
        boolean res;
        res = (divideA(4, n) && !divideA(100, n)) || divideA(400,n);

        return res;
    }

    int factorialIterativo(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }


    int factorialRecursivo(int n) {
        int res;
        if (n<=1) {
            res = 1;
        } else {
            res = n * factorialRecursivo(n-1);
        }
        return res;
    }

    int cantidadDivisores(int n){
        int res=0;
        for (int i = 2; i <n; i++) {
            if (divideA(i, n)) {
                res = res +1;
            }
        }
        return res;
    }


    boolean esPrimo(int n) {
        return (cantidadDivisores(n)==0 && n>=2);
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for (int i = 0; i < numeros.length; i++) {
            res = res + numeros[i];
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int res = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==buscado) {
                res = i;
            }
        }
        return res;
    }

    boolean tienePrimo(int[] numeros) {
        boolean res = false;
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                res = true;
            }
        }
        return res;
    }

    boolean todosPares(int[] numeros) {
        boolean res = true;
        for (int i = 0; i < numeros.length; i++) {
            if (!divideA(2,numeros[i])) {
                res = false;
            }
        }
        return res;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean res = true;
        for (int i = 0; i < s1.length(); i++) {
            if (i>=s2.length() || s1.charAt(i)!=s2.charAt(i)) {
                res = false;
            }
        }
        return res;
    }

    String invertirTexto(String texto){
        String res = "";
        for (int i = texto.length()-1; i >-1; i=i-1) {
            res = res + texto.charAt(i);
        }

        return res;
    } 

    boolean esSufijo(String s1, String s2) {
        boolean res = esPrefijo(invertirTexto(s1),invertirTexto(s2));
        return res;
    }
}
