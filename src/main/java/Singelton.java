public  class Singelton {

    private static Singelton app;

    private Singelton(){


    }
    public static Singelton getInstance(){
        if(null == app){
            app = new Singelton();

        }
        return app;
    }
}
