public class Figures {
    public double formula;

    public Figures(double formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return String.format("%.2f", formula);
    }
}
