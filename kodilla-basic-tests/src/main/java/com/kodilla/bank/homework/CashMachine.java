package com.kodilla.bank.homework;

public class CashMachine {
    private int transactions[];
    private int size;

    public CashMachine() {
        this.transactions = new int[0]; //Tabela z transakcjami
        this.size = 0;
    }

    public void addTransaction(int transaction) { //kopiowanie tabelii i dodawanie pozycji
        this.size++;
        int tempTrans[] = new int[this.size];
        System.arraycopy(transactions, 0, tempTrans, 0, transactions.length);
        tempTrans[this.size - 1] = transaction;
        this.transactions = tempTrans;
    }

    public int calculatingSaldo() {
        int saldoTrans = 0;
        for (int i = 0; i < transactions.length; i++) {
            saldoTrans = saldoTrans + transactions[i];
        }
                return saldoTrans;
    }


    public int countingNumberOfTrans() { // metoda podająca liczbe wykonanych trasakcji, operacji wogóle
        int transNumb = transactions.length;
        return transNumb;
    }

    public int withdrawalCounting() { //liczba wypłat
        int counter = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                counter++;
            }
        }
        return counter;
    }
    public int depositCounting() { //liczba wypłat
        int counter = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                counter++;
            }
        }
        return counter;
    }

    public int sumWithdrawalAmount() { //suma wypłat
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum += transactions[i];
            }
        }
        return sum;
    }

    public int sumDepositAmount() { //suma wpłat
        int sumD = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sumD += transactions[i];
            }
        }
        return sumD;
    }

    public int[] getTransactions() {
        return transactions;
    }

}


//    Utwórz pakiet com.kodilla.bank.homework, a w nim klasę CashMachine (Bankomat).
//   ok Ma ona zawierać tablicę ze zrealizowanymi transakcjami (liczbowa wartość dodatnia,
//    ok jeśli użytkownik wpłacił pieniądze i ujemna, jeśli użytkownik wypłacił pieniądze).
//    ok Dodaj metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.
//    Utwórz klasę Bank, która będzie zawierać tablicę bankomatów. Bank powinien mieć metody zwracające:
//
//        całkowity bilans ze wszystkich bankomatów,
//        ok liczbę transakcji związanych z wypłatą, OK
//       ok liczbę transakcji związaną z wpłatą pieniędzy,
//        średnią wartość wypłaty,
//        średnią wartość wpłaty.
//        Napisz odpowiednie testy, aby pokryć typowe sytuacje, jak i przypadki brzegowe.