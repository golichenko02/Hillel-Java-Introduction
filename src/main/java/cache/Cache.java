package cache;

public class Cache {
    final private int lifeTime;
    final private int size;
    private LRUMap<Integer, Object> objects;

    public Cache(int time, int size) {
        this.size = size;
        lifeTime = time;
        objects = new LRUMap<>(this.size);
        clear();
    }

    public void printAllValues() {
        System.out.println(objects.values());
    }

    public void put(Object obj) {
        objects.put(obj.hashCode(), obj);
    }

    public Object get(Object obj) {
        return objects.get(obj);
    }

    public synchronized void clear() {
        new Thread(() -> {
            try {
                Thread.sleep(lifeTime * 1000);
            } catch (InterruptedException ex) {
            }
            objects.clear();
        }).start();
    }

}
