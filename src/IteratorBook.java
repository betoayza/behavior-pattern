public interface IteratorBook {
    // Hay más usuario en el iterador?
    Book next();
    // reinicia el iterador / contador
    void reset();
    // obtiene el siguiente
    boolean hasMore();
}
