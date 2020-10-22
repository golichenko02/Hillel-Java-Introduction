package cache;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Human oleg = new Human("Oleg", 23);
        Human dima = new Human("Dima", 28);
        Human sasha = new Human("Sasha", 18);
        Human maks = new Human("Maks", 32);
        Human yura = new Human("Yura", 26);
        Cache cache = new Cache(4, 4);


        cache.put(oleg);
        cache.put(dima);
        cache.put(sasha);
        cache.put(maks);

        cache.printAllValues();


        System.out.println(cache.get(oleg)); // Олег стал чаще используемым
        System.out.println(cache.get(sasha)); // Саша стал чаще используемым

        //так как кеш забит, то Юра должен стать на место либо Макса, либо Димы (они менее используемы).
        //Но Макс был добвлен позже --> > Юра становится на место Димы
        cache.put(yura);

        // собственно сам результат этого процесса и осталась еще одна секунда до очистки кеша(в конструкторе 4сек.)
        Thread.sleep(3000);
        cache.printAllValues();

        // а сейчас уже кеш очистился и тут пусто
        Thread.sleep(1000);
        cache.printAllValues();
    }
}
