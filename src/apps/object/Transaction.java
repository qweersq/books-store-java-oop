package apps.object;

public class Transaction<A, B, C, D> {
    A name;
    B idBook;
    C qty;
    D amount;

    public Transaction(A name, B idBook, C qty, D amount) {
        this.name = name;
        this.idBook = idBook;
        this.amount = amount;
        this.qty = qty;
    }

    //getter
    public A getName() {
        return name;
    }

    public B getIdBook() {
        return idBook;
    }

    public C getQty() {
        return qty;
    }
    
    public D getAmount() {
        return amount;
    }

    //setter
    public void setName(A name) {
        this.name = name;
    }

    public void setIdBook(B idBook) {
        this.idBook = idBook;
    }

    public void setQty(C qty) {
        this.qty = qty;
    }

    public void setAmount(D amount) {
        this.amount = amount;
    }
}
