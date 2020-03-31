package id.dwichan.calc;

public class Hitung extends AbsHitung {

    private Double bil1, bil2;

    public Hitung(Double bil1, Double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public Double getTambah() {
        return bil1 + bil2;
    }

    public Double getKurang() {
        return bil1 - bil2;
    }

    public Double getKali() {
        return bil1 * bil2;
    }

    public Double getBagi() {
        return bil1 / bil2;
    }

}
