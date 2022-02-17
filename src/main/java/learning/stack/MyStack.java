package learning.stack;

public class MyStack {

  private int[] state;
  private int size = 0;

  public MyStack(int maxSize){
    state = new int[maxSize];
  }

  /**
   * Добавляет элемент в голову стека
   * @param element новый элемент для добавления
   */
  public void push(int element){
    state[size] = element;
    size = size + 1;
  }

  /**
   * Берет элемент из головы,
   * удаляет его из стека и возвращает из функции
   * @return последний добавленный элемент
   */
  public int pop(){
    if (size == 0) {
      throw new RuntimeException("Нельзя достать элемент из пустого стека");
    }

    int element = state[size - 1];
    size = size - 1;
    return element;
  }

}
