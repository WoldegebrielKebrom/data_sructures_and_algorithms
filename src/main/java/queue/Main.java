package queue;

public class Main {
   public static void main(String[] args) {
//      Intq q = new Intq(4);
//      q.enqueue(3);
//      q.enqueue(4);
//      q.enqueue(6);



//      System.out.println(q.dequeue());
//      System.out.println(q.dequeue());
//      System.out.println(q.dequeue());
//      System.out.println(q.dequeue());

//      q.showAll();

      Personq q = new Personq();
      q.enqueue(new Person("umair", "123"));
      q.enqueue(new Person("Ali", "321"));

      q.showAll();




   }
}
