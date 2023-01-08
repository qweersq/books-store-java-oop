package apps.object;

public class Transaction<A, B, C, D, E, F> {
    A name;
    B author;
    C title;
    D price;
    E amount;
    F qty;

    public Transaction(A name, B author, C title, D price, E amount, F qty) {
        this.name = name;
        this.author = author;
        this.title = title;
        this.price = price;
        this.amount = amount;
        this.qty = qty;
    }

    //getter
    public A getName() {
        return name;
    }

    public B getAuthor() {
        return author;
    }

    public C getTitle() {
        return title;
    }

    public D getPrice() {
        return price;
    }

    public E getAmount() {
        return amount;
    }

    public F getQty() {
        return qty;
    }

}
