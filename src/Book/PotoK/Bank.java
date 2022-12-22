package Book.PotoK;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private final double[] accounts;

    private Lock bankLock;
    //объект класса ReentrantLock, реализующего интерфейс Lock

    private Condition sufficientFunds;

    /**
     * Конструирует объект банка
     *
     * @param n              Количество счетов
     * @param initialBalance Первоначальный остаток на каждом счете
     */

    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition(); // Возвращает объект условия, связ. с данной блокировкой
    }

    // будет считать с ошибкой, потому что 2 потока будут бороться за работу!

//    public void transfer(int from, int to, double amount) {
//        if (accounts[from] < amount) return;
//        System.out.println(Thread.currentThread());
//        accounts[from] -= amount;
//        System.out.printf("%10.2f from %d to %d", amount, from, to);
//        accounts[to] += amount;
//        System.out.printf(" Total balance: %10.2f%n", getTotalBalance());
//    }

    /**
     * Переводит деньги с одного счета на другой
     *
     * @param from   Счет, с которого переводятся деньги
     * @param to     Счет, на который переводятся деньги
     * @param amount Сумма перевода
     */
    // если использовать lock, то второй поток не может захватить первый пока
    // первый не отработает

//    public void transfer(int from, int to, double amount) throws InterruptedException {
//        bankLock.lock();
//        try {
//            while (accounts[from] < amount)
//                // вводит поток исполнения в набор ожидания по данному условию
//                sufficientFunds.await();
//            System.out.println(Thread.currentThread());
//            accounts[from] -= amount;
//            System.out.printf("%10.2f from %d to %d", amount, from, to);
//            accounts[to] += amount;
//            System.out.printf(" Total balance: %10.2f%n", getTotalBalance());
//            // разблокирует все потоки исполнения в наборе ожидания по данному условию
//            sufficientFunds.signalAll();
//        } finally {
//            bankLock.unlock();
//        }
//    }
//    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
//        while (accounts[from] < amount)
//            wait();  // ожидать по единственному условию встроенной блокировки объектов
//        System.out.println(Thread.currentThread());
//        accounts[from] -= amount;
//        System.out.printf("%10.2f from %d to %d", amount, from, to);
//        accounts[to] += amount;
//        System.out.printf(" Total balance: %10.2f%n", getTotalBalance());
//        // уведомлять все потоки, ожидающие по данному условию
//        notifyAll();
//    }

    // synchronized блоком (смысл тоже самое)
    public void transfer(int from, int to, double amount) throws InterruptedException {
        synchronized (this) {
            while (accounts[from] < amount)
                wait();  // ожидать по единственному условию встроенной блокировки объектов
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total balance: %10.2f%n", getTotalBalance());
            // уведомлять все потоки, ожидающие по данному условию
            notifyAll();
        }
    }


    /**
     * Получает сумму остатка на всех счетах
     *
     * @return Возвращает общий баланс
     */
//    public double getTotalBalance() {
//        bankLock.lock();
//        try {
//            double sum = 0;
//            for (double a : accounts)
//                sum += a;
//            return sum;
//        } finally {
//            bankLock.unlock();
//        }
//    }
    public synchronized double getTotalBalance() throws InterruptedException {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    /**
     * Получает количество счетов в банке
     *
     * @return Возвращает количество счетов
     */
    public int size() {
        return accounts.length;
    }
}
