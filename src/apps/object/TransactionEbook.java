
package apps.object;

public class TransactionEbook<A, B, C, D> {
    A name;
    B idEbook;
    C size;
    D format;

    public TransactionEbook(A name, B idEbook, C size, D format) {
        this.name = name;
        this.idEbook = idEbook;
        this.format = format;
        this.size = size;
    }

    //getter
    public A getName() {
        return name;
    }

    public B getIdEbook() {
        return idEbook;
    }

    public C getSize() {
        return size;
    }
    
    public D getFormat() {
        return format;
    }

    //setter
    public void setName(A name) {
        this.name = name;
    }

    public void setIdEbook(B idEbook) {
        this.idEbook = idEbook;
    }

    public void setSize(C size) {
        this.size = size;
    }

    public void setFormat(D format) {
        this.format = format;
    }

}
