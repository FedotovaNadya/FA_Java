package sem3.task1;

import java.util.Scanner;

public class Main {
    public static void printFreeTables(Table[] tables) {
        for (Table table : tables) {
            if (!table.getOccupied()) {
                System.out.println(table.getTableName());
            }

        }
    }

    public static Table selectTable(Table[] tables, Scanner scanner) {
        int tableN;
        Table table;
        System.out.println("Введите номер стола");
        tableN = scanner.nextInt();
        table = tables[tableN];
        return table;
    }

    public static Dish selectDish(Menu menu, Scanner scanner) {

        return menu.getDish(scanner.nextInt());
    }

    public static Dish[] selectDishs(Menu menu, Scanner scanner) {
        menu.printActualMenu();
        int kol;
        Dish[] dishs = {};
        System.out.println("Введите количество блюд");
        kol = scanner.nextInt();
        for (int i = 0; i < kol; i++) {
            try {
                dishs[i] = selectDish(menu, scanner);
            } catch (Exception e) {

            }
        }
        return dishs;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int act;
        Table table;
        Dish[] dishs;
        Dish dish;
        Ordering[] orders = {};
        Dish d1 = new Dish("Карбонара", 350, "г", 150, "Паста", "Яичный желток");
        
        Dish d2 = new Dish("Оливье", 120, "г", 100, "Картошка", "Курица");
        Dish d3 = new Dish("Цезарь", 550, "г", 100, "Курица","Помидоры черри","Пармезае","Соус цезарь", "Салат","Сухарики");
        Menu menu1 = new Menu(d1, d3);
        Table[] tables = {};
        for (int i = 0; i < 5; i++) {
            tables[i] = new Table(Integer.toString(i));
        }
        boolean notEnd = true;
        while (notEnd) {
            System.out.println("Выберите действие");
            System.out.println("100 - Выход");
            System.out.println("0 - Новый заказ");
            System.out.println("1 - Посмотреть актуальное меню");
            System.out.println("2 - Посмотреть полностью меню");
            System.out.println("3 - Посмотреть информацию о заказе по столику");
            System.out.println("4 - Закрыть заказ");
            System.out.println("5 - Добавить блюдо в меню");
            System.out.println("6 - Удалить блюдо из меню");
            System.out.println("7 - Добавить блюда в заказ");
            System.out.println("8 - Добавить блюдо в стоп-лист");
            System.out.println("9 - Удалить блюдо из стоп-листа");
            System.out.println("10 - Принести блюдf");

            System.out.println("Введите номер действия");
            act = scanner.nextInt();

            Ordering order;
            switch (act) {
                case 10:
                    dishs = selectDishs(menu1, scanner);
                    table = selectTable(tables, scanner);
                    table.getOrdering().addServed(dishs);
                case 9:
                    menu1.printAllMenu();
                    dish = selectDish(menu1, scanner);
                    menu1.delDishFromStopList(dish);
                case 8:
                    menu1.printActualMenu();
                    dish = selectDish(menu1, scanner);
                    menu1.addDishInStopList(dish);
                    break;
                case 7:
                    dishs = selectDishs(menu1, scanner);
                    table = selectTable(tables, scanner);
                    table.getOrdering().addDishs(dishs);
                    break;
                case 6:
                    menu1.printAllMenu();
                    dish = selectDish(menu1, scanner);
                    menu1.delDish(dish);
                    break;

                case 5:
                    menu1.addDish(d2);
                    break;

                case 4:
                    table = selectTable(tables, scanner);
                    table.getOrdering().finalOrdering();
                    break;
                case 3:
                    table = selectTable(tables, scanner);
                    table.getOrdering().printInfo();
                    break;
                case 2:
                    menu1.printAllMenu();
                    break;
                case 1:
                    menu1.printActualMenu();
                    break;
                case 0:
                    printFreeTables(tables);
                    table = selectTable(tables, scanner);
                    order = table.newOrder();
                    dishs = selectDishs(menu1, scanner);
                    order.addDishs(dishs);
                    orders[orders.length] = order;
                    break;

                case 100: {// exit
                    notEnd = true;
                    break;
                }

            }

        }
    }

}
