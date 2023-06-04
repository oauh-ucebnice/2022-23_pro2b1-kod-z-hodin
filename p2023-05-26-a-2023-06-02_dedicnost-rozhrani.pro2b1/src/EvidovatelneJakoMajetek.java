import java.math.BigDecimal;

public interface EvidovatelneJakoMajetek {

    // Jdou veřejné atributy, ale my je většinou nechceme:
    // public BigDecimal price = BigDecimal.ZERO;

    public BigDecimal getCena();
}
