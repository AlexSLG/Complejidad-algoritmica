public class Ejercicio{
    private static int suma ( int v [ ] , int tamaño ) {
        int i ; int result;
        result = 0 ;
        for ( i = 0 ; i <= tamaño - 1 ; 1 ++ )
        {
            result += result + v [ i ] ;
        }
        return result;
    }
}
