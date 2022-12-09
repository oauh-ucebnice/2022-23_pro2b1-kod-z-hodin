import java.math.BigDecimal;

public class Oprava {
    private String rz;
    private BigDecimal cenaOpravy;

    public Oprava(String rz, BigDecimal cenaOpravy) {
        this.rz = rz;
        this.cenaOpravy = cenaOpravy;
    }

    public String getRz() {
        return rz;
    }

    public void setRz(String rz) {
        this.rz = rz;
    }

    public BigDecimal getCenaOpravy() {
        return cenaOpravy;
    }

    public void setCenaOpravy(BigDecimal cenaOpravy) {
        this.cenaOpravy = cenaOpravy;
    }
}
