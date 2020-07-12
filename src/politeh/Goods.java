package politeh;

import java.util.*;

public class Goods implements GoodsOperations {
    private Product[] goods;
    private int length;
    private int lastIndex = 0;
    private boolean isSorted = false;

    public Goods(int size) {
        length = size;
        this.goods = new Product[size];
    }

    @Override
    public boolean add(Product product) {
        if (lastIndex == length) {
            System.out.println("Is full"); //
            return false;
        } else {
            goods[lastIndex] = product;
            lastIndex++;
            return true;
        }
    }

    @Override
    public void show() {
        if (isSorted) {
            System.out.println("AFTER sorting by profit:");
        } else {
            System.out.println("BEFORE sorting by profit:");
        }
        for (int i = 0; i < lastIndex; i++) {
            System.out.println(i + 1 + ". " + goods[i].getProductName() + "\t\tManufacturer: " +
                    goods[i].getManufacturerName() + "\tAmount: " + goods[i].getAmount() + "\tGuarantee: "
                    + goods[i].getGuarantee() + "\tTrade price: " + goods[i].getTradePrice() +
                    "\t\tRetail price: " + goods[i].getRetailPrice() + "\tProfit: " + goods[i].getProfit());
        }
        System.out.println();
    }

    private void show(HashSet<String> goods) {
        System.out.println("Difference: ");
        System.out.println(goods + "\n");
    }

    @Override
    public void showDifference(Goods g) {

        HashSet<String> thisGoods = new HashSet<>();
        HashSet<String> anotherGoods = new HashSet<>();
        for (int i = 0; i < lastIndex; i++) {
            thisGoods.add(this.goods[i].getProductName());
        }
        for (int i = 0; i < g.lastIndex; i++) {
            anotherGoods.add(g.goods[i].getProductName());
        }
        HashSet<String> temp = new HashSet<>(thisGoods);
        thisGoods.removeAll(anotherGoods);
        anotherGoods.removeAll(temp);
        thisGoods.addAll(anotherGoods);

        show(thisGoods);
    }


    @Override
    public void profitSorting() {
        Product temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastIndex - 1; i++) {
                if (goods[i].getProfit() < goods[i + 1].getProfit()) {
                    isSorted = false;

                    temp = goods[i];
                    goods[i] = goods[i + 1];
                    goods[i + 1] = temp;
                }
            }
        }
    }
}