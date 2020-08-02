public class Main {

    public static void main(String[] args) {
        //class yapıları reference type olarak geçer.
        //CustomerManager customerManager=new CustomerManager(); //Bir class çağırma işlemi onu ifade eden yeni bir değişken üzerinden yapmıştır.
        // Bir üstteki kod başında CustomerManager veri tipleri gibi bellek yer oluşturulur.Camel casing olanıda customerManager düşünülebilir.
        CustomerManager customerManager; //Referans adresleri aşağıdaki atama ile eşitlemdiğinden bu şekilde de yazılabilir.
        CustomerManager customerManager2=new CustomerManager(); //Sürdürülebilir yazılım için new kullanmak önem arz etmekte ve yer kaplayacağı için dikkatli kullanılmalıdır.
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int sayi1=10; //Değer tip
        int sayi2=20; //Değer tip
        sayi2=sayi1; // Değer tip
        sayi1=30;
        System.out.println(sayi2);

        int [] sayilar1=new int[]{1,2,3};
        int [] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1; //Diziler referans tiptir. Bellek adres numarasını tutar ve o numara ile eşitlenir.
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
    }
}
