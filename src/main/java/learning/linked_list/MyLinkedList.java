package learning.linked_list;

public class MyLinkedList {

  public Element head = null;

  public void add(char c) {
    if (head == null) {
      head = new Element(c);
      return;
    }

    Element current = head;
    while (current.next != null) {
      current = current.next;
    }
    // current is a tail
    current.next = new Element(c);
  }

  @Override
  public String toString() {
    String result = "";
    Element current = head;
    while (current != null) {
      result = result + current.value;
      current = current.next;
    }
    return result;
  }

}

// HEAD == null;
// HEAD == Element{value = 'A', next = null}
// HEAD == Element{value = 'A', next = Element{value = 'B', next = null}}
//


