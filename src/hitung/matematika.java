package hitung;

public class matematika {
    //membuat variabel
    private double bil1, bil2;
    
    //membuat constructor
    public matematika(double bil1, double bil2){
    this.bil1 = bil1;
    this.bil2 = bil2;
    }
    
    //membuat method setpenjumlahan
    double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    //membuat method setpengurangan
    double setPengurangan(){
        return bil1 - bil2;
    }
    
    //membuat method setperkalian
    double setPerkalian(){
        return bil1 * bil2;
    }
    
    //membuat method setpembagian
    double setPembagian(){
        return bil1 / bil2;
    }
}

