
package com.kodilla.bank.homework;

import java.util.Arrays;


public class Bank {

    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }


    public void add(CashMachine cashMachine) { //tworzenie tablicy z bankomatami
        this.size++;
        CashMachine tempCash[] = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, tempCash, 0, cashMachines.length);//kopiowanie tabeli i dodawanie bankomatu
        tempCash[this.size - 1] = cashMachine;
        this.cashMachines = tempCash;
    }


    public int sumSaldoFromAllCashMachines() {  // metoda zawierająca całkowity bilans ze wszystkich bankomatów,
        int totalSaldo = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSaldo += cashMachines[i].calculatingSaldo();
        }
        return totalSaldo;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public int sumWithdrawalNumber() { // metoda zawierająca liczbę transakcji związanych z wypłatą,
        int totalNumberWithdrawal = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberWithdrawal += cashMachines[i].withdrawalCounting();
        }
        return totalNumberWithdrawal;
    }


    public int sumDepositNumber() {// metoda zawierająca liczbę transakcji związaną z wpłatą pieniędzy,
        int totalNumberDeposit = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberDeposit += cashMachines[i].depositCounting();
        }
        return totalNumberDeposit;
    }


    public int averageWithdrawalAmount() { // metoda zawierająca średnią wartość wypłaty,
        int totalWithdrawal = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalWithdrawal += cashMachines[i].sumWithdrawalAmount();
        }
        return totalWithdrawal / sumWithdrawalNumber();
    }


    public int averageDepositAmount() {// metoda zawierająca średnią wartość wpłaty.
        int totalDeposit = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalDeposit += cashMachines[i].sumDepositAmount();
        }
        return totalDeposit / sumDepositNumber();
    }
}


//
//package com.kodilla.bank.homework;
//
//public class CashMachine {
//    private int transactions[];
//    private int size;
//
//    public CashMachine() {
//        this.transactions = new int[0]; //Tabela z transakcjami
//        this.size = 0;
//    }
//
//    public void addTransaction(int transaction) { //kopiowanie tabelii i dodawanie pozycji
//        this.size++;
//        int tempTrans[] = new int[this.size];
//        System.arraycopy(transactions, 0, tempTrans, 0, transactions.length);
//        tempTrans[this.size - 1] = transaction;
//        this.transactions = tempTrans;
//    }
//
//    public int calculatingSaldo() {
//        int saldoTrans = 0;
//        for (int i = 0; i < transactions.length; i++) {
//            saldoTrans = saldoTrans + transactions[i];
//        }
//        return saldoTrans;
//    }
//
//
//    public int countingNumberOfTrans() { // metoda podająca liczbe wykonanych trasakcji, operacji wogóle
//        int transNumb = transactions.length;
//        return transNumb;
//    }
//
//    public int withdrawalCounting() { //liczba wypłat
//        int counter = 0;
//        for (int i = 0; i < transactions.length; i++) {
//            if (transactions[i] < 0) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//    public int depositCounting() { //liczba wypłat
//        int counter = 0;
//        for (int i = 0; i < transactions.length; i++) {
//            if (transactions[i] > 0) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//
//    public int sumWithdrawalAmount() { //suma wypłat
//        int sum = 0;
//        for (int i = 0; i < transactions.length; i++) {
//            if (transactions[i] < 0) {
//                sum += transactions[i];
//            }
//        }
//        return sum;
//    }
//
//    public int sumDepositAmount() { //suma wpłat
//        int sumD = 0;
//        for (int i = 0; i < transactions.length; i++) {
//            if (transactions[i] > 0) {
//                sumD += transactions[i];
//            }
//        }
//        return sumD;
//    }
//
//    public int[] getTransactions() {
//        return transactions;
//    }
//
//}
//
//
////    Utwórz pakiet com.kodilla.bank.homework, a w nim klasę CashMachine (Bankomat).
////   ok Ma ona zawierać tablicę ze zrealizowanymi transakcjami (liczbowa wartość dodatnia,
////    ok jeśli użytkownik wpłacił pieniądze i ujemna, jeśli użytkownik wypłacił pieniądze).
////    ok Dodaj metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.
////    Utwórz klasę Bank, która będzie zawierać tablicę bankomatów. Bank powinien mieć metody zwracające:
////
////        całkowity bilans ze wszystkich bankomatów,
////        ok liczbę transakcji związanych z wypłatą, OK
////       ok liczbę transakcji związaną z wpłatą pieniędzy,
////        średnią wartość wypłaty,
////        średnią wartość wpłaty.
////        Napisz odpowiednie testy, aby pokryć typowe sytuacje, jak i przypadki brzegowe.