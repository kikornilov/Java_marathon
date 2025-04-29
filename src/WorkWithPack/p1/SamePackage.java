package WorkWithPack.p1;

class SamePackage{
    SamePackage(){
        Protection p = new Protection();
        System.out.println ( "Koнcтpyктop из того же пакета") ;
        System.out.println ( "n = " + p.n);
        // Доступ только у класса Protection
        //System.out.println ( "n_p ri = "+ n_pri );
        System.out.println ( "n_pro = " + p.n_pro );
        System.out.println ("n_pub = " + p.n_pub);
    }
}