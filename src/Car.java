public class Car {
    private int id,AuthorNumber;

    public Car(int id, int authorNumber) {
        this.id = id;
        AuthorNumber = authorNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", AuthorNumber=" + AuthorNumber +
                '}';
    }
}
