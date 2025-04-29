package WorkWithPack.p2;

class Protection2 extends WorkWithPack.p1.Protection {
    Protection2(){
        System.out.println ( "Koнcтpyктop производного класса из другого пакета") ;
        // Только класс или пакет
        //System.out.println ( "n = " + n);
        // Доступ только у класса Protection
        //System.out.println ( "n_p ri = "+ n_pri );
        System.out.println ( "n _pro = " + n_pro );
        System.out.println ("n pub = " + n_pub);
    }
}
