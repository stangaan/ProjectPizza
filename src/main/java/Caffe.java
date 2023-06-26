import java.util.Objects;
import java.util.jar.Attributes;

public class Caffe {
    private String NameCaffe;
    private Integer QuantityCaffe;

    private  Integer PriceCaffe;

    public Caffe(String nameCaffe, Integer quantityCaffe, Integer priceCaffe) {
        NameCaffe = nameCaffe;
        QuantityCaffe = quantityCaffe;
        PriceCaffe = priceCaffe;
    }


    public String getNameCaffe() {
        return NameCaffe;
    }

    public void setNameCaffe(String nameCaffe) {
        NameCaffe = nameCaffe;
    }

    public Integer getQuantityCaffe() {
        return QuantityCaffe;
    }

    public void setQuantityCaffe(Integer quantityCaffe) {
        QuantityCaffe = quantityCaffe;
    }

    public Integer getPriceCaffe() {
        return PriceCaffe;
    }

    public void setPriceCaffe(Integer priceCaffe) {
        PriceCaffe = priceCaffe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caffe caffe = (Caffe) o;
        return Objects.equals(NameCaffe, caffe.NameCaffe) && Objects.equals(QuantityCaffe, caffe.QuantityCaffe) && Objects.equals(PriceCaffe, caffe.PriceCaffe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NameCaffe, QuantityCaffe, PriceCaffe);
    }
}
