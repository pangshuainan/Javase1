package renlei;

public class xuesheng extends ren{
   private String zuowei;
   private String banji;
   private int id;
    private  String xueshengs ="学生";
private  String xingming;
    xuesheng(){

    }

    public xuesheng( String xingming,String xingbie, String zhiye,int CFshijian, String zuowei, int id){
         this.xingming=xingming;
         this.xingbie=xingbie;
         this.CFshijian=CFshijian;
         this.zuowei=zuowei;

         this.id=id;
    }

   public void TK(){
       System.out.println("在听课");
   }
      public void CF(){
          System.out.println("在吃饭");
      }
      public void YX(){
          System.out.println("在游戏");
      }

        public String getXueshengs(){
        return xueshengs;
        }

    public String getZuowei() {
        return zuowei;
    }

    public void setZuowei(String zuowei) {
        this.zuowei = zuowei;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setXueshengs(String xueshengs) {
        this.xueshengs = xueshengs;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }
}
