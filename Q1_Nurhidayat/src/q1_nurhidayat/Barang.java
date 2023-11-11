package q1_nurhidayat;

class Barang {
    protected String namaBarang;
    protected int jumlah;
    protected double hargaSatuan;
    protected double diskon;
    protected double hargaTotal;

    public Barang(String namaBarang, int jumlah, double hargaSatuan) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.diskon = 0;
        hitungHargaTotal();
    }

    protected void hitungHargaTotal() {
        if (jumlah > 10) {
            diskon = 0.02;
        }
        hargaTotal = (1 - diskon) * jumlah * hargaSatuan;
    }

    public void tampilkanData() {
        System.out.println();
        System.out.println("=====TERIMAKASIH ANDA SUDAH BERBELANJA=====");
        System.out.println("Anda sudah berbelanja " + namaBarang + " sejumlah " + jumlah + " dengan harga satuan Rp. " + hargaSatuan);
        System.out.println("Anda mendapatkan diskon " + (diskon * 100) + "%");
        System.out.println("Harga Total yang harus anda bayar adalah Rp. " + hargaTotal);
    }
}