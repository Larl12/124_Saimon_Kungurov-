public class Atm {
    private int curr_50;
    private int curr_100;
    private int curr_200;
    private int curr_500;
    private int curr_1000;
    private int curr_2000;
    private int curr_5000;

    public Atm(){
        this.curr_50=0;
        this.curr_100=0;
        this.curr_200=0;
        this.curr_500=0;
        this.curr_1000=0;
        this.curr_2000=0;
        this.curr_5000=0;
    }

    public int get_curr_50(){ return curr_50; }
    public int get_curr_100(){ return curr_100; }
    public int get_curr_200(){ return curr_200; }
    public int get_curr_500(){ return curr_500; }
    public int get_curr_1000(){ return curr_1000; }
    public int get_curr_2000(){ return curr_2000; }
    public int get_curr_5000(){ return curr_5000; }

    public void load(int upload_50, int upload_100, int upload_200, int upload_500, int upload_1000, int upload_2000, int upload_5000 ){
        this.curr_50=this.get_curr_50() + upload_50;
        this.curr_100=this.get_curr_100() + upload_100;
        this.curr_200=this.get_curr_200() + upload_200;
        this.curr_500=this.get_curr_500() + upload_500;
        this.curr_1000=this.get_curr_1000() + upload_1000;
        this.curr_2000=this.get_curr_2000() + upload_2000;
        this.curr_5000=this.get_curr_5000() + upload_5000;

    }

    public void give( int summ){

    }
}
