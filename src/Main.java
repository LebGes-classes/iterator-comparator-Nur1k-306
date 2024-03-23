public class Main {
    public static void main(String[] args) {
        CustomHashmap<String, Integer> hashmap = new CustomHashmap<>(); // Создание экземпляра хэш-таблицы типа <String, Integer>
        // Добавление элементов в хэш-таблицу
        hashmap.put("Иванов Иван", 2);
        hashmap.put("Петров Дима", 1);
        hashmap.put("Смирнов Егор", 3);
        hashmap.put("Волков Олег", 5);
        hashmap.put("Лебедев Макс", 4);

        // Вывод размера хэш-таблицы
        System.out.println("Size: " + hashmap.size());

        // Получение значения для заданного ключа
        System.out.println("Ключ у значения 'Смирнов Егор': " + hashmap.get("Смирнов Егор"));

        // Проверка наличия ключа и значения в хэш-таблице
        System.out.println("Иванов Иван: " + hashmap.containsKey("Иванов Иван"));
        System.out.println("Содержит значение 3: " + hashmap.containsValue(3));

        // Удаление элемента по ключу и вывод размера после удаления
        System.out.println("Удаляем ключ 'Лебедев Макс': ");
        hashmap.remove("Лебедев Макс");
        System.out.println("Размер после удаления: " + hashmap.size());

        //Сравниваем два размера двух хэшмапов
        CustomHashmap<String, Integer> hashmap2 = new CustomHashmap<>();

        hashmap2.put("Лебедев Иван", 4);

        System.out.println(hashmap.compareTo(hashmap2));

        Comparator<CustomHashmap<String, Integer>> c = new Comparator<>();

        System.out.println(c.compare(hashmap, hashmap2));

        System.out.println(hashmap.hashCode() + " " +  hashmap2.hashCode());
    }
}
