package WorkWithPack.p2;
import WorkWithPack.p1.Protection;

class OtherPackage {
    OtherPackage(){
        WorkWithPack.p1.Protection p = new Protection();
        System.out.println ( "Koнcтpyктop класса из другого пакета") ;
        // Только класс или пакет
        //System.out.println ( "n = " + n);
        // Доступ только у класса Protection
        //System.out.println ( "n_p ri = "+ n_pri );
        // Только класс, подкласс и пакет
        //System.out.println ( "n _pro = " + n_pro );
        System.out.println ("n pub = " + p.n_pub);
    }
}
