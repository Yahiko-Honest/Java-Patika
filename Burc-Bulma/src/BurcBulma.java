import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int gun, ay;
        String burc="";
        boolean hata = false;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ay giriniz: ");
        ay = sc.nextInt();

        System.out.print("Gün giriniz: ");
        gun = sc.nextInt();
        
        if (ay == 1) {
            if (1 <= gun && gun<=31){
                if (gun < 22 ) {
                    burc="Oglak";
                } else {
                    burc="Kova";
                }
            }else {
                hata=true;
            }
        } else if (ay == 2) {
            if (1 <= gun && gun <= 28) {
                if (gun < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                hata = true;
            }
        } else if (ay == 3) {
            if (1 <= gun && gun <= 31) {
                if (gun < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                hata = true;
            }
        } else if (ay == 4) {
            if (1 <= gun && gun <= 31) {
                if (gun < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boga";
                }
            } else {
                hata = true;
            }
        } else if (ay == 5) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "Boga";
                } else {
                    burc = "İkizler";
                }
            } else {
                hata = true;
            }
        } else if (ay == 6) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengec";
                }
            } else {
                hata = true;
            }
        } else if (ay == 7) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Yengec";
                } else {
                    burc = "Aslan";
                }
            } else {
                hata = true;
            }
        } else if (ay == 8) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Basak";
                }
            } else {
                hata = true;
            }
        } else if (ay == 9) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Basak";
                } else {
                    burc = "Terazi";
                }
            } else {
                hata = true;
            }
        } else if (ay == 10) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                hata = true;
            }
        } else if (ay == 11) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                hata = true;
            }
        } else if (ay == 12) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oglak";
                }
            } else {
                hata = true;
            }
        }else {
            hata=true;
        }
        
        if (hata){
            System.out.println("Hatalı Değer Girdiniz.");
        }else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
