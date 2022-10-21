package function_array;

//4. Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a
//   function named searchItem(String item) which will be used to search any item from your HashMap and return
//   the price. If found no item, then print message as "No item found" and another function named totalSum()
//   which will return total price of items.

import java.util.HashMap;

public class Bazar_List_04 {
    public static void main(String[] args) {
        Bazar_List_04 bazar = new Bazar_List_04();
        bazar.searchItem("coffee");
        bazar.searchItem("sugar");
        bazar.totalSum();
    }

    public void searchItem(String item){
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        list.put("soap",200);
        list.put("shampoo",800);
        list.put("coffee",400);
        list.put("milk",400);
        list.put("fruits",300);
        if (list.containsKey(item)){
            System.out.println(list.get(item));
        }
        else {
            System.out.println("no item found");
        }

    }
    public int totalSum(){
        int sum = 0;
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        list.put("soap",200);
        list.put("shampoo",800);
        list.put("coffee",400);
        list.put("milk",400);
        list.put("fruits",300);

        for (int i : list.values()){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

}

