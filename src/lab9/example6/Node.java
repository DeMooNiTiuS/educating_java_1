package lab9.example6;

public class Node {     // КЛАСС - структура элемента списка

    public int value;   // значение

    public Node next;   // поле - ссылка (указатель) на следующий узел

    Node(int value, Node next){ //конструктор класса
        this.value = value;
        this.next = next;
    }
}
