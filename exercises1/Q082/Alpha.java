package Others.OCA.exercises1.Q082;

class Alpha {

    int ns;
    static int s;

    Alpha(int ns){
        if(s<ns){
            s = ns;
            this.ns = ns;
        }
    }


    void doPrint(){
        System.out.println("ns = " + ns + " s = " + s);
    }
}
