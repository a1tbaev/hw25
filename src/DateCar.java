import java.math.BigDecimal;
import java.time.LocalDate;

public class DateCar {
    private LocalDate yearIssue;
    private String model, colour;
    private BigDecimal price;

    public DateCar(LocalDate yearIssue, String model, String colour, BigDecimal price) {
        this.yearIssue = yearIssue;
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DateCar{" +
                "yearIssue=" + yearIssue +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
