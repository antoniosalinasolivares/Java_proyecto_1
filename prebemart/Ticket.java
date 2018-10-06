import java.util.ArrayList;

public class Ticket{
  public ArrayList<Producto> ticket;
  public int total;
  public Ticket(){
    this.ticket = new ArrayList<Producto>();
    this.total = 0;
  }
  public void add(Producto item){
    this.ticket.add(item);
    this.total += item.getPrecio();
  }
   public int end(){
     int total = this.total;
     this.ticket.clear();
     return total;
   }
   public void remove(int index){
     this.total -= ticket.get(index).getPrecio();
     this.ticket.remove(index);
   }
}
