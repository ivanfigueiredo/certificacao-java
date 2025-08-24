package thread;

import java.util.*;
import java.util.concurrent.*;


public class ConcurrentHashMapEstudo {
    private static void semConcurrentHashMap() {
        try {
            final Map<String, Integer> hash = new HashMap<>();
            hash.put("penguin", 1);
            hash.put("flamingo", 2);
            for (String key : hash.keySet()) {
                hash.remove(key);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Erro ConcurrentModificationException");
        }
    }

    private static void comConcurrentHashMap() {
        try {
            final Map<String, Integer> hash = new ConcurrentHashMap<>();
            hash.put("penguin", 1);
            hash.put("flamingo", 2);
            for (String key : hash.keySet()) {
                hash.remove(key);
            }
            System.out.println("Removido com sucesso");
        } catch (ConcurrentModificationException e) {
            System.out.println("Erro  3 ConcurrentModificationException");
        }
    }

    public static void main(final String[] args) {
        semConcurrentHashMap();
        comConcurrentHashMap();
    }
}
