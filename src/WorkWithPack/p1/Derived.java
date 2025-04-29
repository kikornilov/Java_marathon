package WorkWithPack.p1;

class Derived extends Protection {
    Derived(){
        System.out.println ( "Koнcтpyктop производного класса") ;
        System.out.println ( "n = " + n);
        // Доступ только у класса Protection
        //System.out.println ( "n_p ri = "+ n_pri );
        System.out.println ( "n_pro = " + n_pro );
        System.out.println ("n_pub = " + n_pub);
    }
}